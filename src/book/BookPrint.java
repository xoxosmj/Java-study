package book;

import java.util.ArrayList;

public class BookPrint implements Book {

    @Override
    public void execute(ArrayList<BookDTO> list) {
        System.out.println("코드\t제목\t저자\t단가\t개수\t합계");
        for (BookDTO print : list) {
            System.out.println(print);
        }
    }
}
