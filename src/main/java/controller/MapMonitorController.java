package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import model.District;
import model.DistrictExample;
import model.Indexos;
import model.IndexosExample;
import model.IndexosExample.Criteria;
import model.ProCityConnect;
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
		
		for(ProCityConnect pcc : allPcc)
		{
			System.out.println(pcc.getDname()+":"+pcc.getDid()+":"+pcc.getAreas().toString());
		}
		model.addAttribute("pcc", allPcc);
		/*List<ProCityConnect> allPCC = ms.getAllPCC();
		for(ProCityConnect pcc : allPCC)
		{
			System.out.println(pcc.getDid()+":"+pcc.getDname()+":"+pcc.getAreas());
		}*/
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
	
	
}
