package com.eshop.mapper;

import com.eshop.pojo.EshopUser;
import com.eshop.pojo.EshopUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EshopUserMapper {
    int countByExample(EshopUserExample example);

    int deleteByExample(EshopUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(EshopUser record);

    int insertSelective(EshopUser record);

    List<EshopUser> selectByExample(EshopUserExample example);

    EshopUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EshopUser record, @Param("example") EshopUserExample example);

    int updateByExample(@Param("record") EshopUser record, @Param("example") EshopUserExample example);

    int updateByPrimaryKeySelective(EshopUser record);

    int updateByPrimaryKey(EshopUser record);
}