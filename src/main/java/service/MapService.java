package service;

import java.util.List;

import model.District;
import model.DistrictExample;
import model.ProCityConnect;
import model.Station;
import model.StationExample;

public interface MapService {
	List<Station> getStationInfo(StationExample example);
	List<District> getAllDistrict(DistrictExample example);
	List<ProCityConnect> getAllPCC();
}
