/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10;

/**
 *
 * @author tulio
 */
public class Aluno extends Pessoa {

    private int matr;
    private String curso;

    public void cancelarMatri() {
        System.out.println("Sua matrícula foi cancelada!");
        setMatr(0);
    }

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
