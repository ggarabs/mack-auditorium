package model;

public class Entrada {
    protected Integer numeroDoAssento;
    protected Espetaculo espetaculo;

    public Entrada(Integer numero){
        this.numeroDoAssento = numero;
    }

    public Entrada(){
        this.numeroDoAssento = null;
    }

    public double calculaValor(){
        return 0.0f;
    }
}
