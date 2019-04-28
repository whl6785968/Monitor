package controller;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import model.District;
import model.DistrictExample;
import model.Indexos;
import model.IndexosExample;
import model.IndexosExample.Criteria;
import model.ProCityConnect;
import model.ProCityConnect2;
import model.Station;
import model.StationExample;
import service.IndexosService;
import service.MapService;

@Controller
public class MapMonitorController {
	@Autowired
	private MapService ms;
	@Autowired
	private IndexosService is;
	
	@RequestMapping("/stationMonitor")
	public String showstationMonitor(Model model) {
		StationExample example = new StationExample();
		List<Station> info = ms.getStationInfo(example);
		model.addAttribute("info", info);
		DistrictExample example2 = new DistrictExample();
		List<District> district = ms.getAllDistrict(example2);
		
		List<ProCityConnect> allPcc = new ArrayList<>();
		
		System.out.println(district.toString());
		for(District d : district)
		{
			ProCityConnect proCityConnect = new ProCityConnect();
			proCityConnect.setDid(d.getDid());
			proCityConnect.setDname(d.getDname());
			List<String> areas = new ArrayList<>();
			for(Station in :info)
			{
				if(in.getDid()==d.getDid())
				{
					areas.add(in.getLocation());
					proCityConnect.setAreas(areas);
					
				}
			}
			allPcc.add(proCityConnect);
			
		}
		model.addAttribute("pcc", allPcc);
		
		List<ProCityConnect2> apcc = ms.getPcc();
		for(ProCityConnect2 p: apcc)
		{
			for(Station s : p.getAreas())
			{
				System.out.println(s.getLocation());
			}
		}
		return "stationMonitor";
	}
	
	@RequestMapping("/showStationQuality")
	public String showStationQuality(String sid,Model model) {
		System.out.println("show Station Quality");
		IndexosExample example = new IndexosExample();
		Criteria criteria = example.createCriteria();
		sid = "00"+sid;
		System.out.println(sid);
		criteria.andIidEqualTo(sid);
		List<Indexos> indexos = is.getIndexList(example);
		model.addAttribute("index", indexos);
		System.out.println(indexos.toString());
		return "stationDetail";
	}
	
	
	
	@ResponseBody
	@RequestMapping("/getStationData")
	public HashMap<Object,Object> getStationData(@RequestParam(required=false,defaultValue="1")Integer page,Integer rows,Integer dist)
	{
		System.out.println("dist is"+ dist);
		StationExample example = new StationExample();
		HashMap<String,Integer> map = new HashMap<>();
		map.put("start", (page-1)*rows);
		map.put("end",rows);
		map.put("did", dist);
		Integer count = ms.getCount(example);
		List<Station> list2 = ms.getStationByPage(map);
		
		
		for(Station s : list2)
		{
			System.out.println(s.getLocation());
		}
		
		HashMap<Object,Object> map2 = new HashMap<>();
		map2.put("total", count);
		map2.put("rows", list2);
		return map2;
	}
}
