package service;

import java.util.List;

import model.Station;
import model.StationExample;

public interface MapService {
	List<Station> getStationInfo(StationExample example);
}
