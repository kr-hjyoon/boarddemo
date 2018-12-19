package com.hjyoon.boarddemo.dao;

import com.hjyoon.boarddemo.domain.BoardDomain;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BoardMapper {

	public BoardDomain findByBno2(@Param("bno") int bno);

	@Select("SELECT * FROM board")
	public List<BoardDomain> findAll();

	@Select("SELECT * FROM board WHERE userName=#{userName}")
	public List<BoardDomain> findByUserName(@Param("userName") String userName);

	@Select("SELECT * FROM board WHERE bno = #{bno}")
	public BoardDomain findByBno(@Param("bno") int bno);

	@Insert("INSERT INTO board(userName, contents) VALUES(#{userName}, #{contents})")
	public void insert(BoardDomain board);

	@Update("UPDATE board SET contents=#{contents} where bno=#{bno}")
	public void update(BoardDomain board);

	@Delete("DELETE FROM board where bno=#{bno}")
	public void delete(@Param("bno") int bno);

}
