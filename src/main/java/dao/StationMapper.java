package dao;

import java.util.HashMap;
import java.util.List;
import model.Station;
import model.StationExample;
import org.apache.ibatis.annotations.Param;

public interface StationMapper {
    int countByExample(StationExample example);

    int deleteByExample(StationExample example);

    int deleteByPrimaryKey(String sid);

    int insert(Station record);

    int insertSelective(Station record);

    List<Station> selectByExample(StationExample example);

    Station selectByPrimaryKey(String sid);

    int updateByExampleSelective(@Param("record") Station record, @Param("example") StationExample example);

    int updateByExample(@Param("record") Station record, @Param("example") StationExample example);

    int updateByPrimaryKeySelective(Station record);

    int updateByPrimaryKey(Station record);
    
    List<Station> getStationByPage(HashMap<String, Integer> map);
}