package com.yedam;

/*
 * 클래스 = 설계도  : 속성(필드) + 행위(메소드)
 * 1. 클래스 선언
 * 2. 객체(인스턴스) 생성 = 메모리 할당
 * 3. 객체 사용
 */
public class Car {
	
	static String model;
	
	// 생성자 : 객체 생성 시 호출되는 메서드. 필드 초기화
	public Car(String model) {
		this.model = model;
	}
	
	
	
	public void drive() {
		System.out.println(model + "운행");
	}
}
