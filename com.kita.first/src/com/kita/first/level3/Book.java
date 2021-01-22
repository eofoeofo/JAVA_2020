package com.kita.first.level3;

public class Book {
	public int chapter = 0;
	public int maxChapter;
	
	public Book(int maxChapter) {
		this.maxChapter = maxChapter;
	}
	
	boolean read() {
		++chapter;
		if(chapter < maxChapter) {
			System.out.println("책을 읽는다.");
			return true;
		} else { // true가 들어가면 if문이 끝나기에 else를 쓰지 않아도됨
			System.out.println("책을 이미 다 읽었다.");
			return false;
		}
	}
	
	public int getChapter() {
		return chapter;
	}


	public void setChapter(int chapter) {
		this.chapter = chapter;
	}


	public int getMaxChapter() {
		return maxChapter;
	}


	public void setMaxChapter(int maxChapter) {
		this.maxChapter = maxChapter;
	}
}
