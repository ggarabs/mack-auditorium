package model;

public class EntradaInteira extends Entrada{
    public EntradaInteira(Integer numero){
        this.numeroDoAssento = numero;
    }

    @Override
    public double calculaValor(){
        return 0.0f;
    }
}
