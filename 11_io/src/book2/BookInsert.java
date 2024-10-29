package book2;

import java.util.ArrayList;
import java.util.Scanner;

public class BookInsert implements Book {

    @Override
    public void execute(ArrayList<BookDTO> list) {

        Scanner sc = new Scanner(System.in);
        System.out.println("입력하세요");
        System.out.println("코드 : ");
        String code = sc.next();
        System.out.println("제목 : ");
        String title = sc.next();
        System.out.println("저자 : ");
        String author = sc.next();
        System.out.println("단가 : ");
        int price = sc.nextInt();
        System.out.println("개수 : ");
        int qty = sc.nextInt();

        int total = price* qty;

        BookDTO bookDTO = new BookDTO(code,title,author,price,qty);
        bookDTO.setTotal(total);//이렇게집어넣자

        list.add(bookDTO);

        System.out.println("항목 추가 완료");

        //데이터가 사라지기 전에 파일에 저장
        //항목이 6개이기 때문에 write~~ 6번써야함
        //하나로 묶자 = DTO클래스
    }

}
