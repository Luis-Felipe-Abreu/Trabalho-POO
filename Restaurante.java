public class Restaurante {

    private String nome;

    public Restaurante(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome do restaurante não pode ser vazio");
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome do restaurante não pode ser vazio");
        }
        this.nome = nome;
    }
}