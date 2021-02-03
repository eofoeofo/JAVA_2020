package com.kita.first.level4;

public class Test {
	public static void main(String[] args) {
		
		// 한곳에서만 쓰는 경우에 익명 개체는 효율적이다. 깔끔하다.
		// 자식 메소드를 만들고 뭐하고 뭐하는게 복잡 하기에 익명개체는 중괄호 안에서 해결할 수 있기때문에 효율적이다.
		// 한 클래스, 재 사용 할 일 없을 때, 이 클래스를 한 번만 쓸 경우.
		//			     부모타입
		Parent p = new Parent() { // 익명 개체. 타입 없음 , 부모타입의 변수를 받아야한다 
			int childField; // 필드 생성 가능
			
			void childMethod() {
				Parent childVar = new Parent() {
					@Override
					void parentMethod() {
						System.out.println("2");
					}
				}
			}; // 메소드 생성 가능
			void childMethod2(Parent parent) {
				
			}
			
			@Override // Override 가능
			void parentMethod() {
				System.out.println("자식 객체 입니다");
			};
		}; /// 세미콜론존재, 이클립스가 무언가 실행한다고 생각하기 때문에 필요함
//		AkmuAlbum alb = new MusicPlayer();
//		alb.playAkmuAlbum();
		p.parentMethod(); // 객체가 들어갈 수 있는, 필드 매개변수에도 들어갈수있다
		//
		Child child = new Child();
		child.childMethod();
		child.childMethod2(new Parent() {
			@Override
			void parentMethod() {};
		});
		
//		
//		// throws를 계속 다른 클래스에 던져줘도 되는데, main메소드에서는 무조건 처리 해야한다.
//		ThrowsException te = new ThrowsException(); // throws 사용 하는 법
//		try { // 예외 처리를 던져서 나중에 처리하겠다는 뜻
//			// 메인 메소드에 반드시 throw를 이렇게 잡아서 처리해야한다.
//			te.method1();
//		} catch(Exception e) {
//			
//		}
////		AkmuAlbum album = new AkmuAlbum(); // 인터페이스에는 생성자가 없기에 객체화를 시킬 수 없다
//		// 그리고 인터페이스는 사용하려는 목적이 아니기에
//		AkmuAlbum album1 = new MusicPlayer();
//		IUAlbum album2 = new MusicPlayer(); // 다중 상속이 가능하기에 여러번의 MusicPlayer을 사용가능
//		
//		album1.playAkmuAlbum();
//		album1.stopAkmuAlbum();
////		album1.playIUAlbum(); <- 사용할 수 없다. MusicPlayer에는 Akmu,IU 메소드가 있지만,
//		// Akmu인터페이스,IU인터페이스를 거쳐가기에 사용이 안된다.
//		MusicPlayer myMp3 = (MusicPlayer)album1; // 강제 형 변환, album1보다 MusicPlayer가 더 크기에
//		// 소괄호가 없으면(강제 형변환) 에러난다.
//		myMp3.playMichaelJacksonAlbum(); // 인터페이스가 없는 자식 메소드는 
//		// 이렇게 강제 형 변환을 시켜준 뒤에 사용이 가능하다
	}
}
