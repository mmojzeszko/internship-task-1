/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codewise.internship;

import java.util.Random;

/**
 *
 * @author Mateusz
 */
public class TestThread implements Runnable{

    final Shop amazon;
    ID clientId;        //client id
    double min = 0.01f; //minimal cost of product
    double max = 1000f; //maximal cost of product
    boolean big = false;    //value to determine whenever client is buying a lot
    
    public TestThread(Shop amazon, ID clientId) {
        this.amazon = amazon;
        this.clientId = clientId;
        
        Random rand = new Random();
        big = rand.nextBoolean();
    }
    
    public void run() {
        if(big){
            for(int i = 0; i < 200; i++){
                Random rand = new Random();
                double cost = min + (max - min) * rand.nextDouble();
                //System.out.println(cost);
                synchronized(amazon){
                    amazon.put(clientId, cost);

                }
            }
        }else{
            for(int i = 0; i < 10; i++){
                Random rand = new Random();
                double cost = min + (max - min) * rand.nextDouble();
                //System.out.println(cost);
                synchronized(amazon){
                    amazon.put(clientId, cost);

                }
            }
        }
    }
    
}
