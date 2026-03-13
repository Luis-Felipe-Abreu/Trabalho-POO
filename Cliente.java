public class Cliente extends Usuario {

    public Cliente(String nome, String email, String telefone) {
        super(nome, email, telefone);
    }

    @Override
    public void exibirDados() {
        System.out.println("=== Cliente ===");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
    }

}