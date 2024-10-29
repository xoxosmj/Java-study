package board.service;

import board.bean.BoardDTO;
import board.dao.BoardDAO;

import java.util.Scanner;

public class BoardWriteService implements Board {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("아이디 입력 : ");
        String id = scanner.nextLine();
        System.out.print("이름 입력 : ");
        String name = scanner.nextLine();
        System.out.print("제목 입력 : ");
        String subject = scanner.nextLine();
        System.out.print("내용 입력 : ");
        String content = scanner.nextLine();

        BoardDTO boardDTO = new BoardDTO(id, name, subject, content);
        BoardDAO boardDAO = BoardDAO.getInstance();

        int su = boardDAO.write(boardDTO);
        System.out.println(su+"개의 게시물 작성완료");

    }
}
