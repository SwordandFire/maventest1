package com.tangliangying.test.dao;

import com.tangliangying.dao.PeopleMapper;
import com.tangliangying.domain.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class DaoTest {
    @Test
    public void daoTest(){
        try {
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
            boolean b = applicationContext.containsBean("com.tangliangying.dao.PeopleMapper");
            PeopleMapper peopleDao = applicationContext.getBean(PeopleMapper.class);
            List<People> list = peopleDao.findAll();
            for (People people : list) {
                System.out.println(people.toString());
            }

            People people = peopleDao.findById("111");
            System.out.println(people.toString());
        } catch (Exception e){
            e.printStackTrace();
        }


    }

}
