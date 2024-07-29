package lambda;

class Person03 {
    public void execute(InterA interA){
        interA.disp("홍기동",25);

   }

   public void execute(InterB interB){
        interB.output("안녕하세요 홍길동이무니다");
   }
}


public class LambdaMain03 {

    public static void main(String[] args) {
        Person03 person03 = new Person03();

        person03.execute((name, age) -> {
            System.out.println("이름은 "+name+" 이무니다");
            System.out.println("나이는 "+age+" 세입니다");
        });

        //매개변수가 1개인 경우에는 () 생략가능
        person03.execute(data ->
            System.out.println(data)

        );

    }
}
