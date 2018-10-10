package com.eshop.mapper;

import com.eshop.pojo.EshopItemCat;
import com.eshop.pojo.EshopItemCatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EshopItemCatMapper {
    int countByExample(EshopItemCatExample example);

    int deleteByExample(EshopItemCatExample example);

    int deleteByPrimaryKey(Long id);

    int insert(EshopItemCat record);

    int insertSelective(EshopItemCat record);

    List<EshopItemCat> selectByExample(EshopItemCatExample example);

    EshopItemCat selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EshopItemCat record, @Param("example") EshopItemCatExample example);

    int updateByExample(@Param("record") EshopItemCat record, @Param("example") EshopItemCatExample example);

    int updateByPrimaryKeySelective(EshopItemCat record);

    int updateByPrimaryKey(EshopItemCat record);
}