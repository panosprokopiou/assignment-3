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
public enum Size {
     
    S(3), M(6), L(9), XL(12);
    

    private int value;

    private Size(int y) {
        this.value = y;
    }

    public int getValue() {
        return this.value;
    }
}
