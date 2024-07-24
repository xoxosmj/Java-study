package book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookInsert implements Book {

    @Override
    public void execute(ArrayList<BookDTO> list) {

        Scanner sc = new Scanner(System.in);
        System.out.println("입력하세요");
        System.out.println("코드 : ");
        int code = sc.nextInt();
        System.out.println("제목 : ");
        String title = sc.next();
        System.out.println("저자 : ");
        String author = sc.next();
        System.out.println("단가 : ");
        int price = sc.nextInt();
        System.out.println("개수 : ");
        int num = sc.nextInt();

        BookDTO book = new BookDTO(code, title, author, price, num);
        list.add(book);


    }

}
