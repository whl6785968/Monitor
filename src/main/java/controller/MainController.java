package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Equipment;
import model.EquipmentExample;
import model.EquipmentExample.Criteria;
import service.EquipmentService;

@Controller
public class MainController {
	@Autowired
	private EquipmentService es;
	@RequestMapping("/showMainDetail")
	public String getMainDetail(HttpServletRequest request)
	{
		System.out.println("我已经被访问了");
		EquipmentExample example = new EquipmentExample();
		Criteria criteria = example.createCriteria();
		criteria.andEstate1EqualTo("0");
		List<Equipment> errEquipment = es.getAllEquipment(example);
		System.out.println("错误设备"+errEquipment);
		request.getSession().setAttribute("errEquip",errEquipment);
		Integer errCount = es.getCount(example);
		request.getSession().setAttribute("errCount", errCount);
		
		EquipmentExample example2 = new EquipmentExample();
		Criteria criteria2 = example2.createCriteria();
		criteria2.andEstate1EqualTo("1");
		List<Equipment> normlEquip = es.getAllEquipment(example2);
		request.getSession().setAttribute("normlEquip",normlEquip);
		Integer norCount = es.getCount(example2);
		request.getSession().setAttribute("norCount",norCount);
		return "main";
	}

}
