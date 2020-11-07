package com.example.demo;

import com.example.demo.dao.Teamdao;
import com.example.demo.domain.Player;
import com.example.demo.domain.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@RestController
public class DemoApplicationController {
   @Autowired Teamdao teamdao;

    @RequestMapping("/hi/{name}")
    public Team hiThere(@PathVariable String name){
              return teamdao.findByName(name);

    }
}
