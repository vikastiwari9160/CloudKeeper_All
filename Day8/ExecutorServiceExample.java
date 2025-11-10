package CollectionsAssignment;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

    static final Object monitor = new Object();

    static class Task1 implements Runnable{
        @Override
        public void run(){
            try{
                for(int i=1; i<=10; i++){
                    synchronized (monitor){
                        System.out.println("2*"+i+"="+2*i);
                        monitor.notify();
                        if(i<10) monitor.wait();
                    }
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }

    static class Task2 implements Runnable{
        @Override
        public void run(){
            try{
                for(int i=1; i<=10; i++){
                    synchronized (monitor){
                        System.out.println("4*"+i+"="+4*i);
                        monitor.notify();
                        if(i<10) monitor.wait();
                    }
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }


    public static void main(String[] args){
        ExecutorService executorService=  Executors.newFixedThreadPool(2);
        executorService.submit(new Task1());
        executorService.submit(new Task2());
        executorService.shutdown();

    }
}
