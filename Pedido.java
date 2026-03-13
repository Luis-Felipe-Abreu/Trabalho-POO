public class Pedido {

    private static int contadorId = 1;

    private int id;
    private Cliente cliente;
    private Restaurante restaurante;
    private double valorTotal;

    public Pedido(Cliente cliente, Restaurante restaurante, double valorTotal) {

        if (cliente == null || restaurante == null) {
            throw new IllegalArgumentException("Cliente e Restaurante são obrigatórios");
        }

        if (valorTotal < 0) {
            throw new IllegalArgumentException("Valor não pode ser negativo");
        }

        this.id = contadorId++;
        this.cliente = cliente;
        this.restaurante = restaurante;
        this.valorTotal = valorTotal;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}