package controller;

import java.util.Arrays;

import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import model.Equipment;
import model.EquipmentExample;
import model.User;
import model.Userrecord;
import service.EquipmentService;
import service.UserRecordService;
import util.CookieUtils;

@Controller
public class EquipmentController {
	@Autowired
	private UserRecordService urs;
	@Autowired
	private EquipmentService es;
	@RequestMapping("/showEquipment")
	public ModelAndView showEquipment(Model model,@RequestParam(required=false,defaultValue="1") Integer page) {
		int PageSize = 4;
		PageHelper.startPage(page, PageSize);
		EquipmentExample example = new EquipmentExample();
		List<Equipment> allEquipment = es.getAllEquipment(example);
		PageInfo<Equipment> pageInfo = new PageInfo<>(allEquipment);
		
		/*model.addAttribute("list", allEquipment);*/
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject(pageInfo);
		modelAndView.setViewName("equipment");
		return modelAndView;
//		return "equipment";
	}
	
	@RequestMapping("/showEquipDetailed")
	public String showEquipDetailed(Long eid,Model model,HttpServletRequest request,HttpServletResponse response) {
		User user = (User) request.getSession().getAttribute("user");
		Integer uid = user.getUserId();
		
		Userrecord userRecord = null;
		String id = eid.toString();
		Equipment equipment = es.getEquipment(eid,uid);
		String equipPic = equipment.getEquipic();
		
		String ids = "";
		String equipPics="";
		userRecord=urs.getUserRecord(uid);
		
		if(userRecord==null)
		{
			userRecord = new Userrecord();
			ids=id;
			equipPics= equipment.getEquipic();
			userRecord.setUid(uid);
			userRecord.setIdsrecord(ids);
			userRecord.setPicrecord(equipPics);
			urs.InsertIdsRecord(userRecord);
			//1-1-pic1
		}
		else
		{
			ids = userRecord.getIdsrecord();
			String[] idsArr = ids.split("-");
			List<String> IdsAsList = Arrays.asList(idsArr);
			LinkedList<String> Idslist = new LinkedList<>(IdsAsList);
			if(Idslist.contains(id))
			{
				Idslist.remove(id);
				Idslist.addFirst(id);	
			}
			else
			{
				if(Idslist.size()<5)
				{
					Idslist.addFirst(id);
				}
				else
				{
					Idslist.removeLast();
					Idslist.addFirst(id);
					
				}
			}
			ids ="";
			for(String s : Idslist)
			{
				ids+=(s+"-");
			}
			ids = ids.substring(0, ids.length()-1);
			System.out.println("after ids is"+ids);
			
			
			//照片的记录设置
			equipPics = userRecord.getPicrecord();
			/*equipPics = ec.getValue();*/
			System.out.println("before is "+equipPics);
			String[] ecs = equipPics.split("-");
			List<String> PicAsList = Arrays.asList(ecs);
			LinkedList<String> list = new LinkedList<String>(PicAsList);
			if(list.contains(equipPic)) {
				list.remove(equipPic);
				list.addFirst(equipPic);
			}
			else
			{
				if(list.size()<5)
				{
					list.addFirst(equipPic);
				}
				else
				{
					list.removeLast();
					list.addFirst(equipPic);
				}
			}
			equipPics = "";
			for(String e : list)
			{
				equipPics+=e+"-";
			}
			equipPics = equipPics.substring(0,equipPics.length()-1 );
			
			userRecord.setUid(uid);
			userRecord.setIdsrecord(ids);
			userRecord.setPicrecord(equipPics);
			
			urs.updateUserRecord(userRecord);
			
		}
		model.addAttribute("equip", equipment);
		return "equipmentDetail";
	}
	@ResponseBody
	@RequestMapping(value="/errorNotice",method=RequestMethod.POST)
	public boolean errorNotice(@RequestParam("eid") Long eid) {
		System.out.println("errorNotice"+eid);
		Equipment equipment = es.getEquipment(eid,null);
		equipment.setEstate1("0");
		es.updateEquipment(equipment);
		return true;
	}
	
}
