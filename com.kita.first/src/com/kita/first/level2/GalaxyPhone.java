package com.kita.first.level2;
// 상속 받는 이유는 휴대폰의 기능은 공통된 부분이 많다(ex, 문자, 전화 등등) 공통된 부분은 클래스에 필드로 지정을 해주고,
// 공통된 부분은 클래스를 상속을 받고, 그렇지 않은, 삼성의 빅스비,삼페 등을 상속단에서 따로 지정을 해준다.
// 상속을 받게되면 굳이 여러개의 
public class GalaxyPhone extends Phone { // Phone 클래스를 상속 받겠다
	String ai_secr;
	GalaxyPhone(String name, String color, int memory, String ai_secr) {// 여기 매개변수에 상속을 받았기 때문에 super에 중복 선언은 안된다 
		super("삼성",name,color,memory); // Phone생성자의 4개짜리 매개변수를 상속받겠다.
		// GalaxyPhone의 부모클래스를 호출하겠다. super는  생성자 첫째 라인에 사용됨  
		// super(); 매개변수가 없으므로 부모도 마찬가지로 매개변수가 없는 Phone(); 을 호출.
		// 위에서(Object->Phone) 아래로 상속받는다.
		this.ai_secr = ai_secr;
	}

	void paSamsungMoney() {
		System.out.println("삼성페이를 사용했다.");
	}
}
