package service;

import model.Userrecord;

public interface UserRecordService {
	Userrecord getUserRecord(Integer uid);
	void InsertIdsRecord(Userrecord record);
	void updateUserRecord(Userrecord record);
	
}
