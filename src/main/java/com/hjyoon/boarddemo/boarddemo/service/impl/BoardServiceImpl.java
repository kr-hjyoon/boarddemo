package com.hjyoon.boarddemo.boarddemo.service.impl;

import com.hjyoon.boarddemo.boarddemo.dao.BoardMapper;
import com.hjyoon.boarddemo.boarddemo.domain.BoardDomain;
import com.hjyoon.boarddemo.boarddemo.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardMapper boardMapper;

	@Override
	public void update(BoardDomain board) {
		boardMapper.update(board);
	}

	@Override
	public void insert(BoardDomain board) {
		boardMapper.insert(board);
	}

	@Override
	public void delete(int bno) {
		boardMapper.delete(bno);
	}

	@Override
	public List<BoardDomain> findByBno2(int bno) {
		return boardMapper.findByBno2(bno);
	}

	@Override public List<BoardDomain> findByBno(int bno) {
		return (List<BoardDomain>) boardMapper.findByBno(bno);
	}

}
