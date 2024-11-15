package model;

public class EntradaInteira extends Entrada{
    public EntradaInteira(Integer numero){
        this.numeroDoAssento = numero;
    }

    public double calculaValor(){
        double valor = espetaculo.getPreco();
        return valor;
    }
}
