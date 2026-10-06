# Banco de Alimentos

Este projeto foi desenvolvido em Java para simular o funcionamento básico de um sistema de gestão de alimentos para um banco de alimentos. A atividade tem como objetivo praticar conceitos de Programação Orientada a Objetos, como encapsulamento, composição, objetos, métodos e controle de fluxo.

## Objetivo

O sistema permite:

- cadastrar alimentos;
- registrar doadores;
- controlar o estoque de produtos;
- registrar doações recebidas;
- registrar distribuições para beneficiários;
- registrar perdas de alimentos;
- validar regras como quantidade suficiente em estoque e validade do produto.

## Estrutura do projeto

Os arquivos principais são:

- `Main.java` — ponto de entrada da aplicação e simulação do funcionamento do sistema.
- `Alimento.java` — representa um item do estoque.
- `Doador.java` — representa a pessoa ou instituição que doa alimentos.
- `Estoque.java` — gerencia a quantidade de alimentos disponíveis.
- `Doacao.java` — representa a entrada de alimentos no estoque.
- `Distribuicao.java` — representa a saída de alimentos para beneficiários.
- `Perda.java` — representa alimentos perdidos ou descartados.

## Funcionalidades principais

### Alimento
- Armazena nome, categoria e data de validade.
- Verifica se o alimento está vencido.
- Permite acessar e alterar dados básicos.

### Doador
- Guarda nome, documento e telefone.
- Permite atualizar informações e exibir os dados do doador.

### Estoque
- Controla a quantidade total do alimento em estoque.
- Permite registrar entrada, distribuição e perda.
- Valida entradas negativas e quantidades maiores que o estoque atual.

### Doação
- Registra a doação de um alimento por um doador.
- Verifica se a doação é válida antes de registrar a entrada no estoque.

### Distribuição
- Registra a entrega de alimentos a um beneficiário.
- Valida se há quantidade suficiente no estoque e se o alimento não está vencido.

### Perda
- Registra perdas por motivos como dano, vencimento ou embalagem inadequada.
- Reduz a quantidade do estoque quando a perda é validada.

## Como executar

1. Abra o terminal na pasta do projeto.
2. Compile os arquivos Java:

```bash
javac *.java
```

3. Execute a aplicação:

```bash
java Main
```

## Exemplo de execução

Ao rodar o programa, ele demonstra:

- comparação de referência entre objetos;
- criação de um doador;
- processamento de uma doação;
- distribuição de alimentos;
- registro de perdas;
- validação de distribuições inválidas quando o estoque é insuficiente.

## Observações

- O código foi pensado como uma representação didática de POO em Java.
- A classe `Main` serve como exemplo de uso das classes do sistema.
- O projeto pode ser expandido futuramente com menus, persistência em arquivo ou banco de dados, e outras regras de negócio.

## Autor

Projeto desenvolvido como atividade acadêmica de Programação Orientada a Objetos em Java.
