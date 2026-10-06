import java.time.LocalDate;

public class Distribuicao {
    
    public static int contadorId = 1;

    private int id;
    private Alimento alimento;
    private double quantidade;
    private LocalDate data;
    private String beneficiario;

    public Distribuicao(Alimento alimento, double quantidade, LocalDate data, String beneficiario) {
        this.id = contadorId++;
        this.alimento = alimento;
        this.quantidade = quantidade;
        this.data = data;
        this.beneficiario = beneficiario;
    }

    public boolean processar(Estoque estoque) {
        if (estoque == null || alimento == null || beneficiario == null || beneficiario.isBlank()) {
            return false;
        }

        if (quantidade <= 0 || alimento.estaVencido()) {
            return false;
        }

        if (estoque.getAlimento() != null && estoque.getAlimento().getId() != alimento.getId()) {
            return false;
        }

        if (quantidade > estoque.getQuantidade()) {
            return false;
        }

        return estoque.registrarDistribuicao(this.quantidade);
    }

    public int getId() {
        return id;
    }

    public Alimento getAlimento() {
        return alimento;
    }

    public void setAlimento(Alimento alimento) {
        this.alimento = alimento;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }
}
