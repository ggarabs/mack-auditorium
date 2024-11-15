package model;

public class EntradaMeia extends Entrada {
    public EntradaMeia(Integer numero){
        this.numeroDoAssento = numero;
    }

    public double calculaValor(){
        return 0.5*espetaculo.getPreco();
    }
}
