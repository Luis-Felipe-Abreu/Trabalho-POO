package br.com.seuprojeto.service;

import br.com.seuprojeto.model.Pedido;

import java.util.ArrayList;

public class SistemaDelivery {

    private ArrayList<Pedido> pedidos = new ArrayList<>();

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void listarPedidos() {
        for (Pedido p : pedidos) {
            System.out.println("------ Pedido ------");
            p.realizarEntrega();
        }
    }
}