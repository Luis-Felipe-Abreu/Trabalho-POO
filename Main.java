public class Main {

    public static void main(String[] args) {

        Usuario u1 = new Cliente("Ana", "ana@email.com", "99999-1111");
        Usuario u2 = new Cliente("Carlos", "carlos@email.com", "99999-2222");

        Usuario u3 = new Entregador("Pedro", "pedro@email.com", "99999-3333");
        Usuario u4 = new Entregador("Lucas", "lucas@email.com", "99999-4444");

        Usuario[] usuarios = {u1, u2, u3, u4};

        for (Usuario u : usuarios) {
            u.exibirDados();
            System.out.println();
        }

    }
}