package com.eshop.mapper;

import com.eshop.pojo.EshopOrderItem;
import com.eshop.pojo.EshopOrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EshopOrderItemMapper {
    int countByExample(EshopOrderItemExample example);

    int deleteByExample(EshopOrderItemExample example);

    int deleteByPrimaryKey(String id);

    int insert(EshopOrderItem record);

    int insertSelective(EshopOrderItem record);

    List<EshopOrderItem> selectByExample(EshopOrderItemExample example);

    EshopOrderItem selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") EshopOrderItem record, @Param("example") EshopOrderItemExample example);

    int updateByExample(@Param("record") EshopOrderItem record, @Param("example") EshopOrderItemExample example);

    int updateByPrimaryKeySelective(EshopOrderItem record);

    int updateByPrimaryKey(EshopOrderItem record);
}