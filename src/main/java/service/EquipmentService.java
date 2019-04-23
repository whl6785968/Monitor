package service;

import java.util.List;

import javax.naming.directory.SearchResult;

import model.Dt;
import model.DtExample;
import model.Equipment;
import model.EquipmentExample;

public interface EquipmentService {
	List<Equipment> getAllEquipment(EquipmentExample examle);
	Equipment getEquipment(Long eid,Integer uid);
	void updateEquipment(Equipment equipment);
//	int importIndex();
	List<Dt> getAllDt(DtExample example);
	Equipment getSingleEquipment(Long id);
	Integer getCount(EquipmentExample example);
	
}
