package com.hjyoon.boarddemo.controller;


import com.hjyoon.boarddemo.domain.BoardDomain;
import com.hjyoon.boarddemo.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BoardController {

	@Autowired
	BoardService boardService;

	@GetMapping("/test")
	public ModelAndView readTest(){
		System.out.println("ZOODEBUG1");

		List<BoardDomain> boardList = boardService.findByBno(1);
		System.out.println("ZOODEBUG2");
		ModelAndView mv = new ModelAndView("board/readTest");
		System.out.println("ZOODEBUG3");
		mv.addObject("boardList",boardList);
		System.out.println("ZOODEBUG");
		return mv;
	}
}
