/*
 * To change this license header, choose License Headers in Project Properties.
 * To changwe this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

/**
 *
 * @author tulio
 */
public class Aula12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Aves a = new Aves();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara e = new Arara();

        a.locomover();
        p.locomover();
        r.locomover();
        c.locomover();
        k.emitirSom();
    }

}
