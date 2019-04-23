package dao;

import java.util.List;

import model.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectByUsername(String username);

    int findUserTotalNum();
    
    List<User> getAllUser();
    
    int getUserCount();

}