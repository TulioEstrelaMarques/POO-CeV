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
public final class Tecnico extends Aluno{
    private String registroProfissonal;
    
    public final void praticar(){
        System.out.println("Estou praticando...");
    }

    public String getRegistroProfissonal() {
        return registroProfissonal;
    }

    public void setRegistroProfissonal(String registroProfissonal) {
        this.registroProfissonal = registroProfissonal;
    }
    
    
}
