package model;

import java.util.ArrayList;

public class Teatro {
    private Pedido carrinho;
    private Espetaculo espetaculoSelecionado;
    private ArrayList<Espetaculo> espetaculos;
    private ArrayList<Cliente> clientes;

    public Teatro(){
        this.carrinho = null;
        this.espetaculoSelecionado = null;
        this.espetaculos = new ArrayList<Espetaculo>();
        this.clientes = new ArrayList<Cliente>();
    }

    public ArrayList<Espetaculo> getEspetaculos(){
        return this.espetaculos;
    }

    public void addEspetaculo(Espetaculo espetaculo){
        this.espetaculos.add(espetaculo);
    }

    public ArrayList<Cliente> getClientes(){
        return this.clientes;
    }

    public void addCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

    public void novaCompra(){
        Pedido novoPedido = new Pedido();
        this.setCarrinho(novoPedido);

        this.apresentaEspetaculos();
    }

    public void setCarrinho(Pedido novoCarrinho){
        this.carrinho = novoCarrinho;
    }

    public void apresentaEspetaculos(){
        System.out.println("*** VENDA DE ENTRADAS - ESPETÁCULOS ***");
        for(Integer it = 1; it <= espetaculos.size(); it++){
            System.out.println("    " + it + ") " + espetaculos.get(it-1).getNome() + " " + espetaculos.get(it-1).getData() + " " + espetaculos.get(it-1).getHora() + " R$ " + espetaculos.get(it-1).getPreco());
        }
    }

    public void selecionaEspetaculo(Integer numero){
        setEspetaculoSelecionado(espetaculos.get(numero-1));

        espetaculoSelecionado.apresentaAssentos();
    }

    public void setEspetaculoSelecionado(Espetaculo show){
        this.espetaculoSelecionado = show;
    }

    public Espetaculo getEspetaculoSelecionado(){
        return this.espetaculoSelecionado;
    }

    public void novaEntrada(Integer tipo, Integer assento){
        Entrada entrada = espetaculoSelecionado.novaEntrada(tipo, assento);
        carrinho.adicionaEntrada(entrada);
    }

    public double finalizaCompra(String cpf){
        Cliente cliente = null;
        for(Cliente aux : clientes) if(aux.getCpf().equals(cpf)) cliente = aux;

        cliente.adicionaPedido(carrinho);

        double valorTotal = carrinho.calculaValorTotal();

        return valorTotal;
    }
}
