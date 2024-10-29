package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukService {
    private ArrayList<SungJukDTO> list = new ArrayList<SungJukDTO>();
    SungJuk inter = null;

    public void menu() {
        Scanner scan = new Scanner(System.in);
        int num = 0;

        while (true) {
            System.out.println("1.입력");
            System.out.println("2.출력");
            System.out.println("3.수정");
            System.out.println("4.삭제");
            System.out.println("5.정렬");
            System.out.println("6.끝");
            num = scan.nextInt();

            if (num == 6)
                break;
            else if (num == 1)
                inter = new SungJukInsert();
                //System.out.println(list); 디버깅
            else if (num == 2)
                inter = new SungJukPrint();
            else if (num == 3)
                inter = new SungJukUpdate();
            else if (num == 4)
                inter = new SungJukDelete();
            else if (num == 5)
                inter = new SungJukSort();

            else {
                System.out.println("1~6 중에 선택하세요");
                continue;
            }

            inter.execute(list);

    } //while
} //menu()
}
