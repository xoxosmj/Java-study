package board.service;

import board.dao.BoardDAO;

public class BoardListService implements Board {
    @Override
    public void execute() {
        System.out.println("-------------------------");
        System.out.println("글번호   제목   아이디   날짜");
        System.out.println("-------------------------");
        BoardDAO boardDAO = BoardDAO.getInstance();
        boardDAO.list();

    }
}
