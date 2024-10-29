package lambda;


@FunctionalInterface
interface Comp {
    public int compare(String name, String name02);
}

class Person06 {
    public void order(Comp comp) {
        String name = "홍길동";
        String name02 = "코난";

        int result = comp.compare(name,name02);

        if (result < 0 ){
            System.out.println(name +", "+name02);
        }
        else if (result > 0){
            System.out.println(name02 +", "+name);
        }
        else {
            System.out.println("같은 이름입니다");
        }


    }

}

public class LambdaMain06 {


    public static void main(String[] args) {
        Person06 person06 = new Person06();
        person06.order((name, name02) -> name.compareTo(name02));  //String 의 compareTo()
        person06.order(String :: compareTo); // ???


    }
}
