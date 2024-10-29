package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressMain {


    public static void main(String[] args) throws UnknownHostException {
        //    InetAddress naver = new InetAddress();  //InetAddress 는 기본생성자가 없어서 new가 안됨
        InetAddress naver = InetAddress.getByName("www.naver.com");
        System.out.println("Naver IP = " + naver.getHostAddress());
        System.out.println();
        InetAddress local = InetAddress.getLocalHost();
        System.out.println("Local IP = " + local.getHostAddress());
        System.out.println();

        InetAddress[] naver02 = InetAddress.getAllByName("www.naver.com");   //

        for (InetAddress data : naver02) {
            System.out.println("Naver IP = " + data.getHostAddress());
        }


    }


}
