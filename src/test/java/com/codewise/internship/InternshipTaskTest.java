package com.codewise.internship;

import org.junit.Assert;
import org.junit.Test;

public class InternshipTaskTest {

    @Test
    public void shouldWork() {
        //Assert.fail("Prove that your solution works by implementing appropriate tests. You don't have to use JUnit.");
        
        ID A = new ID("A");
        ID B = new ID("B");
        ID C = new ID("C");
        
        Shop amazon = new Shop();
        //while(true){
        
        TestThread t1 = new TestThread(amazon, B);
        Thread t1_thread = new Thread(t1);
        t1_thread.start();

        TestThread t2 = new TestThread(amazon, A);
        Thread t2_thread = new Thread(t2);
        t2_thread.start();
        
        TestThread t3 = new TestThread(amazon, C);
        Thread t3_thread = new Thread(t3);
        t3_thread.start();

        System.out.println("Client " + A.name + ": " + amazon.get(A));
        System.out.println("Client " + B.name + ": " + amazon.get(B));
        System.out.println("Client " + C.name + ": " + amazon.get(C));
        //}
        
    }
}