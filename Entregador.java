public class Entregador extends Usuario {

    public Entregador(String nome, String email, String telefone) {
        super(nome, email, telefone);
    }

    @Override
    public void exibirDados() {
        System.out.println("=== Entregador ===");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
    }

}