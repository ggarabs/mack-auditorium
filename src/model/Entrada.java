package model;

abstract class Entrada {
    protected Integer numeroDoAssento;
    protected Espetaculo espetaculo;

    public Entrada(Integer numero){
        this.numeroDoAssento = numero;
    }

    public Entrada(){
        this.numeroDoAssento = -1;
    }

    public Integer getNumeroDoAssento(){
        return this.numeroDoAssento;
    }

    public void setEspetaculo(Espetaculo espetaculo){
        this.espetaculo = espetaculo;
    }

    abstract double calculaValor();
}
