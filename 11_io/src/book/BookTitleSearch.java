package book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BookTitleSearch implements Book {

    @Override
    public void execute(ArrayList<BookDTO> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("검색할 책의 제목을 입력하세요");

        String search = sc.next();

        Iterator<BookDTO> iterator = list.iterator();
        boolean found = false;

        while (iterator.hasNext()) {
            BookDTO book = iterator.next();
            if (book.getTitle().toLowerCase().contains(search.toLowerCase())) {
                found = true;
                System.out.println(book);

            }


        }
        if (!found)
            System.out.println("검색결과 없음");
    }
}
