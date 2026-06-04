
package javamultithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;

/**
 *
 * @author GIANNIS
 */
public class SynchonoursQueue_1 implements Runnable {
    private static final SynchronousQueue<String> 
    fila = new SynchronousQueue<>();
    
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        
        Runnable r1 = () -> {
          put();
          System.out.println("Escreveu na fila");
        };
        Runnable r2 = ()-> {
         String msg = take();
         System.out.println("Pegou na fila!"+ msg);
        };
        
        executor.execute((java.lang.Runnable) r1);
        executor.execute((java.lang.Runnable) r2);
        
        executor.shutdown();
    }

    private static String take() {
        try {
            return fila.take();
           //return fila.pool(timeout, unit);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
            return "Execução";
        }
    }

    private static void put() {
        try {
            fila.put( "Inscreva-se");
            //fila.offer(e, timeout, unit);
        } catch(InterruptedException e) {
           Thread.currentThread().interrupt();
           e.printStackTrace();
        }
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
