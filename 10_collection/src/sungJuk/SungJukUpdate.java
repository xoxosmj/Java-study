package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukUpdate implements SungJuk {

    @Override
    public void execute(ArrayList<SungJukDTO> list) {
        Scanner scan = new Scanner(System.in);
        System.out.println("번호 입력 :");
        int num = scan.nextInt();

        boolean sw = false;
        for (SungJukDTO sungJukDTO : list) {
            if (sungJukDTO.getNo() == num) {
                sw = true;
                System.out.println(sungJukDTO);
                System.out.println();

                System.out.println("수정 할 이름 입력: ");
                String name = scan.next();
                System.out.println("수정 할 국어 입력: ");
                int kor = scan.nextInt();
                System.out.println("수정 할 영어 입력: ");
                int eng = scan.nextInt();
                System.out.println("수정 할 수학 입력: ");
                int math = scan.nextInt();

                sungJukDTO.setName(name);
                sungJukDTO.setKor(kor);
                sungJukDTO.setEng(eng);
                sungJukDTO.setMath(math);
                sungJukDTO.calc();

                System.out.println("수정완료");

                break;
            }//if


        }//for
        if (!sw) System.out.println("잘못된 번호입니다");

    }

}
