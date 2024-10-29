package nested;

public class AbstractMain {
    public static void main(String[] args) {


        AbstractTest at = new AbstractTest() { //구현부를 가졋으니까 무조건 클래스인데 이름이없음 = 익명 클래스
            //익명 Inner class
            //★위의 new 는 AbstracTest()를 new하는게 아니라 익명 Inner class 를 new 하는것

            @Override
            public void setName(String name) {

            }
        };

        InterA in = new InterA() {  //new 키다리아저씨(익명 이너클래스)사용
            //인터페이스는 new가 불가능
            //일회용임

            @Override
            public void aa() {

            }

            @Override
            public void bb() {

            }
        };

        AbstractExam ae = new AbstractExam() {
        };
        //Exam클래스는 추상메소드가없기때문에 개발자가 원하는거만 Override 가능
        //하기싫으면 안해도댐

    }
}