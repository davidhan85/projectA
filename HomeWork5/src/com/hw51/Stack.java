package com.hw51;
//import java.util.Scanner;

public class Stack {
//	Scanner scanner=new Scanner(System.in);
int[] x=new int[3];
int top=0;	
	void push(int y) {
		try {
//			for(int i=0;i<x.length;i++)
		//	x[top]=y;
			if(top<3) {				
				top++;							
			}
			else {
				throw new StackFullException();
			}
	 		
	 	}catch(StackFullException e) {
	 		System.out.println("StackFullException");}
	 //	 catch(ArrayIndexOutOfBoundsException e) {
	 //		System.out.println("ArrayIndexOutOfBoundsException");
	 	 }
	 	
		
		//}
	int pop() {
		try {
//			for(int j=3;j>x.length;j--)
						
			if(top<=0) {
				throw new StackEmptyException();							
			}
			else {
				top--;
				
			}		
	 	}catch(StackEmptyException e) {
	 		System.out.println("StackEmptyException");
	 		
	 	}
		return top;				
		}
	
 
}
