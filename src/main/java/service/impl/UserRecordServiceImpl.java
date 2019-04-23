package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserrecordMapper;
import model.Userrecord;
import service.UserRecordService;
@Service
public class UserRecordServiceImpl implements UserRecordService{

	@Autowired
	private UserrecordMapper um;
	@Override
	public Userrecord getUserRecord(Integer uid) {
		// TODO Auto-generated method stub
		Userrecord userrecord = um.selectByPrimaryKey(uid);
		return userrecord;
	}
	@Override
	public void InsertIdsRecord(Userrecord record) {
		// TODO Auto-generated method stub
		um.insert(record);
		
	}
	@Override
	public void updateUserRecord(Userrecord record) {
		// TODO Auto-generated method stub
		um.updateByPrimaryKey(record);
		
	}

}
