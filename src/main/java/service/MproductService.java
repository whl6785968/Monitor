package service;

import java.util.List;

import model.Mproduct;
import model.MproductExample;

public interface MproductService {
	List<Mproduct> getAllProduct(MproductExample example);
	Integer getCount(MproductExample example);
}
