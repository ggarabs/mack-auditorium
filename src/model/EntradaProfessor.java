package model;

public class EntradaProfessor extends Entrada {
    public EntradaProfessor(Integer numero){
        this.numeroDoAssento = numero;
    }

    @Override
    public double calculaValor(){
        return 0.0f;
    }
}
