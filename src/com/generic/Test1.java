package com.generic;
//제너릭(Generic)

class Box<T>{
	
	private T t;
	
	public void set(T t){
		this.t = t;
	}
	
	public T get(){
		return t;
	}
	
}

public class Test1 {

	public static void main(String[] args) {
		
		Box<Integer> b1 = new Box<Integer>();
		
		b1.set(new Integer(10));
		Integer i = b1.get();
		System.out.println(Integer.toString(i));//10
		System.out.println(i.toString());//10
		System.out.println(i);//10
		
		Box<String> b2 = new Box<String>();
		b2.set("서울");
		String s = b2.get();
		System.out.println(s);//서울
		System.out.println(s.toString());//서울
		
		Box b3 = new Box();
		b3.set(30);//upcast
		Integer ii = (Integer)b3.get();//downcast
		System.out.println(ii);//30
		
				
		
	}

}
