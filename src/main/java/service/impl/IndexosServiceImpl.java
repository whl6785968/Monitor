package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.IndexosMapper;
import model.Indexos;
import model.IndexosExample;
import service.IndexosService;
@Service
public class IndexosServiceImpl implements IndexosService{
	@Autowired
	private IndexosMapper im;

	@Override
	public List<Indexos> getIndexList(IndexosExample example) 
	{
		List<Indexos> list = im.selectByExample(example);
		return list;
	}
	
	
}
