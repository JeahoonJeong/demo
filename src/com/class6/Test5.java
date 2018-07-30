package com.class6;

import java.util.Scanner;

interface FruitA{
	
	String Won = "원";
	
	public int getPrice();
	public String getName();
	
}

interface ItemFruit extends FruitA{
	public String getItems();
	
}

class Orange implements ItemFruit{

	@Override
	public int getPrice() {
		return 1000;
	}

	@Override
	public String getName() {
		return "오렌지";
	}

	@Override
	public String getItems() {
		return "과일";
	}
	
	
}

class Apple implements ItemFruit{

	@Override
	public int getPrice() {
		return 2000;
	}

	@Override
	public String getName() {
		return "사과";
	}

	@Override
	public String getItems() {
		return "과일";
	}
	
}

public class Test5 {

	public void packing(ItemFruit ob1){
		
		
		System.out.println(ob1.getItems());
		
		System.out.println(ob1.getName());
		
		System.out.println(ob1.getPrice()+FruitA.Won);
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Test5 t = new Test5();
		
		System.out.print("1.오렌지 2.사과");
		int num = sc.nextInt();
		
		if(num==1){
			t.packing(new Orange());
		}else if(num==2){
			t.packing(new Apple());
		}
		
		
		System.out.println("--------------------------------");
		
		ItemFruit ob1 = new Orange();
		t.packing(ob1);
		
		ob1 = new Apple();
		
		System.out.println(ob1.getItems());
		
		System.out.println(ob1.getName());
		
		System.out.println(ob1.getPrice()+FruitA.Won);
		
		int a;
		a = 10;
		System.out.println(a);
		
		a = 20;
		System.out.println(a);
		
		System.out.println(new Orange());
		System.out.println(new Orange());
		//new 연산자의 리턴? > reference
		
		
		
		
	}

}
