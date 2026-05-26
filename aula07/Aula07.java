
package aula07;


public class Aula07 {

    public static void main(String[] args) {
       Fighter f[] = new Fighter[6]; 
       f[0] = new Fighter("Pretty Boy","França", 31, 1.75f, 68.9f, 11, 2, 1 );
       f[1] = new Fighter("Putscript", "Brasil", 26, 1.98f, 80.0f, 20, 5, 3);
       f[2] = new Fighter("Snapshadow", "EUA", 40, 1.78f, 74.9f, 10, 1, 1);
       f[3] = new Fighter("Dead Code", "Austrália", 30, 1.67f, 90.0f, 20, 10, 5);
       f[4] = new Fighter("UFOCobol", "Brasil", 24, 1.87f, 95.0f, 15, 2, 1);
       f[5] = new Fighter("NerdArt", "EUA", 35, 1.98f, 100.0f, 20, 6, 1);
       
       Luta UEC01 = new Luta();
       UEC01.marcarLuta(f[4], f[5]);
       UEC01.Lutar();
      
    }
    
}
