import java.time.LocalDate;

public class Doacao {
    
    public static int contadorId = 1;

    private int id;
    private Doador doador;
    private Alimento alimento;
    private double quantidade;
    private LocalDate data;
    private boolean processada;

    public Doacao(Doador doador, Alimento alimento, double quantidade, LocalDate data, boolean processada) {
        this.id = contadorId++;
        this.doador = doador;
        this.alimento = alimento;
        this.quantidade = quantidade;
        this.data = data;
        this.processada = processada;
    }

    public boolean processar(Estoque estoque) {
        if (estoque == null || doador == null || alimento == null) {
            return false;
        }

        if (this.processada || this.quantidade <= 0) {
            return false;
        }

        if (estoque.getAlimento() != null && estoque.getAlimento().getId() != alimento.getId()) {
            return false;
        }

        if (estoque.registrarEntrada(this.quantidade)) {
            this.processada = true;
            return true;
        }

        return false;
    }

    public int getId() {
        return id;
    }

    public Doador getDoador() {
        return doador;
    }

    public void setDoador(Doador doador) {
        this.doador = doador;
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

    public boolean isProcessada() {
        return processada;
    }

    public void setProcessada(boolean processada) {
        this.processada = processada;
    }
}
