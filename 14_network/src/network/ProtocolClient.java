package network;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ProtocolClient {
    Socket socket; //소켓이 핸드폰이라고 생각
    BufferedReader br;
    BufferedWriter bw;
    Scanner sc;
    public static int PORT = 9400;

    public ProtocolClient() {
        try {
            socket = new Socket("localhost", PORT);

            //IO
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            sc = new Scanner(System.in);


        } catch (UnknownHostException e) {
            System.out.println("서버를 찾을 수 없습니다");
            e.printStackTrace();
            System.exit(0);
        } catch (IOException e) {
            System.out.println("서버와 연결이 안되었습니다");
            e.printStackTrace();
            System.exit(0);
        }

        String message, line;

        try {
            while (true) {
                //서버로 보내기
                System.out.println();
                System.out.println("입장은 100:대화명 이라고 입력하세요");
                System.out.println("퇴장은 200:대화명 이라고 입력하세요");
                System.out.println("메세지는 300:대화명:메세지 이라고 입력하세요\n");

                message = sc.nextLine();

                bw.write(message + "\n");  //저쪽에서 읽을때 br.readLine()으로 읽을건데 엔터처리를못하기때문에 반드시 \n을 포함해서 보내줘야함
                bw.flush();

                //서버에서 받아오기
                line = br.readLine();
                System.out.println(line); //서버에서 받은값 출력

                //200:apple -> "200","apple" 으로 분리해야함
                String[] ar = message.split(":");

                //if (ar[0].equals("200")) {
                if (ar[0].equals(Protocol.EXIT)) { //종료
                    br.close();
                    bw.close();
                    socket.close();

                    System.out.println("클라이언트 종료");
                    System.exit(0);
                }

            }

        }// while 전화를 끊을때까지
        catch (IOException e) {
            e.printStackTrace();
        }


    } //ProtocolClient

    public static void main(String[] args) {
        new ProtocolClient();
    }


}

