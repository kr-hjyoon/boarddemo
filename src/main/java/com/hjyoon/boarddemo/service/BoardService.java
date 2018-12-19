package com.hjyoon.boarddemo.service;

import com.hjyoon.boarddemo.domain.BoardDomain;

import java.util.List;

public interface BoardService {
	public BoardDomain findByBno(int bno);
	public BoardDomain findByBno2(int bno);
	public List<BoardDomain> findAll();
	public void insert(BoardDomain board);
	public void update(BoardDomain board);
	public void delete(int bno);
}
