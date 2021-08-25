/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

/**
 *
 * @author tulio
 */
public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual() {
        System.out.println("--------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        if (this.isStatus() == false) {
            this.setStatus(true);
            if (tipo == "CC") {
                this.setSaldo(50);
            } else if (tipo == "CP") {
                this.setSaldo(150);
            }
        } else {
            System.out.println("Não foi possível abrir uma conta...");
        }
        System.out.println("Conta aberta com sucesso!");

    }

    public void fecharConta() {
        if (this.getSaldo() > 0 || this.getSaldo() < 0) {
            System.out.println("Sua conta não pode ser fechada.\nVerifoque seu saldo!");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float valor) {
        if (this.isStatus()) {
            this.setSaldo(getSaldo() + valor);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Erro, não foi possível realizar essa operação.");
        }
    }

    public void sacar(float valor) {
        if (this.isStatus() && this.getSaldo() >= valor) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque realizado na conta de " + this.getDono());
        } else {
            System.out.println("Erro, não foi possível realizar essa operação.");
        }
    }

    public void pagarMensal() {
        float valor = 0;
        if (getTipo() == "CC") {
            valor = 12;
        } else if (getTipo() == "CP") {
            valor = 20;
        }
        if (this.isStatus()) {
            if (this.getSaldo() > valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Mensalidade paga com sucesso por " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Não foi possível realizar a operação");
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
