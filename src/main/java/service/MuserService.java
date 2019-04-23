package service;

import java.util.List;

import model.Muser;
import model.MuserExample;

public interface MuserService {
	List<Muser> getAllMuser(MuserExample example);
	void inserMuser(Muser muser);
	int getMuserCount(MuserExample example);
	Integer deleteUser(String id);
	Muser getMuser(String id);
	void updateUser(Muser muser);
}
