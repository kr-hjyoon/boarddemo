package com.hjyoon.boarddemo.boarddemo.controller;


import com.hjyoon.boarddemo.boarddemo.domain.BoardDomain;
import com.hjyoon.boarddemo.boarddemo.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import java.util.List;

@Controller
public class BoardController {

	@Autowired
	BoardService boardService;

	@GetMapping("/test")
	public ModelAndView readTest(){
		List<BoardDomain> boardList =boardService.findByBno(1);
		ModelAndView mv = new ModelAndView("board/readTest");
		mv.addObject("boardList",boardList);
		return mv;
	}
}
