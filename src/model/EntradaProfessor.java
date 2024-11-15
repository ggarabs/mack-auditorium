package model;

public class EntradaProfessor extends Entrada {
    public EntradaProfessor(Integer numero){
        this.numeroDoAssento = numero;
    }

    public double calculaValor(){
        return 0.4*espetaculo.getPreco();
    }
}
