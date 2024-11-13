package model;

public class Espetaculo {
    private String nome, data, hora;
    private double preco;
    private boolean[] assentos = new boolean[50];

    public Espetaculo(String nome, String data, String hora, double preco){
        this.nome = nome;
        this.data = data;
        this.hora = hora;
        this.preco = preco;
        for(int i = 0; i < 50; i++) assentos[i] = false;
    }

    public void apresentaAssentos(){
    }

    public Entrada novaEntrada(Integer tipo, Integer assento){
        return new Entrada(assento);
    }

    public double getPreco(){
        return this.preco;
    }

    public String toString(){
        return "";
    }

    private void marcarAssento(Integer assento){
    }
}
