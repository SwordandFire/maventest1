package com.tangliangying.service.impl;

import com.tangliangying.dao.PeopleMapper;
import com.tangliangying.domain.People;
import com.tangliangying.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PeopleServiceImpl implements PeopleService{
    @Autowired
    private PeopleMapper peopleMapper;
    public List<People> findAll() {
        return peopleMapper.findAll();
    }
}
