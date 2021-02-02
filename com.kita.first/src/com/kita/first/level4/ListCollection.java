package com.kita.first.level4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCollection {
	public static void main(String[] args) {
		// List<내가 받고 싶은 타입명> 변수명 = new ArrayList<>(); = 제네릭 / 무슨 타입이든 들어 가기에 내가 받고 싶은 타입만 받고 싶을 때 제네릭을 사용한다.
		Object obj = 3;
		List<String> list = new ArrayList<>(); // 동적할당 // 객체 타입이라면 무슨 타입이든 들어 갈 수있다. 
		// 내가 직접 만든 객체라도 가능 // 만약 내가 만든 객체를 제네릭으로 걸어놓으면 다른 객체에 대해 제한을 둔다.
		List list2 = new LinkedList();
		int[] arr = new int[5];
		
		list.add("안녕"); //index 0, list에 값을 집어 넣는 기능 main의 뒷번째의 차곡차곡 쌓인다
		list.add("하세요"); // index 1
		list.add(2,"저는"); // index 지정도 가능.
		list.set(0, "ㅎㅇ"); // 해당 index의 값 변경
		list.remove(2); // 해당 index의 값 삭제
		
		String result = list.get(1); // index의 1번째의 값을 result에 넣는 기능.
		System.out.println("result : " + result);
		
		// ArrayList와 LinkdList의 차이점
		// ArrayList는 길이가 커지면 커질수록 속도가 느려진다.
		// LinkdList는 참조한다, 서로 인접한 주소값 끼리만 값을 참조함.
		// 예를 들어 115주소값은 앞의 주소값과 뒤의 주소값의 값을 알고있다.
		// 속도가 빠름, 삽입 삭제가 빈번한 경우에 LinkdList가 빠르다.
		// 참조를 해야하고 서로 연결되어 있기에 자료값을 확인하는 속도는 느리다. 
		// 일곱번째 인덱스를 확인 하려면 첫번쨰 인덱스를 확인 후 두번째 인덱스를 확인, 이런식으로 연결되어있기에
		// Stack -> FILO , main함수의 중괄호가 제일 늦게 닫히니 FILO의 개념이다.
		// Q -> FIFO, LinkdList는 Q의 개념 , 순차적으로 처리하는 개념들은 보통 Q이다.
		
		List<Cd> shelf = new LinkedList<Cd>();
		Cd cd1 = new Cd("여름","IU",2019);
		Cd cd2 = new Cd("항해","AKMU",2020);
		shelf.add(cd1); // 제네릭으로 Cd타입으로만 만들게 지정을 했기에 이거만 가능
		shelf.add(cd2); // shelf에 Cd2타입을 넣겠다
//		shelf.add("앨범"); // Cd타입으로만 지정 했기에 이건 에러
		shelf.add(cd2); // 중복 가능, 참조변수이기에 똑같은 주소값을 지정하는 뜻이라서.
	}
}
