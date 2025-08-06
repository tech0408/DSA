package dsa.multi_threading_practice;

/*
    PS: There are 4 threads including a main thread.
    The 3 child thread prints name, address and city of employee in any order.
    The main thread then prints the salary of the employee at last.

    Use Case: The child threads should finish first followed by main thread.
 */

import java.sql.SQLOutput;
import java.util.concurrent.CountDownLatch;
class Mythread extends Thread{

    private CountDownLatch latch;
    private String value;

    Mythread(CountDownLatch latch, String value){
        this.latch=latch;
        this.value=value;
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName()+ ":"+ value);
        latch.countDown();

    }
}

public class CountDownLatchExample {

    public static void main(String[] args) throws InterruptedException {

        CountDownLatch cdl = new CountDownLatch(4); // count is 3 as the main thread has to wait for 3 child threads to finish.

        Mythread t1 = new Mythread(cdl,"Sawan");
        Mythread t2 = new Mythread(cdl,"Punpun");
        Mythread t3 = new Mythread(cdl,"Patna");

        t1.start();
        t2.start();
        t3.start();

        cdl.await();
        System.out.println(Thread.currentThread().getName()+ ":"+ "200000.0");

        /*
            Observations-
            1. Even though the order of child thread execution can change but main thread will always be the last to execute.
            2. If we set the count of CDL to 4 , then wait thread will wait indefinitely as the count can never reach 0.
         */

    }
}
