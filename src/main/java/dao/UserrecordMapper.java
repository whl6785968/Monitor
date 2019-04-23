package dao;

import java.util.List;
import model.Userrecord;
import model.UserrecordExample;
import org.apache.ibatis.annotations.Param;

public interface UserrecordMapper {
    int countByExample(UserrecordExample example);

    int deleteByExample(UserrecordExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(Userrecord record);

    int insertSelective(Userrecord record);

    List<Userrecord> selectByExample(UserrecordExample example);

    Userrecord selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") Userrecord record, @Param("example") UserrecordExample example);

    int updateByExample(@Param("record") Userrecord record, @Param("example") UserrecordExample example);

    int updateByPrimaryKeySelective(Userrecord record);

    int updateByPrimaryKey(Userrecord record);
}