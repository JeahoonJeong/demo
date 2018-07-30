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
			
			if(this.hak.equals(t.hak) &&//String �� equals 
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
		ob1.set("182222", "�����", 60, 80);
		TestImpl ob2 = new TestImpl("182222", "�����", 70, 70);
		
		String ob3 = "�����";
		
		
		
		if(ob1.equals(ob2)){//equals �������̵�
			System.out.println("�����ϴ�.");
		}else{
			System.out.println("�������� �ʴ�.");
		}


		if(ob1.equals(ob3)){//equals �������̵�
			System.out.println("�����ϴ�.");
		}else{
			System.out.println("�������� �ʴ�.");
		}
		
		
		ob1.write();
		System.out.println(ob1);
		ob2.write();
		System.out.println(ob2);
		
		//Test ob3 = new TestImpl();
		//ob3.set(); �θ�Ŭ������ set()�̾���.
		
				
		
		
	}

}
