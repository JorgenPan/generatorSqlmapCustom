package com.eshop.mapper;

import com.eshop.pojo.EshopOrderShipping;
import com.eshop.pojo.EshopOrderShippingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EshopOrderShippingMapper {
    int countByExample(EshopOrderShippingExample example);

    int deleteByExample(EshopOrderShippingExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(EshopOrderShipping record);

    int insertSelective(EshopOrderShipping record);

    List<EshopOrderShipping> selectByExample(EshopOrderShippingExample example);

    EshopOrderShipping selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") EshopOrderShipping record, @Param("example") EshopOrderShippingExample example);

    int updateByExample(@Param("record") EshopOrderShipping record, @Param("example") EshopOrderShippingExample example);

    int updateByPrimaryKeySelective(EshopOrderShipping record);

    int updateByPrimaryKey(EshopOrderShipping record);
}