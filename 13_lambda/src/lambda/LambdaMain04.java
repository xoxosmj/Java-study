package lambda;

class Person04 {
    public void execute(Compute02 compute02) {
        String result = compute02.calc(25, 36);
        System.out.println(result);


    }

    public int mul(int x, int y) {
        return x * y;
    }

    public double div(int x, int y) {
        return (double) x / y;
    }
}


public class LambdaMain04 {


    public static void main(String[] args) {
        Person04 person04 = new Person04();

        person04.execute((x, y) -> {
            int result = x + y;
            return x + " + " + y + " = " + result;
        });

        person04.execute((x, y) -> {
            return x + " + " + y + " = " + (x + y);
        });

        //실행문이 1개일 경우에는  {} 와 같이 return 생략가능
        person04.execute((x, y) -> x + " - " + y + " = " + (x - y));

        person04.execute((x, y) -> x + " * " + y + " = " + person04.mul(x, y));

        person04.execute((x, y) -> x + " / " + y + " = " + person04.div(x, y));

    }
}
