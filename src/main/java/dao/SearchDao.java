package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.SearchItem;
import model.SearchResult;

@Repository(value="searchDao")
public class SearchDao {
	@Autowired
	private SolrServer solrServer;
	
	public SearchResult search(SolrQuery query) throws Exception
	{
		//根据query对象查询索引库
		QueryResponse reponse = solrServer.query(query);
		//获取商品列表
		SolrDocumentList results = reponse.getResults();
		List<SearchItem> itemList = new ArrayList<>();
		for(SolrDocument document : results)
		{
			SearchItem item = new SearchItem();
			item.setId((String) document.get("id"));
			item.setEstate1((String)document.get("eparam1"));
			item.setEquiPic((String)document.get("epic"));
			//获取高亮对象
			Map<String, Map<String, List<String>>> highlighting = reponse.getHighlighting();
			//选定需要高亮显示的内容
			List<String> list = highlighting.get(document.get("id")).get("ename");
			String e_name="";
			if(list !=null && list.size()>0)
			{
				e_name = list.get(0);
			}
			else
			{
				e_name = (String)document.get("ename");
			}
			item.setEname(e_name);
			itemList.add(item);
		}
		SearchResult searchResult = new SearchResult();
		searchResult.setItemList(itemList);
		searchResult.setRecordCount(results.getNumFound());
		return searchResult;
	}
}
