/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11;

/**
 *
 * @author tulio
 */
public class Aula11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Professor p1 = new Professor();
        Bolsista b1 = new Bolsista();
        Tecnico t1 =  new Tecnico();
        
        
        
        
        
        v1.setNome("Juvenal");
        v1.setIdade(38);
        v1.setSexo("M");
        
        a1.setNome("Cláudio");
        a1.setIdade(18);
        a1.setMatr(1111);
        a1.setSexo("M");
        a1.setCurso("Informática");
        
        b1.setNome("Jubileu");
        b1.setMatr(1112);
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensal();
        
        p1.setNome("Maria");
        p1.setSalario(2500.75f);
        
        
        System.out.println(a1.toString());
        System.out.println(p1.toString());
        System.out.println(v1.toString());
        
        a1.pagarMensal();
        
    }
    
}
