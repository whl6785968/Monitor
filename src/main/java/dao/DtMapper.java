package dao;

import java.util.List;
import model.Dt;
import model.DtExample;
import org.apache.ibatis.annotations.Param;

public interface DtMapper {
    int countByExample(DtExample example);

    int deleteByExample(DtExample example);

    int insert(Dt record);

    int insertSelective(Dt record);

    List<Dt> selectByExample(DtExample example);

    int updateByExampleSelective(@Param("record") Dt record, @Param("example") DtExample example);

    int updateByExample(@Param("record") Dt record, @Param("example") DtExample example);
}