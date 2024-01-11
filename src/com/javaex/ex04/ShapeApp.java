package com.javaex.ex04;

public class ShapeApp {

	public static void main(String[] args) {
		
		Ractangle r01 = new Ractangle(2,5);
		Ractangle r02 = new Ractangle(2,5);
		Ractangle r03 = new Ractangle(13,34);
		
		Ractangle r04 = r03;
		
		System.out.println(r01.equals(r02));
		System.out.println(r02.equals(r01));
		
		System.out.println(r02.equals(r03));
		
		System.out.println(r03.equals(r04));
		
		System.out.println(r04.equals(r02));
		
	}

}
