package com.basics;

public class Point2D {

	
	int x;
	int y;
	public void coordinates() {
		// TODO Auto-generated method stub
		System.out.println("The coordinates are: "+x+" "+y+"");
		
	
	}
	
	public String getDetails() {
		return "coordinates ("+x+","+y+")"; 
	}	
	
	public void points (int a,int b) {
	
	  x=a;
	  y=b;
	  
	  System.out.println("Points are: "+a+" "+b+"");
	}
	

}
