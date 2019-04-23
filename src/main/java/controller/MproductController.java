package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Mproduct;
import model.MproductExample;
import model.ResultMap;
import service.MproductService;

@Controller
public class MproductController {
	@Autowired
	private MproductService mps;
	@ResponseBody
	@RequestMapping(value="/queryAllPro")
	public ResultMap<List<Mproduct>> queryAll()
	{
		MproductExample example = new MproductExample();
		List<Mproduct> mproducts = mps.getAllProduct(example);
		int count = mps.getCount(example);
		
		for(Mproduct mp : mproducts)
		{
			System.out.println(mp.getPname());
		}
		return new ResultMap<>("  ",mproducts,0,count);
	}
	@ResponseBody
	@RequestMapping(value="/getAllMproduct")
	public List<Mproduct> getAllMproduct()
	{
		MproductExample example = new MproductExample();
		List<Mproduct> allProduct = mps.getAllProduct(example);
		
		return allProduct;
		
	}
}
