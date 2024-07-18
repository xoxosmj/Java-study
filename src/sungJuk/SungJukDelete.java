package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukDelete implements SungJuk {

    @Override
    public void execute(ArrayList<SungJukDTO> list) {
        System.out.println("삭제할 이름 입력 : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        boolean sw = false;
        for (SungJukDTO sungJukDTO : list) {
            if (sungJukDTO.getName().equals(name)) {
                list.remove(sungJukDTO);
                sw = true;
                break;
            }
        }

        if (sw == false) {
            System.out.println("학생의 정보가 없습니다");
            System.out.println();
        }

        if (sw == true) {
            System.out.println("삭제 완료");
            System.out.println();
        }

    }

}
