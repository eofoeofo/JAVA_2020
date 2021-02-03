package com.kita.first.level4;

import java.io.File;
import java.io.IOException;

public class File01 {
	public static void main(String[] args) {
		File file01 = new File("C:/Program Files/JAVA_SH/file_test/file01.txt");
		boolean isExist = file01.exists(); // 해당 경로의 파일이 실재하는지 체크 기능
		
		if(isExist == false) {
			file01.mkdirs();
			try {
				file01.createNewFile();
			} catch(IOException e) {
				
			} catch(Exception e) {
				
			}
		}
		String file01Path = file01.getPath(); // 경로 값 던져 주기
		boolean result2 = file01.isDirectory(); // 보통 boolean값으로 받는 경우에 is가 붙는 경우가 많다.
		boolean result3 = file01.isFile();
		
	}
}
