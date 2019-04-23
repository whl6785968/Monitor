package service;

import java.util.List;

import model.RecentUser;
import model.User;
import model.UserDetailed;

public interface UserService {
	List<RecentUser> getRecentUser();
	User checkUser(String username);
	void addCredit(String username);
	User getUserById(Integer id);
	UserDetailed getUserDetailed(Integer userId);
	void updateImage(Integer Id,String url);
	int updateUser(UserDetailed ud);
	void insertUserDetailed(UserDetailed ud);
	List<User> getAllUser();
	int getUserCount();
	void settingUser(User user);
	void insertUser(User user);
}
