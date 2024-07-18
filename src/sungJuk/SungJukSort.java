package sungJuk;

import java.util.*;


public class SungJukSort implements SungJuk {

    @Override
    public void execute(ArrayList<SungJukDTO> list) {
        Scanner sc = new Scanner(System.in);
        int num;

        while (true) {
            System.out.println("***************");
            System.out.println("    1.총점으로 내림차순");
            System.out.println("    2.이름으로 오름차순");
            System.out.println("    3.이전 메뉴");
            System.out.println("***************");
            System.out.println("번호 입력 : ");

            num = sc.nextInt();
            if (num == 3) break;

            if (num == 1) {
                Collections.sort(list);
                for (SungJukDTO output : list) {
                    System.out.println(output);
                }

            } else if (num == 2) {

            } else {
                System.out.println("올바른 숫자를 입력하세요");
            }
        }
    }


}
