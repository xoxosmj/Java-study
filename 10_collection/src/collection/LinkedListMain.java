package collection;

import java.util.LinkedList;

import static java.lang.System.out;

public class LinkedListMain {

    public static void main(String[] args) {

        String[] item = {"소나타", "렉스톤", "재규어"};

        LinkedList<String> queue = new LinkedList<>();

        for (String n : item)
            queue.offer(n); //요소 추가

        out.println("queue의 크기 : " + queue.size() + "\n");
        String data = "";

        while ((data = queue.poll()) != null) {
            out.println(data + " 삭제!");
            out.println("queue의 크기 : " + queue.size() + "\n");
        }
    }
}
