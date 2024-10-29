package nested;

public class Outer {

    private String name;

    public void output() {
        System.out.println("이름 = " + this.name + "\t나이 = " + new Inner().age); // new Inner().age = 일시적
        //중첩 클래스라서 굳이 getName 을 안해도된다
    }

    class Inner {
        private int age;

        public void disp() {
            System.out.println("이름 = " + Outer.this.name + "\t나이 = " + this.age);
//            Outer.this.name << 시험 단골손님 아우터소속의 this
        }

    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.name="홍길동";
        outer.output();

        Outer.Inner inner = outer.new Inner(); // 아우터=집주인 이너=세입자 so 아우터 안에서 만들어져야함
        inner.age = 25;
        inner.disp();

        Outer.Inner inner2 = outer.new Inner();
        inner2.age = 30;
        inner2.disp();

        Outer.Inner inner3 = new Outer().new Inner();
//        inner3.name = "코난"; 여기선 접근불가
        inner3.age = 35;
        inner3.disp();
    }
}
