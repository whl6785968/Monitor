package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.MproductMapper;
import model.Mproduct;
import model.MproductExample;
import service.MproductService;

@Service
public class MproductServiceImpl implements MproductService{
	@Autowired
	private MproductMapper pm;
	@Override
	public List<Mproduct> getAllProduct(MproductExample example) {
		// TODO Auto-generated method stub
		List<Mproduct> mproducts = pm.selectByExample(example);
		return mproducts;
	}
	@Override
	public Integer getCount(MproductExample example) {
		// TODO Auto-generated method stub
		int i = pm.countByExample(example);
		
		return i;
	}
	
}
