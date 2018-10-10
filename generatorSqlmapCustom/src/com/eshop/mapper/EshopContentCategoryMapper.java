package com.eshop.mapper;

import com.eshop.pojo.EshopContentCategory;
import com.eshop.pojo.EshopContentCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EshopContentCategoryMapper {
    int countByExample(EshopContentCategoryExample example);

    int deleteByExample(EshopContentCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(EshopContentCategory record);

    int insertSelective(EshopContentCategory record);

    List<EshopContentCategory> selectByExample(EshopContentCategoryExample example);

    EshopContentCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EshopContentCategory record, @Param("example") EshopContentCategoryExample example);

    int updateByExample(@Param("record") EshopContentCategory record, @Param("example") EshopContentCategoryExample example);

    int updateByPrimaryKeySelective(EshopContentCategory record);

    int updateByPrimaryKey(EshopContentCategory record);
}