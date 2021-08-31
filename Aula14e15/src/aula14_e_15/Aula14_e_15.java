/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14_e_15;

/**
 *
 * @author tulio
 */
public class Aula14_e_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1");
        v[1] = new Video("Aula 2");
        v[2] = new Video("Aula 3");
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Ryu", "M", 20, "hadouken");
        g[1] = new Gafanhoto("Ken", "M", 20, "hadoushoryuken");
        Visualizacao vis[] = new Visualizacao[3];
        vis[0] = new Visualizacao(g[0], v[0]);
        vis[0].avaliar();
        vis[1] = new Visualizacao(g[1], v[2]);
        vis[1].avaliar(87.f);
        System.out.println(vis[0].toString());
        System.out.println(vis[1].toString());
    }

}
