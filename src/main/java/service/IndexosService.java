package service;

import java.util.HashMap;
import java.util.List;

import model.Indexos;
import model.IndexosExample;

public interface IndexosService {
	List<Indexos> getIndexList(IndexosExample example);
	int getCount(IndexosExample example);
	List<Indexos> getListByCond(HashMap<String,Object> map);
}
