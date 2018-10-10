package com.eshop.mapper;

import com.eshop.pojo.EshopOrder;
import com.eshop.pojo.EshopOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EshopOrderMapper {
    int countByExample(EshopOrderExample example);

    int deleteByExample(EshopOrderExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(EshopOrder record);

    int insertSelective(EshopOrder record);

    List<EshopOrder> selectByExample(EshopOrderExample example);

    EshopOrder selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") EshopOrder record, @Param("example") EshopOrderExample example);

    int updateByExample(@Param("record") EshopOrder record, @Param("example") EshopOrderExample example);

    int updateByPrimaryKeySelective(EshopOrder record);

    int updateByPrimaryKey(EshopOrder record);
}