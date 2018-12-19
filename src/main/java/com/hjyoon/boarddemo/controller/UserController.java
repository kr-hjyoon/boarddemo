package com.hjyoon.boarddemo.controller;


import com.hjyoon.boarddemo.domain.UserDomain;
import com.hjyoon.boarddemo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

// Mybatis XML파일을 통한 서비스 구성 테스트
@Controller
public class UserController {

	private static Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	UserService userService;

	@GetMapping("/user")
	public ModelAndView list(){
		List<UserDomain> userList = userService.findAll();
		ModelAndView mv = new ModelAndView("user/user");
		mv.addObject("userList",userList);
		return mv;
	}

	@GetMapping("/user/detail/{userNo}")
	public ModelAndView detail(@PathVariable("userNo") int userNo ){
		UserDomain user = userService.findByUserNo(userNo);
		ModelAndView mv = new ModelAndView("user/detail");
		mv.addObject("user",user );
		return mv;
	}


/*	@PostMapping("/user")
	public String add(UserDomain user) throws  Exception{
		logger.info("POST /user :" + user.toString());
		userService.insert(user);
		return "redirect:/user";
	}
	@DeleteMapping("/user/{userNo}")
	public String delete(@PathVariable("userNo") int bno ) throws Exception{
		logger.info("DELETE /user/userNo :" + bno);
		userService.delete(bno);
		return "redirect:/user";

	}*/

}
