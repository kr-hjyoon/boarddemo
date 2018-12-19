package com.hjyoon.boarddemo.service.impl;

import com.hjyoon.boarddemo.dao.BoardMapper;
import com.hjyoon.boarddemo.domain.BoardDomain;
import com.hjyoon.boarddemo.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardMapper boardMapper;

	@Override public void update(BoardDomain board) {
		boardMapper.update(board);
	}

	@Override public void insert(BoardDomain board) {
		boardMapper.insert(board);
	}

	@Override public void delete(int bno) {
		boardMapper.delete(bno);
	}

	@Override public BoardDomain findByBno2(int bno) {
		return boardMapper.findByBno2(bno);
	}

	@Override public List<BoardDomain> findAll() {
		return boardMapper.findAll();	}

	@Override public BoardDomain findByBno(int bno) {
		return boardMapper.findByBno(bno);
	}

}
