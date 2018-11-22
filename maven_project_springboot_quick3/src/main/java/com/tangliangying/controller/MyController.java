package com.tangliangying.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tangliangying.domain.People;
import com.tangliangying.mapper.PeopleMapper;
import com.tangliangying.redis.RedisCRUDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private PeopleMapper peopleMapper;

    @Autowired
    RedisCRUDService redisCRUDService;

    @RequestMapping("/findAllPeople")
    public String findAll(){
        List<People> all = peopleMapper.findAll();
        System.out.println("helloworld");
        for (People people : all) {
            people.toString();
        }
        System.out.println("hahahaha");
        return all.toString();
    }

    @RequestMapping("/get")
    public String redisGet(String sth){
        return redisCRUDService.hget(sth);
    }

    @RequestMapping("/set")
    public String redisGet(String key, String value){
        redisCRUDService.hset(key, value);
        return redisCRUDService.hget(key);
        // hello world
        //hahahaxixixi
    }
}
