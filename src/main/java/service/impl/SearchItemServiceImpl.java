package service.impl;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.EquipmentMapper;
import dao.SearchDao;
import model.SearchItem;
import model.SearchResult;
import service.SearchItemService;
@Service
public class SearchItemServiceImpl implements SearchItemService {
	@Autowired
	private EquipmentMapper em;
	@Autowired
	private SolrServer solrServer;
	@Resource(name="searchDao")
	private SearchDao searchDao;
	@Override
	public Integer importItems() throws Exception {
		// TODO Auto-generated method stub
		List<SearchItem> itemList = em.getItemList();
		for(SearchItem item : itemList)
		{
			System.out.println(item.getEquiPic());
			SolrInputDocument document = new SolrInputDocument();
			document.addField("id", item.getEid());
			document.addField("ename", item.getEname());
			document.addField("eparam1", item.getEstate1());
			document.addField("epic", item.getEquiPic());
			solrServer.add(document);
		}
		solrServer.commit();
		
		return 1;
		
	}
	public SearchResult search(String preId,String postId,String queryString,int page,int rows) throws Exception{
		SolrQuery query = new SolrQuery();
		query.setQuery(queryString);
		query.setStart((page-1)*rows);
		query.setRows(rows);
		query.set("df","ename");
		query.setHighlight(true);
		query.addHighlightField("ename");
		query.setHighlightSimplePre("<em style=\"color:red\">");
		query.setHighlightSimplePost("</em>");
		SearchResult result = searchDao.search(query);
		//计算总页数
		long recordCount = result.getRecordCount();
		long pageCount = recordCount / rows;
		if (recordCount % rows > 0) {
			pageCount++;
		}
		result.setPageCount(pageCount);
		return result;
	}
	
	

}
