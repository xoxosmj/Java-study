package board.main;

import board.service.Board;
import board.service.BoardListService;
import board.service.BoardViewService;
import board.service.BoardWriteService;

import java.util.Scanner;

public class IndexMain {


    public static void main(String[] args) {
        IndexMain indexMain = new IndexMain();
        indexMain.menu();
        System.out.println("프로그램 종료");

    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println();
            System.out.println("***************");
            System.out.println("1. 글쓰기");
            System.out.println("2. 목록");
            System.out.println("3. 작성한 글 내용 보기");
            System.out.println("4. 끝");
            System.out.println("***************");
            System.out.print("번호 : ");
            int choice = scanner.nextInt();

            if (choice == 4) break;

            Board board = null;
            switch (choice) {
                case 1:
                    board = new BoardWriteService();
                    break;

                case 2:
                    board = new BoardListService();
                    break;

                case 3:
                    board = new BoardViewService();
                    break;

                default:
                    System.out.println("올바른 번호를 입력하세요");
                    continue;

            }
            board.execute();

        }
    }
}
