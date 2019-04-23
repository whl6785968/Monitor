package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Indexos;
import model.IndexosExample;
import model.IndexosExample.Criteria;
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
		return "stationMonitor";
	}
	
	@RequestMapping("/showStationQuality")
	public String showStationQuality(String sid,Model model) {
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
