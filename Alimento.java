import java.time.LocalDate;

public class Alimento {

    private static int contadorId = 1;

    private int id;
    private String nome;
    private String categoria;
    private LocalDate dataValidade;

    public Alimento(String nome, String categoria, LocalDate dataValidade) {
        this.id = contadorId++;
        this.nome = nome;
        this.categoria = categoria;
        this.dataValidade = dataValidade;
    }

    public void exibirDados() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Categoria: " + categoria);
        System.out.println("Data de validade: " + dataValidade);
    }

    public boolean estaVencido() {
        return LocalDate.now().isAfter(dataValidade);
    }

    public boolean estaValido() {
        return !estaVencido();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }
}
