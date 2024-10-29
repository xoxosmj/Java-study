package lambda;

public class LambdaMain01 {


    public void execute(Compute compute) { // 구현부
        int x = 25;
        int y = 36;

        compute.calc(5,6); // 추상메소드를 call
    }

    public static void main(String[] args) {
        LambdaMain01 lambdaMain01 = new LambdaMain01();

        lambdaMain01.execute((x,y) -> {
            int result = x + y;
            System.out.println(x+" + "+y+" = "+result);
        }); //호출

        lambdaMain01.execute((x,y)-> {
            int result = x * y;
            System.out.println(x + " * "+y+" = "+result);
        });

    }

}
