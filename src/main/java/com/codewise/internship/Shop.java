/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codewise.internship;

import java.util.ArrayList;

/**
 *
 * @author Mateusz
 */
public class Shop {
    
    ArrayList<Transaction> transactions;

    public Shop() {
        transactions = new ArrayList<Transaction>();
    }
    
    void put(ID clientId, double moneys){
        this.transactions.add(new Transaction(clientId, moneys));
    }
    
    double get(ID clientId){
        double average = 0;
        
        ArrayList<Transaction> filtered = new ArrayList<Transaction>();
        int count = 0;
        //System.out.println("count:" + count);
        for(Transaction t : transactions)
            if(t.userId.equals(clientId)){
                filtered.add(t);
                count++;
                average += t.moneys;
            }
        
        average = average / count; 
        
        return average;
    }
            
    
}
