package com.tangliangying.controller;

import com.tangliangying.domain.People;
import com.tangliangying.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/tang")
public class MyController {
    @Autowired
    private PeopleService peopleService;

    @RequestMapping("/findAll")
    public String findAll(Model model) {
//        model.addAttribute();
        List<People> all = peopleService.findAll();
        model.addAttribute("User", all);
        for (People people : all) {
            System.out.println(people);
        }
        return "allPepple";
    }
}
