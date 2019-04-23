package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserDetailedMapper;
import dao.UserMapper;
import model.RecentUser;
import model.User;
import model.UserDetailed;
import service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDetailedMapper udm;
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<RecentUser> getRecentUser() {
		// TODO Auto-generated method stub
		
		List<RecentUser> recentUserData = udm.RecentUserData();
		if(recentUserData!=null && recentUserData.size()>0)
		{
			return recentUserData;
		}
		return null;
		
	}
	public User checkUser(String username)
	{
		User user = userMapper.selectByUsername(username);
		return user;
	}
	@Override
	public void addCredit(String username) {
		// TODO Auto-generated method stub
		User user = userMapper.selectByUsername(username);
		user.setCredit(user.getCredit()+5);
	}
	@Override
	public User getUserById(Integer id) {
		// TODO Auto-generated method stub
		User user = userMapper.selectByPrimaryKey(id);
		return user;
	}
	@Override
	public UserDetailed getUserDetailed(Integer userId) {
		// TODO Auto-generated method stub
		UserDetailed userDetailed = udm.selectByPrimaryKey(userId);
		return userDetailed;
	}
	@Override
	public void updateImage(Integer Id,String url) {
		// TODO Auto-generated method stub
		UserDetailed userDetailed = new UserDetailed();
		System.out.println(url);
		userDetailed.setUserId(Id);
		userDetailed.setImagePath(url);
		udm.updateByPrimaryKeySelective(userDetailed);
	}
	@Override
	public int updateUser(UserDetailed ud) {
		// TODO Auto-generated method stub
		int i = udm.updateByPrimaryKey(ud);
		return i;
	}
	@Override
	public void insertUserDetailed(UserDetailed ud) {
		// TODO Auto-generated method stub
		udm.insert(ud);
	}
	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		List<User> allUser = userMapper.getAllUser();
		return allUser;
	}
	@Override
	public int getUserCount() {
		// TODO Auto-generated method stub
		int userCount = userMapper.getUserCount();
		return userCount;
	}
	@Override
	public void settingUser(User user) {
		// TODO Auto-generated method stub
		userMapper.updateByPrimaryKey(user);
	}
	@Override
	public void insertUser(User user) {
		// TODO Auto-generated method stub
		userMapper.insert(user);
	}

}
