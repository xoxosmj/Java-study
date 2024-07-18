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
                Comparator<SungJukDTO> comparator1 = new Comparator<SungJukDTO>() {

                    @Override
                    public int compare(SungJukDTO o1, SungJukDTO o2) {
                        return o1.getTot()*-1;
                    }
                };
                Collections.sort(list, comparator1);
                for (SungJukDTO output : list) {
                    System.out.println(output);
                }
                break;

                }

             else if (num == 2) {
                Comparator<SungJukDTO> comparator2 = new Comparator<SungJukDTO>() {

                    @Override
                    public int compare(SungJukDTO o1, SungJukDTO o2) {
                        return o1.getName().compareTo(o2.getName()); //compareTo(): 자바에서 문자열을 사전순으로 비교할 때 사용하는 메서드입니다.
                    }
                };
                Collections.sort(list, comparator2);
                for (SungJukDTO output : list) {
                    System.out.println(output);
                }
                break;
            } else {
                System.out.println("올바른 숫자를 입력하세요");
            }
        }
    }
}
