package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream {

	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.txt"));
		int data;
		
		//파일에서 1글자씩 읽기
		while( (data=bis.read()) != -1 ) {
			System.out.print((char)data);
		}//while
		System.out.println();
		
		bis.close();

	}

}
