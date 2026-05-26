/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07;

import java.util.Random;

public class Luta {
    private Fighter desafiado;
    private Fighter desafiante;
    private  int rounds ;
    private  boolean aprovada;
    
    public void marcarLuta(Fighter f1, Fighter f2 ) {
       if (f1.getCategoria() .equals(f2.getCategoria())
               && f1!= f2) {
           this.aprovada = true;
           this.desafiado = f1;
           this.desafiante = f2;
       } else {
           this.aprovada = false;
           this.desafiado = null;
           this.desafiante = null;          
       }
    }
    
    public void Lutar() {
        if (this.aprovada) {
            System.out.println("#### DESAFIADO ######"); 
            this.desafiado.apresentar();
            System.out.println("#### DESAFIANTE #####");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            System.out.println("=====RESULTADO======");
            int vencedor = aleatorio.nextInt(3);
            switch(vencedor) {
                case 0: //empate
                    System.out.println("----------------");
                    System.out.println("    Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: // desafiado vence 
                    System.out.println("----------------");
                    System.out.println(this.desafiado.getNome() +" Venceu");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // desafiante vence 
                     System.out.println("----------------");
                    System.out.println(this.desafiante.getNome()+" Venceu");
                    this.desafiante.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
            }
            
        } else {
            System.out.println("A luta não pode acontecer!");
        }
    }    

    public Fighter getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Fighter desafiado) {
        this.desafiado = desafiado;
    }

    public Fighter getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Fighter desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
}
