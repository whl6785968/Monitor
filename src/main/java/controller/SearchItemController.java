package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import model.SearchResult;
import service.SearchItemService;

@Controller
public class SearchItemController {
	@Autowired
	private SearchItemService ss;
	
	@ResponseBody
	@RequestMapping("/importIndex")
	public Integer importIndex() throws Exception {
		System.out.println("你好哈");
		Integer i = ss.importItems();
		return i;
	}
	
	@RequestMapping("/search")
	public String search(@RequestParam("q")String queryString,@RequestParam(defaultValue="1")Integer page,
			String preId,String postId,Model model) throws Exception
	{
		System.out.println("search......");
	
		queryString = new String(queryString.getBytes("ISO-8859-1"),"utf-8");
		System.out.println("q is"+queryString);
		SearchResult result = ss.search(preId,postId,queryString, page, 10);
		model.addAttribute("query", queryString);
		model.addAttribute("totalPages",result.getPageCount());
		model.addAttribute("itemList", result.getItemList());
		model.addAttribute("page", page);
		return "search";
	}
}
