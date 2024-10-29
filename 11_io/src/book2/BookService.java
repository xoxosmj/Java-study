package book2;

import java.util.ArrayList;
import java.util.Scanner;

public class BookService {
    private ArrayList<BookDTO> list = new ArrayList<>();
    Book inter = null;
    Scanner sc = new Scanner(System.in);

    public void service() {

        int menu = 0;

        while (true) {
            System.out.println();
            System.out.println("1.등록");
            System.out.println("2.출력");
            System.out.println("3.파일 저장");
            System.out.println("4.파일 읽기");
            System.out.println("5.책 제목으로 오름차순");
            System.out.println("6.첵 제목 검색");
            System.out.println("7.프로그램 종료");
            menu = sc.nextInt();

            if (menu == 7) break;

            if (menu == 1)
                inter = new BookInsert();
            else if (menu == 2)
                inter = new BookPrint();
            else if (menu == 3)
                inter = new BookFileWrite();
            else if (menu == 4)
                inter = new BookFileRead();
            else if (menu == 5)
                inter = new BookTitleAsc();
            else if (menu == 6)
                inter = new BookTitleSearch();
            else {
                System.out.println("올바른 숫자를 입력하세요");
                continue;
            }

            inter.execute(list); // list 전체를 넘기는게 아니라 주소값을 넘기는것

        }

    }

}


