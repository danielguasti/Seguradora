/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author alunolab08
 */
public class Seguro {
    private float valor;
    private boolean vigencia;
    private Cliente proprietário;
    private Cliente[] assegurados;
    private Veículo veiculo;
    

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean isVigencia() {
        return vigencia;
    }

    public void setVigencia(boolean vigencia) {
        this.vigencia = vigencia;
    }

    public Veículo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veículo veiculo) {
        this.veiculo = veiculo;
    }

    public Cliente getProprietário() {
        return proprietário;
    }

    public void setProprietário(Cliente proprietário) {
        this.proprietário = proprietário;
    }

    public Cliente[] getAssegurados() {
        return assegurados;
    }

    public void setAssegurados(Cliente[] assegurados) {
        this.assegurados = assegurados;
    }
    

    public Seguro(float valor, boolean vigencia) {
        this.valor = valor;
        this.vigencia = vigencia;
    }
    
    
    
}
