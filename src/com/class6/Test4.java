package com.class6;

interface Test{
	
	public int total();
	public void write();
	
}

class TestImpl implements Test{
	
	private String hak,name;
	private int kor,eng;
	
	public TestImpl(){}
	public TestImpl(String hak, String name, int kor, int eng){
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	public void set(String hak, String name, int kor, int eng){
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	

	@Override
	public int total() {
		return kor+eng;
	}

	@Override
	public void write() {
		System.out.println(hak +": "+name+":"+total());
	}
	@Override
	public boolean equals(Object ob) {//upcast
		
		boolean flag = false;
		
		if(ob instanceof TestImpl){
			
			TestImpl t = (TestImpl)ob; //downcast
			
			if(this.hak.equals(t.hak) &&//String 의 equals 
					this.name.equals(t.name)){
				flag = true;
			}
		}
		return flag;
	}
	
	
	
}

public class Test4 {

	public static void main(String[] args) {
		
		TestImpl ob1 = new TestImpl();
		ob1.set("182222", "배수지", 60, 80);
		TestImpl ob2 = new TestImpl("182222", "배수지", 70, 70);
		
		String ob3 = "배수지";
		
		
		
		if(ob1.equals(ob2)){//equals 오버라이딩
			System.out.println("동일하다.");
		}else{
			System.out.println("동일하지 않다.");
		}


		if(ob1.equals(ob3)){//equals 오버라이딩
			System.out.println("동일하다.");
		}else{
			System.out.println("동일하지 않다.");
		}
		
		
		ob1.write();
		System.out.println(ob1);
		ob2.write();
		System.out.println(ob2);
		
		//Test ob3 = new TestImpl();
		//ob3.set(); 부모클래스에 set()이없다.
		
				
		
		
	}

}
