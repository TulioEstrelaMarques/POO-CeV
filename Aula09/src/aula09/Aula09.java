/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09;

/**
 *
 * @author tulio
 */
public class Aula09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[2];
        p[0] = new Pessoa("Maria", 20, "F");
        p[1] = new Pessoa("João", 21, "M");
        l[0] = new Livro("Nossa História", "Fernando Reis", p[0].getIdade()+p[1].getIdade(), p[1]);
        l[1] = new Livro("A história por trás da História", "Desconhecido(a)", p[0].getIdade()*p[1].getIdade(), p[0]);
       l[1].detalhes();
    }

}
