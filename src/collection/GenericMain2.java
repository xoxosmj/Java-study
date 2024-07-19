package collection;

public class GenericMain2<T> {
    private T a;

    public GenericMain2(T a) {
        this.a = a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public T getA() {
        return a;
    }

    public static void main(String[] args) {
        // GenericMain2<?> aa = new GenericMain2<String>();
//        aa.setA("홍길동"); - error, 제네릭에 물음표를 걸면
        // 반드시 데이터를 생성자를 통해서 넣어야한다

        GenericMain2<?> aa = new GenericMain2<String>("홍길동");
        String name = (String) aa.getA();
        // 오브젝트 타입으로 받기때문에 String이 불가능
        //String 으로 캐스팅(형변환) 해줘야함
        System.out.println("이름 = "+name);

        GenericMain2<?> bb = new GenericMain2<Integer>(25);
        int age = (Integer) bb.getA(); //언박싱
        System.out.println("나이 = "+age);

    }
}
