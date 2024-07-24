package book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BookTitleAsc implements Book {


    @Override
    public void execute(ArrayList<BookDTO> list) {
        Comparator<BookDTO> comparator = new Comparator<BookDTO>() {

            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        };
        Collections.sort(list, comparator);
        System.out.println("코드\t제목\t저자\t단가\t개수\t합계");
        for (BookDTO book : list) {
            System.out.println(book);
        }


    }
}
