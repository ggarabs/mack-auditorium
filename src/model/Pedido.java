package model;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Entrada> entradas;

    public Pedido(){
        this.entradas = new ArrayList<Entrada>();
    }

    public void adicionaEntrada(Entrada entrada){
        entradas.add(entrada);
    }

    public double calculaValorTotal(){
        double valor = 0.0f;

        for(Entrada aux : entradas) valor += aux.calculaValor();

        return valor;
    }
}
