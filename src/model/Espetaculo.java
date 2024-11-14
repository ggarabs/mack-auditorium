package model;

import java.util.ArrayList;

public class Espetaculo {
    private String nome, data, hora;
    private double preco;
    private boolean[] assentos = new boolean[50];
    private Teatro teatro;
    private ArrayList<Entrada> entradas;

    public Espetaculo(String nome, String data, String hora, double preco){
        this.nome = nome;
        this.data = data;
        this.hora = hora;
        this.preco = preco;
        for(int i = 0; i < 50; i++) assentos[i] = true;
        this.entradas = new ArrayList<Entrada>();
    }

    public String getNome(){
        return this.nome;
    }

    public String getData(){
        return this.data;
    }

    public String getHora(){
        return this.hora;
    }

    public void apresentaAssentos(){
        System.out.println("    |||  Assentos Disponíveis |||");
        System.out.print("    ");
        for(Integer it = 50; it >= 1; it--){
            if(assentos[it-1]){
                if(it < 10) System.out.print('0');
                System.out.print(it);
            }
            else System.out.print("XX");
            System.out.print(" ");
            if(it % 10 == 1 && it != 1){
                System.out.println();
                System.out.print("    ");
            }
        }
        System.out.println();
    }

    public Entrada novaEntrada(Integer tipo, Integer assento){
        Entrada entrada = null;
        switch (tipo) {
            case 1:
                entrada = new EntradaInteira(assento);
                break;
            case 2:
                entrada = new EntradaMeia(assento);
                break;
            case 3:
                entrada = new EntradaProfessor(assento);
                break;
            default:
                break;
        }

        this.marcarAssento(assento);

        return entrada;
    }

    public double getPreco(){
        return this.preco;
    }

    public String toString(){
        return "";
    }

    private void marcarAssento(Integer assento){
        assentos[assento] = true;
    }
}
