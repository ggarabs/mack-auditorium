package model;

public class EntradaMeia extends Entrada {
    public EntradaMeia(Integer numero){
        this.numeroDoAssento = numero;
    }

    @Override
    public double calculaValor(){
        return 0.0f;
    }
}
