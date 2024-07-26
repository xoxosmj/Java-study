package board.service;

import board.dao.BoardDAO;

public class BoardListService implements Board {
    @Override
    public void execute() {
        System.out.println("-------------------------");
        System.out.println("글번호\t제목\t아이디\t날짜");
        System.out.println("-------------------------");
        BoardDAO boardDAO = BoardDAO.getInstance();
        boardDAO.list();

    }
}
