/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uec;

import java.util.Random;

/**
 *
 * @author tulio
 */
public class Lutas {

    private Lutadores desafiado, desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutadores desafiado, Lutadores desafiante) {
        if (desafiado.getCategoria().equals(desafiante.getCategoria()) && (desafiado != desafiante)) {
            this.setAprovada(true);
            this.setDesafiado(desafiado);
            this.setDesafiante(desafiante);
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }

    public void lutar() {
        if (this.isAprovada()) {
            System.out.println("### DESAFIADO ###");
            this.getDesafiado().apresentar();
            System.out.println("");
            System.out.println("### DESAFIANTE ###");
            this.getDesafiante().apresentar();
            System.out.println("");
            Random r = new Random();
            int vencedor = r.nextInt(3);
            System.out.println("====== RESULTADO DA LUTA ======");
            switch (vencedor) {
                case 0:
                    System.out.println("Ora, ora, ora... Empatou!!!");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    break;
                case 1:
                    System.out.println("Enfim, temos um novo campeão e o nome dele é: " + this.getDesafiado().getNome());
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    break;
                case 2:
                    System.out.println("Enfim, temos um novo campeão e o nome dele é: " + this.getDesafiante().getNome());
                    this.getDesafiado().perderLuta();
                    this.getDesafiante().ganharLuta();
                    break;
            }
            System.out.println("===============================");
        } else {
            System.out.println("A Luta não pode acontecer");
        }
    }

    public Lutas() {
    }

    public Lutas(Lutadores desafiado, Lutadores desafiante) {
        this.desafiado = desafiado;
        this.desafiante = desafiante;
    }
    

    public Lutadores getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutadores desafiado) {
        this.desafiado = desafiado;
    }

    public Lutadores getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutadores desafiante) {
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
