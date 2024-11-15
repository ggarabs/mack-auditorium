package model;

public class EntradaProfessor extends Entrada {
    public EntradaProfessor(Integer numero){
        super(numero);
    }

    public double calculaValor(){
        return 0.4*espetaculo.getPreco();
    }
}
