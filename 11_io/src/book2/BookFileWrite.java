package book2;

import java.io.*;
import java.util.ArrayList;

public class BookFileWrite implements Book {

    @Override
    public void execute(ArrayList<BookDTO> list) {
        //객체는 io를 통해서 못넘어감
        //Serializable 사용

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.txt"));
//            oos.writeObject(list); list를 파일에 저장 이렇게해도됨

            //list에서 BookDTO를 꺼내서 파일에 저장
            for (BookDTO bookDTO: list){
                oos.writeObject(bookDTO);
            }
            oos.close();
            System.out.println("파일 저장 완료");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}