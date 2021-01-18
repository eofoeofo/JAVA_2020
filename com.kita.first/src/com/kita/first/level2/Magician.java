package com.kita.first.level2;

public class Magician extends Adventurer {
	int mp;
	
	Magician(int strength, int intellegence, int dexterity, int luck, int mp){ 
		super(strength, intellegence, dexterity, luck); // Adventurer생성자의 4개짜리 매개변수를 상속받겠다는 뜻.
		// 생성자에서 선언을 했기때문에 super에서는 타입을 안써도 된다.
		this.mp = mp;
	}
	
	//오버라이드 
	@Override // 오버라이드를 지정해주면 만약 부모와 자식간 메소드의 이름을 틀리게 작성할 경우 빨간줄이 뜬다. 
	void attack() { // 부모클래스 attack()메소드를 자식메소드에서 이름은 같지만 내용을 변경한다 (오버라이딩 이라고 한다)
		System.out.println("마법 공격을 한다");
	}
//	@Override
//	void jump() {
//		System.out.println("하향점프를 한다");
//	}
	void teleport() {
		System.out.println("이동한다.");
	}
}
