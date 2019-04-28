package service;

import java.util.HashMap;
import java.util.List;

import model.District;
import model.DistrictExample;
import model.ProCityConnect;
import model.ProCityConnect2;
import model.Station;
import model.StationExample;

public interface MapService {
	List<Station> getStationInfo(StationExample example);
	List<District> getAllDistrict(DistrictExample example);
	List<ProCityConnect> getAllPCC();
	List<ProCityConnect2> getPcc();
	int insertStation(Station station);
	List<Station> getStationByPage(HashMap<String,Integer> map);
	Integer getCount(StationExample example);
	Station getStationBySid(String sid);
	void updataStation(Station station);
	
	void deleteStation(String sid);
}
