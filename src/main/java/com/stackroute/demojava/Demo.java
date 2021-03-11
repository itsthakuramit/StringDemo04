package com.stackroute.demojava;



class Demo1{

	int currenyear = 2021;

}

public class Demo{
	
	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		d1.currenyear = 2022;
		
		Demo1 d2 = new Demo1();
		d2.currenyear = 2023;
		
		Demo1 d3 = new Demo1();
		System.out.println(d3.currenyear);
	}
	
	
}