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
//Panagiotis Prokopiou
public class Main {
    
    public static void main(String[] args) {
        StrategyPayment bankTransfer = new BankTransfer();
        StrategyPayment cash = new Cash();
        StrategyPayment card =new Card();
    
        Shirt ff = new Shirt(Color.BLUE, Size.S, Fabric.WOOL, bankTransfer);
        ff.buyShirt();
        
        System.out.println("Cost: " + ff.CalcPrice(ff));
        ff.setPay(card);
}

}





        