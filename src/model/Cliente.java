package model;

import java.util.ArrayList;

public class Cliente {
    private String nome, cpf;
    private ArrayList<Pedido> pedidos;
    private Teatro teatro;

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.pedidos = new ArrayList<Pedido>();
    }

    public String getCpf(){
        return this.cpf;
    }

    public void adicionaPedido(Pedido pedido){
        pedidos.add(pedido);
    }
}
