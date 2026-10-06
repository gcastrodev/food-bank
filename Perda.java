import java.time.LocalDate;

public class Perda {

    public static int contadorId = 1;

    private int id;
    private Alimento alimento;
    private double quantidade;
    private String motivo;
    private LocalDate data;

    public Perda(Alimento alimento, double quantidade, String motivo, LocalDate data) {
        this.id = contadorId++;
        this.alimento = alimento;
        this.quantidade = quantidade;
        this.motivo = motivo;
        this.data = data;
    }

    public boolean processar(Estoque estoque) {
        if (estoque == null || alimento == null || motivo == null || motivo.isBlank()) {
            return false;
        }

        if (quantidade <= 0) {
            return false;
        }

        if (estoque.getAlimento() != null && estoque.getAlimento().getId() != alimento.getId()) {
            return false;
        }

        if (quantidade > estoque.getQuantidade()) {
            return false;
        }

        return estoque.registrarPerda(this.quantidade);
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

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}