package com.computerframe.code;
import com.computerframe.root.Component;

public class MyFirstProgram{
	// Variables
	private static Component com1 = new Component("xDDD", 10, 10);
	public static void main(String[] args) {
		while(true) {
			if(com1.touched()) {
				System.out.println("Touched!");
			}
		}
	}
}
