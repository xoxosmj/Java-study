package book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookService {
    private ArrayList<BookDTO> list = new ArrayList<>();
    Book inter = null;

    public void service() {
        Scanner sc = new Scanner(System.in);
        int menu = 0;

        do {
            System.out.println();
            System.out.println("1.등록");
            System.out.println("2.출력");
            System.out.println("3.파일 저장");
            System.out.println("4.파일 읽기");
            System.out.println("5.책 제목으로 오름차순");
            System.out.println("6.첵 제목 검색");
            System.out.println("7.프로그램 종료");
            menu = sc.nextInt();

            switch (menu) {
                case 7:
                    break;

                case 1:
                    inter = new BookInsert();
                    inter.execute(list);
                    break;
                case 2:
                    inter = new BookPrint();
                    inter.execute(list);
                    break;
                case 3:
                    inter = new BookFileWrite();
                    inter.execute(list);
                    break;
                case 4:
                    inter = new BookFileRead();
                    inter.execute(list);
                    break;
                case 5:
                    inter = new BookTitleAsc();
                    inter.execute(list);
                    break;
                case 6:
                    inter = new BookTitleSearch();
                    inter.execute(list);
                    break;
                default:
                    System.out.println("올바른 숫자를 입력하세요");
                    break;

            }


        } while (menu != 7);

        System.out.println("프로그램을 종료합니다");
    }

}


