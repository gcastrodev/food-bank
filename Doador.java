public class Doador {
    
    private static int contadorId = 1;

    private int id;
    private String nome;
    private String documento;
    private String telefone;

    public Doador(String nome, String documento, String telefone) {
        this.id = contadorId++;
        this.nome = nome;
        this.documento = documento;
        this.telefone = telefone;
    }

    public void exibirDados() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Documento: " + documento);
        System.out.println("Telefone: " + telefone);
    }

    public void atualizarTelefone(String novoTelefone) {
        this.telefone = novoTelefone;
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

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
