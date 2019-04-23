package service;

import model.SearchResult;

public interface SearchItemService {
	Integer importItems() throws Exception;
	SearchResult search(String preId,String postId,String queryString,int page,int rows) throws Exception;
}
