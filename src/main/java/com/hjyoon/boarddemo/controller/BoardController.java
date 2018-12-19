package com.hjyoon.boarddemo.controller;


import com.hjyoon.boarddemo.domain.BoardDomain;
import com.hjyoon.boarddemo.service.BoardService;
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


// My batis  어노테이션을 통한 서비스 구성 샘플
@Controller
public class BoardController {

	private static Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Autowired
	BoardService boardService;

	@GetMapping("/board")
	public ModelAndView list(){
		List<BoardDomain> boardList = boardService.findAll();
		ModelAndView mv = new ModelAndView("board/board");
		mv.addObject("boardList",boardList);
		return mv;
	}

	@GetMapping("/board/detail/{bno}")
	public ModelAndView detail(@PathVariable("bno") int bno ) {
		BoardDomain board  = boardService.findByBno( bno);
		ModelAndView mv = new ModelAndView("board/detail");
		mv.addObject("board",board);
		return mv;
	}

	@GetMapping("/board/detail2/{bno}")
	public ModelAndView detail2(@PathVariable("bno") int bno ) {
		BoardDomain board  = boardService.findByBno2( bno);
		ModelAndView mv = new ModelAndView("board/detail");
		mv.addObject("board",board);
		return mv;
	}

	@PostMapping("/board")
	public String add(BoardDomain board) throws  Exception{
		logger.info("POST /board :" + board.toString());
		boardService.insert(board);
		return "redirect:/board";
	}
	@DeleteMapping("/board/{bno}")
	public String delete(@PathVariable("bno") int bno ) throws Exception{
		logger.info("DELETE /board/bno :" + bno);
		boardService.delete(bno);
		return "redirect:/board";

	}

}
