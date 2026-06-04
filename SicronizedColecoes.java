
package javamultithread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SicronizedColecoes extends MeuRunnable {
    
    private static List<String> lista = new ArrayList<>();
    
    public static void main (String[] args) throws InterruptedException {        
        lista = Collections.synchronizedList(lista);
        //ultilize a versao do syncronizedXXX de acordo com 
        //seu tipo de coleção !
        // lista = Collections.sunchonizedCollection(lista);
        // lista = Collections.synchronizedMap(lista);
        // lista = Collections.Set(lista);
        
        MeuRunnable runnable = new MeuRunnable();
        Thread t0 = new Thread(runnable);
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t0.start();
        t1.start();
        t2.start();
        Thread.sleep(500);
        System.out.println(lista);
    }      
        
        
    }
