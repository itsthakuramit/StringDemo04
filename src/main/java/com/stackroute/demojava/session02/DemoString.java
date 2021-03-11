package com.stackroute.demojava.session02;

	
public class DemoString{
	
	
	public static void main(String[] args) {
		
		
		String welcomemsg = "Welcome to Java";
		String welcome1 = new String("Welcome to Java");
		String welcome2 = new String("Welcome to Java");
		
		char[] techtopic = {'J','a','v','a'};
		
		String topic = new String(techtopic);
		
		//System.out.println(welcomemsg);
		System.out.println(welcome1.equals(welcome2));
		System.out.println(welcome2.equals(welcomemsg));
		//System.out.println(topic);
		
		//System.out.println(welcome1.charAt(10));
		
		System.out.println(welcome1.endsWith("Java"));
		System.out.println(welcome1.startsWith("Welcome"));
		
		String wel = " t e ";
		System.out.println(wel.isBlank());
		
		StringBuffer sb = new StringBuffer(wel);
		sb.reverse();
		System.out.println(sb);
		
		String welcome3 = new String("Welcome to Java");
		welcome3.replace('e','$');
		System.out.println(welcome3);
		
		String welcome4 = new String("Welcome to Java");
		System.out.println(welcome4);
		
	}
	
}