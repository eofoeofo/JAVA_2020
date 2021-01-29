package com.kita.first.level4;

public class MusicPlayer implements AkmuAlbum, IUAlbum { // 항상! Override를 해 줘야 한다
	// 다중 상속 가능, 하지만 Override를 꼭 해줘야 한다.
	// 반드시 interface의 메소드 만큼 class에서 재정의가 꼭 필요하다!!
	@Override
	public void playAkmuAlbum() { // 인터페이스에 생략된 public이 있기에 
		// 자식의 접근제한자가 부모보다 작을 수 없다. 그래서 자식에게 public이상의 접근제한자가 붙어야한다. 
		System.out.println("항해 앨범을 재생 합니다.");
	}
	@Override
	public void stopAkmuAlbum() {
		System.out.println("항해 앨범을 재생 합니다.");
	}
	@Override
	public void playIUAlbum() { // 
		// 
		System.out.println("셀러브리티 앨범을 재생 합니다.");
	}
	@Override
	public void stopIUAlbum() {
		System.out.println("셀러브리티앨범을 재생 합니다.");
	}
	public void playMichaelJacksonAlbum() {
		System.out.println("beat it! 앨범을 재생 합니다.");
	}
}
