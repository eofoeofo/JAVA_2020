package com.kita.first.level4;

public interface AkmuAlbum {
	// 인터페이스는 설계 하는 방법을 정의한다
	// 클래스와의 차이점은,
	// 인터페이스에서는 상수 필드만 들어갈 수 있다.
	public static final String SONG_WRITER = "이찬혁"; // 상수, 항상 늘 변하지 않는 값을
	// interface에는 상수자리에 public static final을 생략 해줘도 된다. 자동으로 넣어준다.
	public static final int PRICE = 20_000; // 생략된 public static final
	
	// 추상 메소드
	void playAkmuAlbum(); // 추상 메소드에는 public abstract이 생략되어있다.
	void stopAkmuAlbum();
}
