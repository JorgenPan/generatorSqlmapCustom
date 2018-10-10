package com.eshop.mapper;

import com.eshop.pojo.EshopItemParam;
import com.eshop.pojo.EshopItemParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EshopItemParamMapper {
    int countByExample(EshopItemParamExample example);

    int deleteByExample(EshopItemParamExample example);

    int deleteByPrimaryKey(Long id);

    int insert(EshopItemParam record);

    int insertSelective(EshopItemParam record);

    List<EshopItemParam> selectByExampleWithBLOBs(EshopItemParamExample example);

    List<EshopItemParam> selectByExample(EshopItemParamExample example);

    EshopItemParam selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EshopItemParam record, @Param("example") EshopItemParamExample example);

    int updateByExampleWithBLOBs(@Param("record") EshopItemParam record, @Param("example") EshopItemParamExample example);

    int updateByExample(@Param("record") EshopItemParam record, @Param("example") EshopItemParamExample example);

    int updateByPrimaryKeySelective(EshopItemParam record);

    int updateByPrimaryKeyWithBLOBs(EshopItemParam record);

    int updateByPrimaryKey(EshopItemParam record);
}