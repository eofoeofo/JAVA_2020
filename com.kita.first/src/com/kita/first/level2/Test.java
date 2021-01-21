package com.kita.first.level2;

import com.kita.first.level2.mamamoo.*;
//import com.kita.first.level2.*; <-- level2의 하위폴더까지 데려오지 못한다. level2의 하위폴더를 제외한 .java 들만 가져올수있다.
public class Test {
	public static void main(String[] args) {
//		com.kita.first.level2.pack1.Class1 c1 = new com.kita.first.level2.pack1.Class1(2);
//		com.kita.first.level2.pack2.Class1 c2 = new com.kita.first.level2.pack2.Class1();
		
		Hwasa hs = new Hwasa(); // defualt라서 원래는 안된다. 되게하려면 import와 public을 선언해야함
		Car car1 = new Car(30);
		car1.setSpeed(40); // void형
		int car1Speed = car1.getSpeed();
		System.out.println(car1Speed); //
		
		car1.setColor("블랙"); // void형
		String car1Color = car1.getColor();
		System.out.println(car1Color);
		
		car1.setColor("파란색"); // void형
		System.out.println(car1Color); // getColor에 파란색을 담지 않았으니까 처음값인 블랙에서 파란색으로 변하지 않는다.
		
		IMac myIMac = new IMac(500,"스페이스 그레이"); // void형
		myIMac.setMemory(800);
		myIMac.setMemory(600);
		int myMemory = myIMac.getMemory(); // 비 void 형은 리턴이기에
		System.out.println(myMemory);
	}
}
