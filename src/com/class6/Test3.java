package com.class6;

//Interface
//1.추상클래스의 일종 선언만 있고 정의(내용)가 없다.
//2.final변수만 정의할수있다.
//3.인터페이스를 구현하기 위해서는 implements를 사용한다.
//4.하나이상의 인터페이스를 implements한 클래스는 
//  인터페이스의 모든 메소드를 override해야한다.
//5.인터페이스가 인터페이스를 상속받을수 있으며 이때 extends
//  키워드를 사용한다.
//6.인터페이스는 다중 상속이 가능하다.
//7.인터페이스는 저장소이다.
//8.강제적용이 가능하다. (강제적으로 메소드를 오버라이드 해야한다.)

interface Fruit{
	
	String Won = "원";//변수 대문자 final, public static final 생략
	
	int getPrice();// public  abstract 생략
	
	public String getName();
}

class FruitImpl implements Fruit{//implement한 클래스이름 생성 규칙? xxxxImpl

	@Override
	public int getPrice() {
		return 1000;
	}

	@Override
	public String getName() {
		return "사과";
	}
	
	public String getItems(){
		return "과일";
	}
}

public class Test3 {

	public static void main(String[] args) {
		FruitImpl ob1 = new FruitImpl();
		
		System.out.println(ob1.getItems()+":"+ob1.getName()+" 가격:"
				+ob1.getPrice()+Fruit.Won);
		
		Fruit ob2 = ob1;//upcast
		
		System.out.println(ob2.getName());//abstract 메소드라서 자식의 메소드를 사용할수 있다.
		
		//System.out.println(ob2.getItems); 사용할 수 없다. 부모가 가지고있지 않다.
		
		//자식의 생성자로 부모클래스 객체를 생성할수 있다.
		//하지만 자식의 메소드를 사용할 수 없다.
		
	}

}
