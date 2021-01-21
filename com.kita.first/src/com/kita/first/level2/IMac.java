package com.kita.first.level2;

public class IMac {
	private int memory; // 외부 접근 불가하게 private사용
	private String color;
	
	IMac(int memory, String color) {
		this.memory = memory;
		this.color = color;
	}
	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
