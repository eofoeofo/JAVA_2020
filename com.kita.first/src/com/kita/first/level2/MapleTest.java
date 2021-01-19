package com.kita.first.level2;

public class MapleTest {
	public static void main(String[] args) {
	Adventurer adv = new Adventurer(10,10,10,10); // 
	Magician mag = new Magician(10,20,10,10,100);	
	
	System.out.println("모험가의 인트 : "+adv.intellegence);
	System.out.println("법사의 인트 : "+mag.intellegence);
//	System.out.println(adv.mp); // adv에는 mp가 없다
	System.out.println("법사의 마나 : "+mag.mp);
	
	// 메소드 호출 방식
	adv.attack();
	mag.attack();
//	adv.teleport(); // adv에는 teleport가 없다
	mag.teleport();
	adv.jump();
	mag.jump(); // 먼저 자기의 메소드를 확인 한 뒤, mag 메소드가 있으면 그것을 쓰고 없으면 부모 메소드인 adv의 jump메소드를 사용해준다.
	}
}
