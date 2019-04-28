package controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Station;
import model.StationExample;
import model.StationExample.Criteria;
import model.TaotaoResult;
import service.MapService;

@Controller
public class BackManageController {
	@Autowired
	private MapService ms;
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
	
	
}
