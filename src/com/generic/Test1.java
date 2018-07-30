package com.generic;
//���ʸ�(Generic)

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
		b2.set("����");
		String s = b2.get();
		System.out.println(s);//����
		System.out.println(s.toString());//����
		
		Box b3 = new Box();
		b3.set(30);//upcast
		Integer ii = (Integer)b3.get();//downcast
		System.out.println(ii);//30
		
				
		
	}

}
