package com.kita.first.level3;

public class ProGamer {
	void playGame(Game game) { // 게임클래스의 게임을 받는다
		// 부모타입을 매개변수로 받으면 자식이 영향을 받는다. 그래서 오버로딩 없이 부모의 메소드 하나로 사용이 가능하다.
		game.play();
	}
}
