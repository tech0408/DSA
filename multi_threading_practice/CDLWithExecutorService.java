package dsa.multi_threading_practice;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
    PS: There are 4 threads including a main thread.
    The 3 child thread prints name, address and city of employee in any order.
    The main thread then prints the salary of the employee at last.

    Use Case: The child threads should finish first followed by main thread.
 */

class Mythread1 implements Runnable{

    private CountDownLatch cdl;
    private String value;

    Mythread1(CountDownLatch cdl, String value){
        this.cdl=cdl;
        this.value=value;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ ":"+ value);
        cdl.countDown();

    }
}

public class CDLWithExecutorService {

    public static void main(String[] args) throws InterruptedException {

        CountDownLatch cdl = new CountDownLatch(3);

        // We can create a ThreadPool of any type ie newFixedThreadPool, newCachedThreadPool, newSingleThreadExecutor
        // As the purpose is to execute three tasks and then execute main task job.
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(new Mythread1(cdl,"Sawan"));
        executorService.submit(new Mythread1(cdl,"Punpun"));
        executorService.execute(new Mythread1(cdl,"Patna")); // we cn use submit/execute as it is Runnable task.

        executorService.shutdown();

        cdl.await();
        System.out.println(Thread.currentThread().getName()+ ":"+ "200000.0");

    }
}
