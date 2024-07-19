package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {

    public static void main(String[] args) {

//        Set<> set = new Set(); // set은 인터페이스라서 new 가 안됨
            Set<String> set = new HashSet<String>();
            set.add("호랑이");
            set.add("사자");
            set.add("호랑이"); // 중복허용 x 순서 자기멋대로 저장
            set.add("기린");;
            set.add("코끼리");

        Iterator<String> iterator = set.iterator(); //이터레이터 iterator 는 set의 이터레이터다
        while (iterator.hasNext()) { // 항목이 없을때까지 반복하라
            System.out.println(iterator.next()); //항목을 꺼내라
        }
    }
}
