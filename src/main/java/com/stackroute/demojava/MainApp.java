package com.stackroute.demojava;


public class MainApp {
	
    public static void main( String[] args ){
    	
        int[][] numArray = new int[3][3];
        
        
        int counter = 0;
        for(int i=0;i < numArray.length;i++) {
        	for(int j=0; j < numArray[i].length;j++) {
        		counter = counter + 2;
        		numArray[i][j] = counter;
        	}
        }

        for(int i=0;i < numArray.length;i++) {
        	for(int j=0; j < numArray[i].length;j++) {
        		System.out.println(numArray[i][j]);
        	}
        }
    }
}
