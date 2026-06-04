
package javamultithread;

import java.util.concurrent.atomic.AtomicReference;

public class ClassesAtomicas  {
    static AtomicReference<Object> r = new AtomicReference<>(new Object());
    
    public static void main (String[] args) {
        MeuRunnable runnable = new MeuRunnable();
        
        Thread t0 = new Thread(runnable);
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        
        t0.start();
        t1.start();
        t2.start();
    }
    public static class MeuRunnable implements Runnable {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        // System.outprintLn(name + ":" + i.incrementAndGet());
        //System.outprintLn(name + ":" + b.compareAndchange(false, true);
        System.out.println(name+":" + r.getAndSet(new Object()));
    }
    
    }
}
