package com.kita.first;

public class Printf {
	public static void main(String[] args) {
		System.out.print("안녕하세요\n");
		System.out.println("안녕하세요");
//		System.out.printf("안녕하세요\n");

		int age = 10;
		String name = "김땡땡";
		
		System.out.println(name + "은" + age + "살이다.");
		System.out.println("김땡땡은 10살이다");
		
		System.out.printf("%s은 %d살이다.\n", name,age);
		
//		올해로 20살이 된 김땡땡은
//		알바를 시작하여 매달 123만원을 받게 되었다.
//		김땡땡은 월급의 50%인 615000을 떼어
//		A 저축은행의 연 이자율2.33%짜리 적금에 넣기로 결심했다.
		
		age = 20;
		name = "김땡땡";
		int salary = 1_230_000;
		int percent = 50;
		int savings = 615_000;
		char bank = 'A'; 
		double rateOfInterest = 2.333333333;
		
		System.out.printf("올해로 %d살이 된 %s은\n알바를 시작하여 매달 %,d원을 받게 되었다.\n",
				age,name,salary);
		System.out.printf("%s은 월급의 %d%%인 %,d을 떼어\n%c 저축은행의 연 이자율%.2f%%짜리 적금에 넣기로 결심했다.",
				name,percent,savings,bank,rateOfInterest);
		
	}

}
