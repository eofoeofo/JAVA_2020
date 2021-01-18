package com.kita.first.level2;

public class Adventurer {
	int strength;
	int intellegence;
	int dexterity;
	int luck;
	
	// 생성자는 클래스와 이름이 같아야한다
	Adventurer(int strength, int intellegence, int dexterity, int luck) {
		this.strength = strength;
		this.intellegence = intellegence;
		this.dexterity = dexterity;
		this.luck = luck;
	}
	
	void attack() {
		System.out.println("일반 공격을 한다.");
	}
	
	void jump() {
		System.out.println("점프를 한다.");
	}

}
