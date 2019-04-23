package service;

import java.util.List;

import model.Indexos;
import model.IndexosExample;

public interface IndexosService {
	List<Indexos> getIndexList(IndexosExample example);
}
