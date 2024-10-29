package collection;

public class GenericMain<T> {
    private T a;

    public void setA(T a) {
        this.a = a;
    }

    public T getA() {
        return a;
    }

    public static void main(String[] args) {
        GenericMain<String> aa =  new GenericMain<>();
        aa.setA("홍길동");
        System.out.println("이름 = "+aa.getA());

        GenericMain<Integer> bb = new GenericMain<>();
        bb.setA(5);

        System.out.println("이름 : "+aa.getA()+"\n" + "나이 : "+bb.getA());

    }
}
