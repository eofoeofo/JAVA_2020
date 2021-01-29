package com.kita.first.level4;

public class Test {
	public static void main(String[] args) {
		ThrowsException te = new ThrowsException(); // throws 사용 하는 법
		try { // 예외 처리를 던져서 나중에 처리하겠다는 뜻
			// 메인 메소드에 반드시 throw를 이렇게 잡아서 처리해야한다.
			te.method1();
		} catch(Exception e) {
			
		}
//		AkmuAlbum album = new AkmuAlbum(); // 인터페이스에는 생성자가 없기에 객체화를 시킬 수 없다
		// 그리고 인터페이스는 사용하려는 목적이 아니기에
		AkmuAlbum album1 = new MusicPlayer();
		IUAlbum album2 = new MusicPlayer(); // 다중 상속이 가능하기에 여러번의 MusicPlayer을 사용가능
		
		album1.playAkmuAlbum();
		album1.stopAkmuAlbum();
//		album1.playIUAlbum(); <- 사용할 수 없다. MusicPlayer에는 Akmu,IU 메소드가 있지만,
		// Akmu인터페이스,IU인터페이스를 거쳐가기에 사용이 안된다.
		MusicPlayer myMp3 = (MusicPlayer)album1; // 강제 형 변환, album1보다 MusicPlayer가 더 크기에
		// 소괄호가 없으면(강제 형변환) 에러난다.
		myMp3.playMichaelJacksonAlbum(); // 인터페이스가 없는 자식 메소드는 
		// 이렇게 강제 형 변환을 시켜준 뒤에 사용이 가능하다
	}
}
