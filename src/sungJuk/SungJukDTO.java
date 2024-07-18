package sungJuk;

public class SungJukDTO implements Comparable<SungJukDTO> {

    private String name;
    private int no, kor, eng, math, tot;
    private double avg;


    public SungJukDTO() {
    }
    //에러 방지 차원에서 기본생성자 만듬.

    public SungJukDTO(int no, String name, int kor, int eng, int math) {
        this.no = no;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        calc();
    }

    public void calc() {
        tot = kor + eng + math;
        avg = tot / 3.0;

    }


    public String getName() {
        return name;
    }

    public int getNo() {
        return no;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getTot() {
        return tot;
    }

    public double getAvg() {
        return avg;
    }

    public void setTot(int tot) {
        this.tot = tot;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }


    @Override
    public String toString() {
        return no + "\t" + name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + tot + "\t" + String.format("%.2f", avg);
    }

    @Override
    public int compareTo(SungJukDTO o) {
        return 0;
    }
}
