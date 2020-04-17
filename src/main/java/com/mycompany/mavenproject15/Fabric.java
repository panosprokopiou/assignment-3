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
public enum Fabric {
    
    WOOL(5), COTTON(9), POLYESTER(10), CASHMERE(50), SILK(120);

    private int value;

    private Fabric(int y) {
        this.value = y;
    }

    public int getValue() {
        return this.value;
    }
}
