package com.stackroute.demojava;


public class MainApp2 {
	
    public static void main( String[] args ){
    	
        int[] numArray = new int[10];
        
        int value = 0;
        
        for(int index=0;index < numArray.length;index++) {
        	value+=2;
        	numArray[index] = value; 
        }
        
        for(int i=0;i < numArray.length;i++)
        	System.out.println(numArray[i]);
        
        
    }
}
