package model;

public class EntradaProfessor extends Entrada {
    public EntradaProfessor(Integer numero){
        this.numeroDoAssento = numero;
    }

    public double calculaValor(){
        double valor = espetaculo.getPreco();
        return 0.4*valor;
    }
}
