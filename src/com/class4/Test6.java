package com.class4;

public class Test6 {

	public static void main(String[] args) {
		
		String s1 = "서울,부산,대구";
		String[] ss = s1.split(",");
		
		for(String s : ss){
			System.out.println(s);
		}
		
		String s2 = "seoul";
		String s3 = "SEOUL";
		
		System.out.println(s2.equals(s3));
		
		long start = System.nanoTime();
		System.out.println(s2.equals(s3.toLowerCase()));
		long end = System.nanoTime();
		
		System.out.println(start-end);
		
		String s4 = "abc.def.hij";
		//           0123456789....
		System.out.println(s4.indexOf("."));
		System.out.println(s4.lastIndexOf("."));
		System.out.println(s4.indexOf("def"));
		System.out.println(s4.indexOf("x"));//-1
		System.out.println(s4.indexOf("j"));
		
		System.out.println(s4.indexOf("z")==-1);
		
		String s5 ="우리나라 대한민국 좋은 나라";
		String s6 = s5.replaceAll("대한","大韓");
		System.out.println(s6);
		
		String s7 = "  a  b  c";
		System.out.println(s7);
		System.out.println(s7.trim());
		System.out.println(s7.replaceAll(" ", ""));
		System.out.println(s7.replaceAll("\\s", ""));
		
		char ch = "abcdefg".charAt(2);
		System.out.println(ch);
		
		System.out.println("abcdefg".startsWith("abc"));
		
		System.out.println("abcdefg".length());
		
		String s8 = "abcdefg";
		String s9 = "abcddfg";
		
		//사전식배열
		System.out.println(s8.compareTo(s9));
		System.out.println(s9.compareTo(s8));
		
		
		
		
	}

}
