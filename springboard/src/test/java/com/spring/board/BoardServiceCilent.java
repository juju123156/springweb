package com.spring.board;

import java.util.List;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.user.UserService;
import com.spring.user.UserVO;

public class BoardServiceCilent {
	@Test
	public void boardTest() {
		//1.Spring 컨테이너를 구동한다
		AbstractApplicationContext container=new GenericXmlApplicationContext("applicationContext.xml");
		
		//2.Spring 컨테이너로부터 BoardServiceImpl객체를 Lookup 한다.
		BoardService boardService=(BoardService) container.getBean("boardService");
		
		//3.글 등록 기능 테스트
		BoardVO vo=new BoardVO();
		vo.setTitle("테스트 투");
		vo.setWriter("김주현");
		vo.setContent("내용테스트");
		boardService.insertBoard(vo);
		
		
		//4.글 목록 검색 기능 테스트
		List<BoardVO> boardList=boardService.getBoardList(vo);
		for(BoardVO board : boardList) {
			System.out.println("결과 : "+board.toString());
		}
		//5.Spring 컨테이너 종료
		container.close();
	}

}
