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
public class Card implements StrategyPayment{
    
    public Card() {
    }

    public void pay() {
        System.out.println("Card");
    }
    
}




