package board.service;

import board.dao.BoardDAO;

import java.util.Scanner;

public class BoardViewService implements Board {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("글번호 입력 : ");
        choice = scanner.nextInt();

        BoardDAO boardDAO = BoardDAO.getInstance();
        boardDAO.view(choice);

    }
}
