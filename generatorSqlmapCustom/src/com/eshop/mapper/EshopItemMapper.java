package com.eshop.mapper;

import com.eshop.pojo.EshopItem;
import com.eshop.pojo.EshopItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EshopItemMapper {
    int countByExample(EshopItemExample example);

    int deleteByExample(EshopItemExample example);

    int deleteByPrimaryKey(String id);

    int insert(EshopItem record);

    int insertSelective(EshopItem record);

    List<EshopItem> selectByExample(EshopItemExample example);

    EshopItem selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") EshopItem record, @Param("example") EshopItemExample example);

    int updateByExample(@Param("record") EshopItem record, @Param("example") EshopItemExample example);

    int updateByPrimaryKeySelective(EshopItem record);

    int updateByPrimaryKey(EshopItem record);
}