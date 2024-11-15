package model;

public class EntradaInteira extends Entrada{
    public EntradaInteira(Integer numero){
        super(numero);
    }

    public double calculaValor(){
        return espetaculo.getPreco();
    }
}
