package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Dt;
import model.DtExample;
import model.Equipment;
import model.EquipmentExample;
import service.EquipmentService;

@Controller
public class DataAndChartController {
	@Autowired
	private EquipmentService es;
	public SqlQuery sq;
	@RequestMapping("/showDynamicChart")
	public String showDynamicChart() {
		return "dynamicChart";
	}
	
	@ResponseBody
	@RequestMapping(value="/getDynamicChart",method= RequestMethod.POST)
	public List<Equipment> getDynamicChart(String id,HttpServletRequest request) throws InterruptedException {
//		System.out.println(id);
		final HttpSession session = request.getSession();
		List<Equipment> allEquipment;
		List result = new ArrayList<>();
		while(true) {
			Thread.sleep(2000);
			EquipmentExample example = new EquipmentExample();
			allEquipment = es.getAllEquipment(example);
			Integer l = allEquipment.size();
			session.setAttribute("i", 1);
			if(session.getAttribute("equ")==null&&session.getAttribute("length")==null) {
				System.out.println("init");
				System.out.println(session.getAttribute("i"));
				session.setAttribute("length", l);
				session.setAttribute("equ", allEquipment);
				return allEquipment;
			}
			if(l!=session.getAttribute("length")) {
				System.out.println("次数是"+session.getAttribute("i")+1);
				System.out.println(session.getAttribute("length"));
				session.setAttribute("length", l);
				System.out.println(l);
				List<Equipment> oldList = (List<Equipment>) session.getAttribute("equ");
				session.setAttribute("equ", allEquipment);
				if(oldList!=null)
				{
					allEquipment.removeAll(oldList);
					System.out.println(allEquipment);
					return allEquipment;
				}
			}
		}
	}
	@ResponseBody
	@RequestMapping(value="/getDpChart",method=RequestMethod.POST)
	public List<Dt> getDt(String id,HttpServletRequest request) throws InterruptedException{
		final HttpSession session = request.getSession();
		List<Dt> allDt;
		while(true)
		{
			Thread.sleep(2000);
			DtExample example = new DtExample();
			allDt = es.getAllDt(example);
			Integer ld = allDt.size();
			if(session.getAttribute("ld")==null&&session.getAttribute("dt")==null)
			{
				session.setAttribute("ld", ld);
				session.setAttribute("dt", allDt);
				return allDt;
			}
			if(ld != session.getAttribute("ld"))
			{
				session.setAttribute("ld", ld);
				List<Dt> oldList = (List<Dt>) session.getAttribute("dt");
				session.setAttribute("dt", allDt);
				/*if(oldList!=null)
				{
					allDt.removeAll(oldList);
					return allDt;
				}*/
				return allDt;
			}
		}
	
	
	}
	
	@ResponseBody
	@RequestMapping(value="/getDetailChart",method=RequestMethod.POST)
	public List<Dt> getDetailChart(String id,String x,HttpServletRequest request) throws InterruptedException{
		final HttpSession session = request.getSession();
		List<Dt> allDt;
		System.out.println("我是x"+x);
		if(x.equals("1"))
		{
			System.out.println("我是2，不是1");
			if(session.getAttribute("ld1")!=null)
			{
				session.setAttribute("ld1", null);
			}
		}
		while(true)
		{
			Thread.sleep(2000);
			DtExample example = new DtExample();
			allDt = es.getAllDt(example);
			Integer ld = allDt.size();
			if(session.getAttribute("ld1")==null&&session.getAttribute("dt1")==null)
			{
				session.setAttribute("ld1", ld);
				session.setAttribute("dt1", allDt);
				return allDt;
			}
			if(ld != session.getAttribute("ld1"))
			{
				session.setAttribute("ld1", ld);
				session.setAttribute("dt1", allDt);
				return allDt;
			}
		}
	
	
	}
	class SqlQuery{
		private boolean isopen = false;
		public List<String> name = new ArrayList<String>();
		public List<String> eparam = new ArrayList<String>();
		public List<String> loding = new ArrayList<String>();
		public SqlQuery() {
			this.isopen = false;
		}
		public boolean isopen() {
			return isopen;
		}
		public void setOpen(boolean open) {
			isopen = open;
		}
		
	}
	
	
}
