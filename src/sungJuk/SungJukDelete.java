package sungJuk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SungJukDelete implements SungJuk {

    @Override
    public void execute(ArrayList<SungJukDTO> list) {
        System.out.println();
        System.out.println("삭제할 이름 입력 : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        int count = 0;

        /*for (int i = list.size()-1; i >= 0; i--) {
            if (list.get(i).getName().equals(name)) {
                list.remove(list.get(i));
                System.out.println("삭제 완료");
                count++;
                break;
            }
        }*/ //---err 에러뜸
       // Iterator<SungJukDTO> it = list.iterator();  메소드를 통해 생성하는게 좋음
        //it.hasNext() = 항목이 있으면 true, 없으면 false
        // it.next() = 항목을 꺼내고 임시 공간에 보관하고, 다음으로 이동
        //it.remove() = it.next() 통해서 임시공간에 보관한 항목 제거

        Iterator<SungJukDTO> it = list.iterator();
        while (it.hasNext()) {
            SungJukDTO dto = it.next();

            if (dto.getName().equals(name)) {
                it.remove();
                count++;
            }
        }


        if (count == 0) {
            System.out.println("학생의 정보가 없습니다");
            System.out.println();
        } else {
            System.out.println(count + "건의 항목을 삭제하였습니다");
            System.out.println();
        }
    }

}
