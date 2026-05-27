
package aula08;

public class ProjetoLivro {

    public static void main(String[] args) {
        Pessoa[] p =  new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Pedro" , "m", 24);
        p[1] = new Pessoa ("Maria", "f", 35);
        
        l[0] = new Livro("Apredendo Java", "Robert Grickan", 400 , p[0]);
        l[1] = new Livro("POO para iniciantes", "Pedro ion",  600, p[1]);
        l[2] = new Livro("Codigo limpo", "Coward Pridon", 450, p[1]);
        
        l[0].abrir();
        l[0].folhear(150);
        System.out.println(l[0].detalhes());
        System.out.println(l[2].detalhes());
    }
    
}
