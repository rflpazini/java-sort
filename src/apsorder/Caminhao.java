package apsorder;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Caminhao")
public class Caminhao {
    @XStreamAlias("codigo")
    private int codigo;
    @XStreamAlias("nome")
    private String nome;
    @XStreamAlias("peso")
    private double peso;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    @Override
    public String toString(){
        return "\nCódigo: " + getCodigo()+
                "\nNome: " + getNome()+
                "\nPeso: "+ getPeso();
    }
}
