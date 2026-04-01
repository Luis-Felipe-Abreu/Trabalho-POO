package br.com.seuprojeto.app;

import br.com.seuprojeto.model.Cliente;
import br.com.seuprojeto.model.Pedido;
import br.com.seuprojeto.model.Restaurante;
import br.com.seuprojeto.service.*;

public class Main {

    public static void main(String[] args) {

        // Criando cliente e restaurante
        Cliente cliente1 = new Cliente("João", "12345");
        Restaurante restaurante1 = new Restaurante("Pizza Top");

        // Estratégias de entrega (POLIMORFISMO)
        Entregavel entregaMoto = new EntregaMoto();
        Entregavel entregaBike = new EntregavelBicicleta();

        // Criando pedidos
        Pedido pedido1 = new Pedido(cliente1, restaurante1, entregaMoto);
        Pedido pedido2 = new Pedido(cliente1, restaurante1, entregaBike);

        // Sistema
        SistemaDelivery sistema = new SistemaDelivery();
        sistema.adicionarPedido(pedido1);
        sistema.adicionarPedido(pedido2);

        // Listar pedidos
        sistema.listarPedidos();
    }
}