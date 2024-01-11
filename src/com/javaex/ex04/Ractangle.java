package com.javaex.ex04;

public class Ractangle {

	// 필드
	public int width;
	public int height;

	// 생성자
	public Ractangle() {
		super();
	}

	public Ractangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	// 메소드 gs
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	// 메소드 일반
	@Override
	public String toString() {
		return "Ractangle [width=" + width + ", height=" + height + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Ractangle r =(Ractangle)obj;
	
		if(this.width==r.width && this.height==r.height ) {
			return true;
		}else {
			return false;
		}
	}
	
	

}
