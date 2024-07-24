package book2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class BookFileRead implements Book {

    @Override
    public void execute(ArrayList<BookDTO> list) {
        list.clear(); // list 지우기

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.txt"));

            //파일에서 List꺼내오기

          /*  List<BookDTO> loadlist = new ArrayList();
            for (BookDTO bookDTO : loadlist) {
                list.add(bookDTO);

            }*/


            //파일에서 BookDTO꺼내오기
            while (true) {
                try {
                    BookDTO book = (BookDTO) ois.readObject();
                    list.add(book);
                } catch (EOFException e) {
                    break; //파일의 끝에 도달하면 while문을 나가라
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
