package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.StationMapper;
import model.Station;
import model.StationExample;
import service.MapService;
@Service
public class MapServiceImpl implements MapService{
	@Autowired
	private StationMapper sm;
	@Override
	public List<Station> getStationInfo(StationExample example) {
		// TODO Auto-generated method stub
		List<Station> stations = sm.selectByExample(example);
		return stations;
	}

}
