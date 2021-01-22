package com.kita.first.level3;

public class ComicBook extends Book {
	public ComicBook(int maxChapter) {
		super(maxChapter);
	}
	@Override
	boolean read() {
		++chapter;
		if(chapter < maxChapter) {
			System.out.println("만화책을 읽는다.");
			return true;
		} else { // true가 들어가면 if문이 끝나기에 else를 쓰지 않아도됨
			System.out.println("만화책을 이미 다 읽었다.");
			return false;
		}
	}
}
