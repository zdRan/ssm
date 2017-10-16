package com.unicom.ssm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.unicom.ssm.domain.User;
import com.unicom.ssm.service.UserService;

@Controller
public class HelloController {
	private static Logger log=LoggerFactory.getLogger(HelloController.class);
	   
	@Autowired
	UserService userService;
	@RequestMapping(value = "/hello")
	@ResponseBody
    public String hello(){
		log.info("测试 log配置");
        return "hello world";
    }
	@RequestMapping(value = "/user/{name}")
	@ResponseBody
    public String helloUser(@PathVariable("name")String name){
		User user = userService.getUserByName(name);
        return "hello "+user.getName()+",金额："+user.getMoney();
    }
}
