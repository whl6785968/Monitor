package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import dao.MuserMapper;
import dao.UserMapper;
import model.Muser;
import model.MuserExample;
import service.MuserService;
@Service
public class MuserServiceImpl implements MuserService{
	@Autowired
	private MuserMapper muserMapper;
	@Override
	public List<Muser> getAllMuser(MuserExample example) {
		// TODO Auto-generated method stub
		List<Muser> musers = muserMapper.selectByExample(example);
		return musers;
	}
	@Override
	public void inserMuser(Muser muser) {
		// TODO Auto-generated method stub
		muserMapper.insert(muser);
	}
	@Override
	public int getMuserCount(MuserExample example) {
		// TODO Auto-generated method stub
		int count = muserMapper.countByExample(example);
		return count;
	}

	public Integer deleteUser(String id) {
		// TODO Auto-generated method stub
		int i = muserMapper.deleteByPrimaryKey(id);
		if(i!=0)
		{
			return 1;
		}
		return 0;
	}
	@Override
	public Muser getMuser(String id) {
		// TODO Auto-generated method stub
		Muser muser = muserMapper.selectByPrimaryKey(id);
		return muser;
	}
	@Override
	public void updateUser(Muser muser) {
		// TODO Auto-generated method stub
		muserMapper.updateByPrimaryKeySelective(muser);
	}

}
