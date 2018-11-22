package com.tangliangying.mapper;

import com.tangliangying.domain.People;
import org.apache.ibatis.annotations.Mapper;

import javax.swing.*;

import java.util.List;
@Mapper
public interface PeopleMapper {
    List<People> findAll();
}
