package com.eshop.mapper;

import com.eshop.pojo.EshopCartItem;
import com.eshop.pojo.EshopCartItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EshopCartItemMapper {
    int countByExample(EshopCartItemExample example);

    int deleteByExample(EshopCartItemExample example);

    int deleteByPrimaryKey(String id);

    int insert(EshopCartItem record);

    int insertSelective(EshopCartItem record);

    List<EshopCartItem> selectByExample(EshopCartItemExample example);

    EshopCartItem selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") EshopCartItem record, @Param("example") EshopCartItemExample example);

    int updateByExample(@Param("record") EshopCartItem record, @Param("example") EshopCartItemExample example);

    int updateByPrimaryKeySelective(EshopCartItem record);

    int updateByPrimaryKey(EshopCartItem record);
}