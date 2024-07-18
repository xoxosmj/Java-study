package inheritance;

import java.util.ArrayList;

public class ObjectMain {

    public static void main(String[] args) {

        String str = "apple";
        System.out.println("객체 str = " + str);
        System.out.println("객체 str = " + str.toString());
        System.out.println("객체 str = " + str.hashCode());

        String aa = new String("apple");
        String bb = new String("apple");
        System.out.println("aa==bb : " + (aa == bb)); //주소비교하는거라 false
        System.out.println("aa.equals(bb)) : " + aa.equals(bb)); //문자열 비교라서 true
        System.out.println();


        Object cc = new Object();
        Object dd = new Object();
        System.out.println("cc == dd : " + (cc == dd)); //주소값비교 false
        System.out.println("cc.equals(dd) : " + cc.equals(dd)); //object에서의 equals는 주소값 물어보는거라 false
        System.out.println();

        Object ee = new String("apple");
        Object ff = new String("apple");
        System.out.println("ee=ff : " + (ff == ee)); //주소값
        System.out.println("ee.equals(ff) : " + ee.equals(ff)); //오버라이딩 되어있기때문에 문자열
        System.out.println();

        ArrayList<String> list = new ArrayList<>();
        list.add("호랑이");
        list.add("사자");
        System.out.println(list); //클@16진수 ==>[항목, 항목]

    }
}

/*
class Object {
    public boolean equals(Object obj){} // 참조값 비교
    public String toString(){} //클@16진수
    public int hashCode(){} //10진수

}

class String extends Object{
    public boolean equals(Object obj){} // 문자열 비교
    public String toString(){} // 문자열
    public int hashCode(){} // 믿지 마삼, 표현불가

}

 */