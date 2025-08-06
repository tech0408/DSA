package dsa.multi_threading_practice;

/*
    PS: Find the prime numbers between 1 and 300.
    Thread 1 : find primes between 1 and 100.
    Thread 2 : find primes between 101 and 200.
    Thread 3 : find primes between 201 and 300.

    main thread : print final output.
    Use Case 1: Order is not important.
    Use Case 2: Order is important.

 */

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

class PrimeNumberThread implements Runnable{

    private List<Integer> resultList;
    private CountDownLatch cdl;
    private int low;
    private int high;

    PrimeNumberThread(CountDownLatch cdl,int low,int high, List<Integer> resultList){
        this.cdl=cdl;
        this.low=low;
        this.high=high;
        this.resultList=resultList;
    }

    @Override
    public void run() {

        int count;
        for(int i=low;i<=high;i++){
            count=0;
            for(int j=1;j<=i;j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if(count==2){
                resultList.add(i);

            }
        }
        cdl.countDown();
    }
}

public class CountDownLatchExample2 {

    private static List<Integer> resultList = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {

        CountDownLatch cdl = new CountDownLatch(3);
        int num = 300;

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new PrimeNumberThread(cdl,1,100, resultList));
        executorService.execute(new PrimeNumberThread(cdl,101,200, resultList));
        executorService.execute(new PrimeNumberThread(cdl,201,300, resultList));

        executorService.shutdown();

        // Main thread waits for other threads to complete.
        cdl.await();

        System.out.println(resultList);

    }
}
