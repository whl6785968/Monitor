package dao;

import java.util.HashMap;
import java.util.List;
import model.Indexos;
import model.IndexosExample;
import org.apache.ibatis.annotations.Param;

public interface IndexosMapper {
    int countByExample(IndexosExample example);

    int deleteByExample(IndexosExample example);

    int insert(Indexos record);

    int insertSelective(Indexos record);

    List<Indexos> selectByExample(IndexosExample example);

    int updateByExampleSelective(@Param("record") Indexos record, @Param("example") IndexosExample example);

    int updateByExample(@Param("record") Indexos record, @Param("example") IndexosExample example);
    
    List<Indexos> getDetailDataByCond(HashMap<String,Object> map);
}