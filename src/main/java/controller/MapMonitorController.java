package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Station;
import model.StationExample;
import service.MapService;

@Controller
public class MapMonitorController {
	@Autowired
	private MapService ms;
	@RequestMapping("/stationMonitor")
	public String showstationMonitor(Model model) {
		StationExample example = new StationExample();
		List<Station> info = ms.getStationInfo(example);
		model.addAttribute("info", info);
		return "stationMonitor";
	}
}
