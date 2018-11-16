package com.hjyoon.boarddemo.boarddemo.service;

import com.hjyoon.boarddemo.boarddemo.domain.BoardDomain;

import java.util.List;

public interface BoardService {
	public List<BoardDomain> findByBno(int bno);
	public List<BoardDomain> findByBno2(int bno);
	public void insert(BoardDomain board);
	public void update(BoardDomain board);
	public void delete(int bno);
}
