import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("SISTEMA BANCO DE ALIMENTOS");
        System.out.println("========================================");

        // Identidade e referências:
        // arroz1 e arroz2 são objetos distintos, mesmo que tenham os mesmos valores.
        // Por isso, arroz1 == arroz2 retorna false.
        // arroz3 aponta para o mesmo objeto que arroz1, então arroz1 == arroz3 retorna true.
        Alimento arroz1 = new Alimento("Arroz", "Grãos", LocalDate.now().plusDays(30));
        Alimento arroz2 = new Alimento("Arroz", "Grãos", LocalDate.now().plusDays(30));
        Alimento arroz3 = arroz1;

        System.out.println("Identidade e referências:");
        System.out.println("arroz1 == arroz2 => " + (arroz1 == arroz2));
        System.out.println("arroz1 == arroz3 => " + (arroz1 == arroz3));
        System.out.println();

        Doador doador = new Doador("Supermercado Esperança", "12.345.678/0001-90", "(43) 99999-1234");
        Estoque estoque = new Estoque(arroz1, 0.0);

        System.out.println("Doador: " + doador.getNome());
        System.out.println("Produto: " + arroz1.getNome());

        Doacao doacao = new Doacao(doador, arroz1, 100.0, LocalDate.now(), false);
        System.out.println("Doação recebida: " + doacao.getQuantidade() + " kg");

        if (doacao.processar(estoque)) {
            System.out.println("Doação processada com sucesso.");
        } else {
            System.out.println("ERRO: doação inválida.");
        }

        System.out.println("Estoque atual: " + estoque.getQuantidade() + " kg");

        Distribuicao distribuicao = new Distribuicao(arroz1, 30.0, LocalDate.now(), "Família A");
        System.out.println("Distribuição solicitada: " + distribuicao.getQuantidade() + " kg");

        if (distribuicao.processar(estoque)) {
            System.out.println("Distribuição realizada com sucesso.");
        } else {
            System.out.println("ERRO: quantidade insuficiente em estoque.");
        }

        System.out.println("Estoque atual: " + estoque.getQuantidade() + " kg");

        Perda perda = new Perda(arroz1, 5.0, "Embalagem danificada", LocalDate.now());
        if (perda.processar(estoque)) {
            System.out.println("Perda registrada: " + perda.getQuantidade() + " kg");
            System.out.println("Motivo: " + perda.getMotivo());
        } else {
            System.out.println("ERRO: perda inválida.");
        }

        System.out.println("Estoque atual: " + estoque.getQuantidade() + " kg");

        Distribuicao distribuicaoInvalida = new Distribuicao(arroz1, 80.0, LocalDate.now(), "Escola Comunitária");
        System.out.println("Distribuição solicitada: " + distribuicaoInvalida.getQuantidade() + " kg");

        if (distribuicaoInvalida.processar(estoque)) {
            System.out.println("Distribuição realizada com sucesso.");
        } else {
            System.out.println("ERRO: quantidade insuficiente em estoque.");
        }

        System.out.println("Estoque permanece: " + estoque.getQuantidade() + " kg");
    }
}