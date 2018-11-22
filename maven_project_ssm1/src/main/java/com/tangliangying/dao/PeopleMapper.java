package com.tangliangying.dao;

import com.tangliangying.domain.People;

import java.util.List;

public interface PeopleMapper {
    List<People> findAll();

    People findById(String id);


}
