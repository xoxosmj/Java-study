package network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

import static network.ProtocolClient.PORT;

public class ProtocolServer {
    ServerSocket serverSocket; //클라이언트가 올때까지 기다린다
    Socket socket;
    BufferedReader br;
    BufferedWriter bw;

    public ProtocolServer() {
        try {
            serverSocket = new ServerSocket(PORT); // 9500포트에 클라이언트가 들어오길 대기
            System.out.println("서버 준비완료...");

            socket = serverSocket.accept(); // 클라이언트를 낚아채서 대화할 소켓을 생성한다.

            br = new BufferedReader(new InputStreamReader(socket.getInputStream())); // IO 생성
            bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        } catch (IOException e) {
            //연결안되면 끊어버림
            System.out.println("클라이언트와 연결이 안되었습니다");
            e.printStackTrace();
            System.exit(0);

        }
        //
        String line;

        try {
            while (true) {
                //클라이언트로부터 받기
                line = br.readLine();
                System.out.println(line);


                //클라이언트로 보내기
                String[] ar = line.split(":"); // : 으로 나눔
                if (ar[0].equals(Protocol.ENTER)) {//입장 => 100:대화명
                    bw.write(ar[0] + "님 입장하였습니다\n"); // 반드시 \n입력
                    bw.flush();

                } else if (ar[0].equals(Protocol.EXIT)) {
                    bw.write(ar[0] + "님 퇴장하였습니다\n");
                    bw.flush();

                    br.close();
                    bw.close();
                    socket.close();

                    System.out.println("서버 종료");
                    System.exit(0);

                } else if (ar[0].equals(Protocol.SEND_MESSAGE)) { //메세지 => 300:대화명:메세지
                    bw.write("[" + ar[1] + "]" + ar[2] + "\n");
                    bw.flush();
                }

            }//while
        } catch (IOException e) {
            e.printStackTrace();
        }


    }// ProtocolServer

    public static void main(String[] args) {
        new ProtocolServer();

    }
}
