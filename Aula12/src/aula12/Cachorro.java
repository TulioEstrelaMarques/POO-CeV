/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

/**
 *
 * @author tulio
 */
public class Cachorro extends Mamifero {

    public void enterrarOsso() {
        System.out.println("Enterrando Osso");
    }

    public void abanarRabo() {
        System.out.println("Abanando o Rabo");
    }

    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }

 
}
