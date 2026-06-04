
package javamultithread;



public class JavaMultiThread {

    public static void main(String[] args) {
        // Thread atual 
        MeuRunnable meuRunnable = new MeuRunnable();
        
        Thread t = new Thread( new MeuRunnable());
        System.out.println(t.getName());
        
        // nova Thread 
        Thread t1 = new Thread(meuRunnable);
        //Thread t1 = new Thread((java.lang.Runnable) (Runnable) new MeuRunnable());
        //t1.run(); // apenas executando na mesma thread 
        t1.start(); // executando em uma nova thread
        
        //runable como lambda 
        Thread t2 = new Thread(
            () -> System.out.println(Thread.currentThread().getName()));
        t2.start();
        //t2.start(); nao faça vai lançar exceção!
        
        Thread t3 = new Thread(meuRunnable);
        t3.start();
        
        Thread t4 = new Thread(
            ()-> System.out.println(Thread.currentThread().getName()));
        t4.start();
    }
    
}
