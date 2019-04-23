package dao;

import java.util.List;

import model.Equipment;
import model.EquipmentExample;
import model.SearchItem;

import org.apache.ibatis.annotations.Param;

public interface EquipmentMapper {
    int countByExample(EquipmentExample example);

    int deleteByExample(EquipmentExample example);

    int deleteByPrimaryKey(Long eid);

    int insert(Equipment record);

    int insertSelective(Equipment record);

    List<Equipment> selectByExample(EquipmentExample example);

    Equipment selectByPrimaryKey(Long eid);

    int updateByExampleSelective(@Param("record") Equipment record, @Param("example") EquipmentExample example);

    int updateByExample(@Param("record") Equipment record, @Param("example") EquipmentExample example);

    int updateByPrimaryKeySelective(Equipment record);

    int updateByPrimaryKey(Equipment record);
    
    List<SearchItem> getItemList();
}