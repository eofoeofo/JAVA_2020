package com.kita.first.level3;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
//		int result = Integer.parseInt(sc.next()); // 바로 담지못함(문자열로 입력받는다)
		ScanNum sn = new ScanNum();
		String str = sn.inputNumString();
		int result = Utils.parseStrToInt(str);
		sn.printMsg(result);
//		if (result == 0) { // 0이라는건 문자열이 섞여서 에러가 터졌다는 뜻
//			System.out.println("잘못 입력 했습니다.");
//		} else {
//			System.out.println("입력한 숫자 : " + result);
//		}
		// 메소드안에 메소드는 입력할수없다. ex) main 메소드 안에 메소드
		
//		Animal animal = new Animal();
//		Cat cat = new Cat();
//		Dog dog = new Dog();
//		animal = new Animal(); // 5 line과 다름
//		// 동물이 운다
//		animal.crying();
//		// 고양이가 야옹 운다
//		animal = cat;
//		animal = new Cat();
//		animal.crying(); // 일일이 타입을 바꾸지 않아도 다형성으로 인하여 타입이 변하게 됨.
//		// 개가 멍멍 운다
//		animal = dog;
//		animal.crying(); // 부모타입에 있는 필드,메소드의 경우에만 다형성이 사용가능하다.
////		animal.barking(); // 자식 클래스 해당 메소드가 있지만 부모 클래스에는 없는 경우에 호출 불가. 부모클래스->자식클래스 순으로 값을 찍어본다
//		Dog dog1 = (Dog)animal; // 객체의 강제 형변환. 18번 라인 해결방법
//		dog1.barking();
//		
//		boolean result1 = animal instanceof Dog;
//		System.out.println(result1);
//		
//		// animal엔 cat의 주소값이 들어가게 된다 그래서 animal을 찍으면 cat의 주소값이 나오게 됨.(animal의 주소값은 사라지고)
//		// 둘다 cat의 주소값을 쥐게됨
//		
//		System.out.println(animal);
//		System.out.println(cat);
//		System.out.println(animal == cat);
////		int n1 = 3;
////		String s1 = "1";
////		System.out.println(s1 + n1); // 자동형변환 되어서 4가 아닌 13이 된다.
//		System.out.println();
//		System.out.println();
//		
//		Student minsu = new Student();
//		
//		for(int i=1; i<=5; i++) {
//			int result22 = minsu.readBooks();
//			switch(result22) {
//			case 1: // minsu가 book1을 다 읽었을 경우
//				minsu.book1 = new ComicBook(3);
//				System.out.println("새 만화책을 가져왔다.");
//				break;
//			case 2:
//				minsu.book2 = new MajorTextBook(7);
//				System.out.println("새 전공서적을 가져왔다.");
//				break;
//			case 3:
//				minsu.book3 = new Book(4);
//				System.out.println("새 책을 가져왔다.");
//				break;
//			}
//			System.out.println("-------------");
//			System.out.println();
//			System.out.println();
//			System.out.println();
//		}
//		ProGamer p1 = new ProGamer();
//		
//		Game game = new Game();
//		p1.playGame(game);
//		
//		StardewValley sDew = new StardewValley();
//		p1.playGame(sDew); // 스타듀벨리는 게임의 자식이기에 자동 형변환이 이루어져서 p1.playGame(sDew);를 사용할 수 있게 된다. 
//		
//		Lol lol = new Lol();
//		p1.playGame(lol); // 매개 변수의 다형성
//		System.out.println("--------------------------");
//		System.out.println("--------------------------");
	}
}
