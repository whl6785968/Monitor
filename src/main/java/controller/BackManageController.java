package controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Indexos;
import model.IndexosExample;
import model.Station;
import model.StationExample;
import model.StationExample.Criteria;
import model.TaotaoResult;
import service.IndexosService;
import service.MapService;

@Controller
public class BackManageController {
	@Autowired
	private MapService ms;
	@Autowired
	private IndexosService is;
	@RequestMapping("/backManage")
	public String showBackManage()
	{
		return "backManage";
	}
	
	@RequestMapping("/showStaionListPage")
	public String showStaionListPage()
	{
		return "stationList"; 
	}
	@ResponseBody
	@RequestMapping("/insertStation")
	public TaotaoResult insertStation(String sid,Integer did,String location,String charge,Integer slevel,
			float longtitude,float latitude)
	{
		
		Station station = new Station();
		station.setSid(sid);
		station.setDid(did);
		station.setLocation(location);
		station.setCharge(charge);
		station.setSlevel(slevel);
		station.setLongtitude(longtitude);
		station.setLatitude(latitude);
		int i = ms.insertStation(station);
		return TaotaoResult.ok();
		
	}
	
	@ResponseBody
	@RequestMapping("/editStation")
	public TaotaoResult editStation(String sid,Integer did,String location,String charge,Integer slevel,
			float longtitude,float latitude)
	{
		Station station = ms.getStationBySid(sid);
		station.setDid(did);
		station.setLocation(location);
		station.setCharge(charge);
		station.setSlevel(slevel);
		station.setLongtitude(longtitude);
		station.setLatitude(latitude);
		ms.updataStation(station);
		
		return TaotaoResult.ok();
		
	}
	
	@ResponseBody
	@RequestMapping("/removeInfo")
	public TaotaoResult removeStation(String sid)
	{
		ms.deleteStation(sid);
		return TaotaoResult.ok();
	}
	@ResponseBody
	@RequestMapping("/getDetailData")
	public HashMap<Object,Object> getDetailData(@RequestParam(required=false,defaultValue="1")Integer page,Integer rows,
			String from,String to,Integer op)
	{
		HashMap<String,Object> map = new HashMap<String,Object>();
		if((from != null&& from != ""))
		{
		/*	SimpleDateFormat format = new SimpleDateFormat();
			format.applyPattern("yyyy-MM-dd");
			String f = format.format(from);
			String t = format.format(to);*/
			String[] froms = from.split("/");
			String f = froms[2]+"-"+froms[0]+"-"+froms[1];
			System.out.println("f is "+f);
			map.put("from", f);
			
		}
		if(to != null && to != "")
		{
			String[] tos = to.split("/");
			String t = tos[2]+"-"+tos[0]+"-"+tos[1];
			map.put("to", t);
		}
		if(op != null && op != 0)
		{
			map.put("op", op);
		}
		
		
		map.put("start", (page-1)*rows);
		map.put("end", rows);
	
		IndexosExample example = new IndexosExample();
		int count = is.getCount(example);
		
		List<Indexos> list = is.getListByCond(map);
		
		/*for(Indexos i : list)
		{
			System.out.println(i.getIid());
			System.out.println("count is "+ count);
		}*/
		HashMap<Object,Object> map2 = new HashMap<Object,Object>();
		map2.put("total", count);
		map2.put("rows", list);
		return map2;
	}
	
	@RequestMapping("/showStaionDetailPage")
	public String showStaionDetailPage()
	{
		return "stationDataQuery";
	}
	
}
