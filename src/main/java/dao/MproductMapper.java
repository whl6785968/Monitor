package dao;

import java.util.List;
import model.Mproduct;
import model.MproductExample;
import org.apache.ibatis.annotations.Param;

public interface MproductMapper {
    int countByExample(MproductExample example);

    int deleteByExample(MproductExample example);

    int deleteByPrimaryKey(String pid);

    int insert(Mproduct record);

    int insertSelective(Mproduct record);

    List<Mproduct> selectByExample(MproductExample example);

    Mproduct selectByPrimaryKey(String pid);

    int updateByExampleSelective(@Param("record") Mproduct record, @Param("example") MproductExample example);

    int updateByExample(@Param("record") Mproduct record, @Param("example") MproductExample example);

    int updateByPrimaryKeySelective(Mproduct record);

    int updateByPrimaryKey(Mproduct record);
}