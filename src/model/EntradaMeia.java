package model;

public class EntradaMeia extends Entrada {
    public EntradaMeia(Integer numero){
        this.numeroDoAssento = numero;
    }

    public double calculaValor(){
        double valor = espetaculo.getPreco();
        return 0.5*valor;
    }
}
