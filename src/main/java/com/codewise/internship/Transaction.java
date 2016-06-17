/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codewise.internship;

/**
 *
 * @author Mateusz
 */
public class Transaction {

    ID userId;
    double moneys;
    
    public Transaction(ID userId, double moneys) {
        this.userId = userId;
        this.moneys = moneys;
    }
    
}
