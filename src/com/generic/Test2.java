package com.generic;

class Box2<T>{
	
	private T t;
	
	public void set(T t){
		this.t = t;
	}
	
	public T get(){
		return t;
	}
	
	public <U> void print(U u){//�޼ҵ忡���� ���
		
		System.out.println(u);
		System.out.println("t Ŭ����: "+t.getClass().getName());
		System.out.println("u Ŭ����: "+u.getClass().getName());
		
	}
	
	
}

public class Test2 {

	public static void main(String[] args) {
		
		Box2<Integer> b = new Box2<Integer>();
		b.set(new Integer(30));
		b.print("Test");
		b.print(50);
		
	}

}
