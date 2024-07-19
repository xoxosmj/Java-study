package collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorMain {

    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();//기본 용량이 따라붙음

        System.out.println("벡터 크기 = " + v.size()); //0
        System.out.println("벡터 용량 = " + v.capacity());
        //기본용량 10, 항목이 들어갈 공간이 없으면 10개씩 자동으로 증가
        System.out.println();

        System.out.println("항목 추가");
        for(int i=1; i<=10; i++) {
            v.add(i+""); //""붙여서 스트링으로 변환
            System.out.print(v.get(i-1)+" ");

        }
        System.out.println();
        System.out.println("벡터 크기 = " + v.size());
        System.out.println("벡터 용량 = " + v.capacity());
        System.out.println();

        System.out.println("항목 1개 추가");
        v.addElement(5+""); // 중복허용
        System.out.println("벡터 크기 = " + v.size());
        System.out.println("벡터 용량 = " + v.capacity());
        System.out.println();

        for(int i=0; i<v.size(); i++) {
            System.out.print(v.get(i)+" ");
        }
        System.out.println();
        System.out.println("항목 5를 삭제");
        v.remove(5); //index 5번인 6이 삭제
        v.remove(5+""); //문자열이 5와동일한 항목 삭제
//        중복된 5중에서 앞에잇는게 삭제됨
        System.out.println(v);
        System.out.println();

        Iterator<String> it = v.iterator();
        while(it.hasNext()) {
            System.out.print(it.next()+" ");
        }
        System.out.println();
    }
}


