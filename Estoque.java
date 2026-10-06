public class Estoque {
    
    private Alimento alimento;
    private double quantidade;

    public Estoque(Alimento alimento, double quantidade) {
        this.alimento = alimento;
        if (quantidade < 0) {
            throw new IllegalArgumentException("A quantidade inicial do estoque não pode ser negativa.");
        }
        this.quantidade = quantidade;
    }

    public boolean registrarEntrada(double quantidade) {
        if (quantidade <= 0) {
            return false;
        }

        this.quantidade += quantidade;
        return true;
    }

    public boolean registrarDistribuicao(double quantidade) {
        if (quantidade <= 0) {
            return false;
        }

        if (quantidade > this.quantidade) {
            return false;
        }

        this.quantidade -= quantidade;
        return true;
    }

    public boolean registrarPerda(double quantidade) {
        if (quantidade <= 0) {
            return false;
        }

        if (quantidade > this.quantidade) {
            return false;
        }

        this.quantidade -= quantidade;
        return true;
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
        if (quantidade < 0) {
            throw new IllegalArgumentException("A quantidade do estoque não pode ser negativa.");
        }
        this.quantidade = quantidade;
    }
}
