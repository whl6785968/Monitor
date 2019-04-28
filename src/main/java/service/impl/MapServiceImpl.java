package service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.DistrictMapper;
import dao.StationMapper;
import model.District;
import model.DistrictExample;
import model.ProCityConnect;
import model.ProCityConnect2;
import model.Station;
import model.StationExample;
import service.MapService;
@Service
public class MapServiceImpl implements MapService{
	@Autowired
	private StationMapper sm;
	
	@Autowired
	private DistrictMapper dm;
	@Override
	public List<Station> getStationInfo(StationExample example) {
		// TODO Auto-generated method stub
		List<Station> stations = sm.selectByExample(example);
		return stations;
	}
	@Override
	public List<District> getAllDistrict(DistrictExample example) {
		// TODO Auto-generated method stub
		List<District> list = dm.selectByExample(example);
		return list;
	}
	@Override
	public List<ProCityConnect> getAllPCC() {
		// TODO Auto-generated method stub
		List<ProCityConnect> allPCC = dm.selectAllPCC();
		return allPCC;
	}
	@Override
	public List<ProCityConnect2> getPcc() {
		// TODO Auto-generated method stub
		List<ProCityConnect2> aPcc = dm.getAPcc();
		return aPcc;
	}
	@Override
	public int insertStation(Station station) {
		// TODO Auto-generated method stub
		int i = sm.insert(station);
		return i;
	}
	@Override
	public List<Station> getStationByPage(HashMap<String, Integer> map) {
		// TODO Auto-generated method stub
		List<Station> list = sm.getStationByPage(map);
		return list;
	}
	@Override
	public Integer getCount(StationExample example) {
		// TODO Auto-generated method stub
		int i = sm.countByExample(example);
		return i;
	}
	@Override
	public Station getStationBySid(String sid) {
		// TODO Auto-generated method stub
		Station station = sm.selectByPrimaryKey(sid);
		return station;
	}
	@Override
	public void updataStation(Station station) {
		// TODO Auto-generated method stub
		sm.updateByPrimaryKey(station);
	}
	@Override
	public void deleteStation(String sid) {
		// TODO Auto-generated method stub
		sm.deleteByPrimaryKey(sid);
		
	}
	
	

}
