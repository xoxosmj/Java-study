package book;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class BookFileWrite implements Book {

    @Override
    public void execute(ArrayList<BookDTO> list) {
        try (FileWriter writer = new FileWriter("book.txt")) {
            writer.write("코드\t제목\t저자\t단가\t개수\t합계"+"\n");

            for (BookDTO book : list) {
                writer.write(book + "\n");
            }
            System.out.println("파일 저장 완료");
        } catch (IOException e) {
            System.out.println("파일 저장 중 오류 발생");
        }
    }

}
