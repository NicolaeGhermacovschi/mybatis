package com.mycompany.mybatis.mapper;

import com.mycompany.mybatis.entity.Person;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PersonMapper {

//    @Select("SELECT * FROM person")
    List<Person> selectAll();
}
