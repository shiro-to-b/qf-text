package com.qf.controller;

import com.qf.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;

@Controller
public class PersonController {

    @Autowired
    PersonService personService;
    @RequestMapping("/index")
    public  String toIndex(){
        return "index";
    }

    @PostMapping("/index")
    public  String update(Integer pid, Integer bid, Integer num) throws Exception {
       System.out.println(pid+":"+bid+":"+num+"==================");
        personService.personBuyBook(pid,bid,num);
        return "index";
    }
}
