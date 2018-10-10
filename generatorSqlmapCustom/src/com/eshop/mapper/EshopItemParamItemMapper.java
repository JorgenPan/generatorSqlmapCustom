package com.eshop.mapper;

import com.eshop.pojo.EshopItemParamItem;
import com.eshop.pojo.EshopItemParamItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EshopItemParamItemMapper {
    int countByExample(EshopItemParamItemExample example);

    int deleteByExample(EshopItemParamItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(EshopItemParamItem record);

    int insertSelective(EshopItemParamItem record);

    List<EshopItemParamItem> selectByExampleWithBLOBs(EshopItemParamItemExample example);

    List<EshopItemParamItem> selectByExample(EshopItemParamItemExample example);

    EshopItemParamItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EshopItemParamItem record, @Param("example") EshopItemParamItemExample example);

    int updateByExampleWithBLOBs(@Param("record") EshopItemParamItem record, @Param("example") EshopItemParamItemExample example);

    int updateByExample(@Param("record") EshopItemParamItem record, @Param("example") EshopItemParamItemExample example);

    int updateByPrimaryKeySelective(EshopItemParamItem record);

    int updateByPrimaryKeyWithBLOBs(EshopItemParamItem record);

    int updateByPrimaryKey(EshopItemParamItem record);
}