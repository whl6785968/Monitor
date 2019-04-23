package dao;

import java.util.List;



import org.apache.ibatis.annotations.Param;
import model.Muser;
import model.MuserExample;

public interface MuserMapper {
    int countByExample(MuserExample example);

    int deleteByExample(MuserExample example);

    int deleteByPrimaryKey(String id);

    int insert(Muser record);

    int insertSelective(Muser record);

    List<Muser> selectByExample(MuserExample example);

    Muser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Muser record, @Param("example") MuserExample example);

    int updateByExample(@Param("record") Muser record, @Param("example") MuserExample example);

    int updateByPrimaryKeySelective(Muser record);

    int updateByPrimaryKey(Muser record);
}