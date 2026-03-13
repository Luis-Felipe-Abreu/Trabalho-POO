import java.util.ArrayList;

public class SistemaDelivery {

    private ArrayList<Pedido> pedidos = new ArrayList<>();

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void listarPedidos() {

        for (Pedido p : pedidos) {

            System.out.println("ID Pedido: " + p.getId());
            System.out.println("Cliente: " + p.getCliente().getNome());
            System.out.println("Restaurante: " + p.getRestaurante().getNome());
            System.out.println("Valor Total: R$ " + p.getValorTotal());
            System.out.println("-----------------------");
        }
    }
}