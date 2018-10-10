package com.eshop.mapper;

import com.eshop.pojo.EshopContent;
import com.eshop.pojo.EshopContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EshopContentMapper {
    int countByExample(EshopContentExample example);

    int deleteByExample(EshopContentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(EshopContent record);

    int insertSelective(EshopContent record);

    List<EshopContent> selectByExample(EshopContentExample example);

    EshopContent selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EshopContent record, @Param("example") EshopContentExample example);

    int updateByExample(@Param("record") EshopContent record, @Param("example") EshopContentExample example);

    int updateByPrimaryKeySelective(EshopContent record);

    int updateByPrimaryKey(EshopContent record);
}