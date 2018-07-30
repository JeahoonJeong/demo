package com.class5;
//singleton
//Calendar now = Calendar.getInstance();

class Sing{
	
	private static Sing ob;
	
	public static Sing getInstance(){
		
		if(ob==null){
			ob = new Sing();
		}
		
		return ob;
	}
	
}

public class Test5 {

	public static void main(String[] args) {
		
		Sing ob1 = Sing.getInstance();
		Sing ob2 = Sing.getInstance();
		Sing ob3 = new Sing();
		
		System.out.println(ob1==ob2);
		System.out.println(ob2==ob3);
	}

}
