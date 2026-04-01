package br.com.seuprojeto.model;

import br.com.seuprojeto.service.Entregavel;

public class Pedido {

    private Cliente cliente;
    private Restaurante restaurante;
    private Entregavel tipoEntrega;

    public Pedido(Cliente cliente, Restaurante restaurante, Entregavel tipoEntrega) {
        this.cliente = cliente;
        this.restaurante = restaurante;
        this.tipoEntrega = tipoEntrega;
    }

    public void realizarEntrega() {
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Restaurante: " + restaurante.getNome());
        tipoEntrega.realizarEntrega();
    }
}