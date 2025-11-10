package CollectionsAssignment;

public class ThreadManipulation {

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
        try{
            new Thread(new Task1()).start();
            new Thread(new Task2()).start();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
