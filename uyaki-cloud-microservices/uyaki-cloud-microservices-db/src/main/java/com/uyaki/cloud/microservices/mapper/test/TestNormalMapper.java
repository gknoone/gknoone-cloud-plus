package com.uyaki.cloud.microservices.mapper.test;

import com.uyaki.cloud.microservices.model.test.TestNormal;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestNormalMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TestNormal record);

    int insertSelective(TestNormal record);

    TestNormal selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TestNormal record);

    int updateByPrimaryKey(TestNormal record);
}