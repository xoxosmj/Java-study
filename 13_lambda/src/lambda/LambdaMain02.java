package lambda;

class Person02 {
    public void execute(Workable workable) { //구현
        workable.work();
        // }
    }
}


public class LambdaMain02 {

    public static void main(String[] args) {
        Person02 person02 = new Person02();
        person02.execute(() -> {
            System.out.println("안녕하세요");
            System.out.println("나으 이름은 홍길동이다");
        });


        person02.execute(() -> {
            System.out.println("반갑다");
            System.out.println("어쩌고");

        });
    }

}

