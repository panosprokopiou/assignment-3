/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject15;

/**
 *
 * @author Pan
 */
public enum Color {
    
    
    RED(1), ORANGE(2), YELLOW(3), GREEN(4), BLUE(5);
	
	
	
	//same primite type as value in ENUM property
	private int value;
	
	
	//to calculate the price
	//ENUM private constructor
	private Color(int y) {
		
		this.value = y;
	}


	public int getValue() {
		return value;
	}
	
	
	
    
    
}
