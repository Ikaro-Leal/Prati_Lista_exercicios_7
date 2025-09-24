import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {


        //--------------------------+  Questão 1  +--------------------------
//
//        System.out.println("--- Criando um produto com valores válidos ---");
//        // Uso o 'new' para criar uma instância (um objeto) da minha classe Produto.
//        Produto produto1 = new Produto("Notebook Gamer", 4500.00, 10);
//
//        // Uso os getters para acessar os valores e mostrá-los.
//        System.out.println("Nome: " + produto1.getNome());
//        System.out.println("Preço: R$" + produto1.getPreco());
//        System.out.println("Estoque: " + produto1.getQuantidadeEmEstoque() + " unidades");
//
//        System.out.println("\n--- Alterando valores com setters (válidos) ---");
//        produto1.setPreco(4350.50);
//        produto1.setQuantidadeEmEstoque(8);
//        System.out.println("Novo Preço: R$" + produto1.getPreco());
//        System.out.println("Novo Estoque: " + produto1.getQuantidadeEmEstoque() + " unidades");
//
//        System.out.println("\n--- Tentando usar valores inválidos (e tratando os erros) ---");
//
//        // O bloco 'try-catch' é como eu lido com as exceções que criei.
//        // Eu tento executar o código dentro do 'try'.
//        try {
//            System.out.println("Tentando definir um preço negativo...");
//            produto1.setPreco(-50.0);
//        } catch (IllegalArgumentException e) {
//            // Se uma exceção do tipo 'IllegalArgumentException' acontecer,
//            // o código do 'catch' é executado, e o programa não quebra.
//            System.out.println("ERRO CAPTURADO: " + e.getMessage());
//        }
//
//        try {
//            System.out.println("\nTentando criar um produto com nome vazio...");
//            Produto produtoInvalido = new Produto("", 25.00, 100);
//        } catch (IllegalArgumentException e) {
//            System.out.println("ERRO CAPTURADO: " + e.getMessage());
//        }
//
//        try {
//            System.out.println("\nTentando definir estoque negativo...");
//            produto1.setQuantidadeEmEstoque(-1);
//        } catch (IllegalArgumentException e) {
//            System.out.println("ERRO CAPTURADO: " + e.getMessage());
//        }
//    }


//--------------------------+  Questão 2  +--------------------------
//
//    System.out.println("--- Testando aplicação de desconto ---");
//
//    // Crio uma nova instância de Produto para este teste.
//    Produto tv = new Produto("Smart TV 50 Polegadas", 2500.00, 15);
//        System.out.println("Produto: " + tv.getNome());
//        System.out.println("Preço original: R$" + tv.getPreco());
//
//    // Teste 1: Aplicando um desconto válido.
//        try {
//        System.out.println("\n-> Aplicando desconto válido de 15%...");
//        tv.aplicarDesconto(15);
//        // Uso String.format para exibir o preço com duas casas decimais, fica mais bonito.
//        System.out.printf("Preço com desconto: R$%.2f\n", tv.getPreco());
//    } catch (IllegalArgumentException e) {
//        System.out.println("ERRO: " + e.getMessage());
//    }
//
//    // Teste 2: Tentando aplicar um desconto inválido.
//        try {
//        System.out.println("\n-> Tentando aplicar desconto inválido de 60%...");
//        tv.aplicarDesconto(60);
//        System.out.printf("Preço com desconto: R$%.2f\n", tv.getPreco());
//    } catch (IllegalArgumentException e) {
//        // Eu espero que o programa entre neste bloco 'catch'.
//        System.out.println("ERRO CAPTURADO: " + e.getMessage());
//    }
//
//    // Verifico se o preço não foi alterado após a tentativa inválida.
//        System.out.println("Preço final do produto (não deve ter mudado após o erro): R$" + tv.getPreco());
//}



//--------------------------+  Questão 3  +--------------------------

//        System.out.println("--- Calculando bônus de funcionários ---");
//
//        // Crio as instâncias dos funcionários, passando o salário como uma String
//        // para o construtor do BigDecimal, o que garante a precisão.
//        Gerente gerente = new Gerente("Carlos", new BigDecimal("10000.00"));
//        Desenvolvedor dev1 = new Desenvolvedor("Ana", new BigDecimal("7000.00"));
//        Desenvolvedor dev2 = new Desenvolvedor("Bruno", new BigDecimal("7500.00"));
//
//        // Crio uma lista do tipo 'Funcionario'.
//        // Nela, eu posso adicionar qualquer objeto que SEJA UM 'Funcionario',
//        // o que inclui Gerente e Desenvolvedor por causa da herança.
//        List<Funcionario> funcionarios = new ArrayList<>();
//        funcionarios.add(gerente);
//        funcionarios.add(dev1);
//        funcionarios.add(dev2);
//
//        // Uso um 'for-each', que é bem parecido com o forEach do JS.
//        // Para cada 'funcionario' na minha lista de 'funcionarios'...
//        for (Funcionario funcionario : funcionarios) {
//            // Chamo o mesmo método 'calcularBonus()' para todos.
//            // O Java sabe qual versão do método chamar (a do Gerente ou a do Desenvolvedor).
//            // Isso é Polimorfismo!
//            BigDecimal bonus = funcionario.calcularBonus();
//            System.out.println(
//                    "Funcionário: " + funcionario.getNome() +
//                            ", Salário: R$" + funcionario.getSalario() +
//                            ", Bônus: R$" + bonus
//            );
//        }
//    }


    //--------------------------+  Questão 4  +--------------------------

//        System.out.println("--- Demonstrando Polimorfismo com Interfaces ---");
//
//        // Crio uma lista do tipo da INTERFACE.
//        // Isso me permite adicionar qualquer objeto que assine esse contrato.
//        List<IMeioTransporte> veiculos = new ArrayList<>();
//        veiculos.add(new Carro());
//        veiculos.add(new Bicicleta());
//        veiculos.add(new Trem());
//
//        // Para cada 'veiculo' na minha lista de 'veiculos'...
//        for (IMeioTransporte veiculo : veiculos) {
//            System.out.println("\n--- Testando um novo veículo ---");
//            // Não preciso saber se é um Carro, Bicicleta ou Trem.
//            // Eu só sei que, por ser um IMeioTransporte, ele COM CERTEZA
//            // tem o método acelerar(). Isso é o poder do contrato.
//            veiculo.acelerar();
//            veiculo.acelerar();
//            veiculo.frear();
//        }
//
//        System.out.println("\n--- Testando exceção de limite ---");
//        IMeioTransporte bikeRapida = new Bicicleta();
//        try {
//            // Vou acelerar a bicicleta até o limite dela para causar um erro.
//            for (int i = 0; i < 20; i++) {
//                bikeRapida.acelerar();
//            }
//        } catch (IllegalStateException e) {
//            System.out.println("\nERRO CAPTURADO: " + e.getMessage());
//        }
//    }



    //--------------------------+  Questão 5  +--------------------------

//    System.out.println("--- Processando pagamentos com diferentes formas ---");
//    BigDecimal valorCompra = new BigDecimal("250.75");
//
//    // --- Teste com Cartão de Crédito ---
//        System.out.println("\n-- Tentativa com Cartão de Crédito --");
//    FormaPagamento cartaoValido = new CartaoCredito("1111 2222 3333 4444", "Icaro F Leal");
//        cartaoValido.processarPagamento(valorCompra); // Deve funcionar
//
//    FormaPagamento cartaoInvalido = new CartaoCredito("123", "Icaro");
//        cartaoInvalido.processarPagamento(valorCompra); // Deve falhar
//
//    // --- Teste com Boleto ---
//        System.out.println("\n-- Tentativa com Boleto --");
//    FormaPagamento boletoValido = new Boleto("12345678901234567890123456789012345678901234567");
//        boletoValido.processarPagamento(valorCompra); // Deve funcionar
//
//    FormaPagamento boletoInvalido = new Boleto("boleto-invalido");
//        boletoInvalido.processarPagamento(valorCompra); // Deve falhar
//
//    // --- Teste com Pix ---
//        System.out.println("\n-- Tentativa com Pix --");
//    FormaPagamento pixValido = new Pix("contato@meuemail.com");
//        pixValido.processarPagamento(valorCompra); // Deve funcionar
//
//    FormaPagamento pixInvalido = new Pix("  ");
//        pixInvalido.processarPagamento(valorCompra); // Deve falhar
//}


    //--------------------------+  Questão 6  +--------------------------

//        System.out.println("--- Demonstrando fluxo com Carrinho Imutável ---");
//
//        // Preparo meus produtos
//        Produto notebook = new Produto("Notebook Ultra Fino", new Dinheiro(new BigDecimal("5000.00"), Moeda.BRL));
//        Produto mouse = new Produto("Mouse Sem Fio", new Dinheiro(new BigDecimal("150.50"), Moeda.BRL));
//
//        // 1. Começo com um carrinho vazio.
//        Carrinho carrinho1 = Carrinho.carrinhoVazio();
//        System.out.println("1. Estado inicial: " + carrinho1);
//
//        // 2. Adiciono um item. Isso me dá um NOVO objeto de carrinho.
//        Carrinho carrinho2 = carrinho1.adicionarItem(notebook, 1);
//        System.out.println("2. Após adicionar notebook: " + carrinho2);
//
//        // 3. Adiciono outro item, a partir do carrinho2. Tenho um TERCEIRO objeto.
//        Carrinho carrinho3 = carrinho2.adicionarItem(mouse, 2);
//        System.out.println("3. Após adicionar 2 mouses: " + carrinho3);
//
//        // 4. Aplico um cupom. Ganho um QUARTO objeto de carrinho.
//        Carrinho carrinho4 = carrinho3.aplicarCupom(new BigDecimal("0.10")); // 10% de desconto
//        System.out.println("4. Após aplicar cupom de 10%: " + carrinho4);
//
//        System.out.println("\n--- Verificando a Imutabilidade ---");
//        System.out.println("O carrinho1 continua o mesmo? " + carrinho1); // Deve estar vazio
//        System.out.println("carrinho1 é o mesmo objeto que carrinho2? " + (carrinho1 == carrinho2)); // Deve ser false
//        System.out.println("carrinho2 é o mesmo objeto que carrinho3? " + (carrinho2 == carrinho3)); // Deve ser false
//
//        System.out.println("\n--- Testando validação de cupom ---");
//        try {
//            carrinho4.aplicarCupom(new BigDecimal("0.35")); // 35% é inválido
//        } catch (IllegalArgumentException e) {
//            System.out.println("ERRO CAPTURADO: " + e.getMessage());
//        }
//    }


    //--------------------------+  Questão 7  +--------------------------

//    System.out.println("--- Demonstrando Repositório Genérico com Clientes ---");
//
//    // 1. Crio uma instância do repositório, especificando que ele vai
//    // trabalhar com 'Cliente' e 'Long'.
//    IRepository<Cliente, Long> repositorioDeClientes = new InMemoryRepository<>();
//
//    // 2. Salvo algumas entidades.
//        System.out.println("Salvando clientes...");
//        repositorioDeClientes.salvar(new Cliente(1L, "Ana")); // O 'L' indica que o número é do tipo Long
//        repositorioDeClientes.salvar(new Cliente(2L, "Carlos"));
//        repositorioDeClientes.salvar(new Cliente(3L, "Bia"));
//
//    // 3. Listo todos.
//        System.out.println("\nListando todos os clientes:");
//        repositorioDeClientes.listarTodos().forEach(System.out::println);
//
//    // 4. Busco por ID.
//        System.out.println("\nBuscando cliente com ID 2:");
//    // Uso o método '.ifPresentOrElse()' do Optional para tratar os dois casos:
//    // - se o valor existir (ifPresent), eu o imprimo.
//    // - se estiver vazio (orElse), eu imprimo uma mensagem de não encontrado.
//        repositorioDeClientes.buscarPorId(2L)
//                .ifPresentOrElse(
//            cliente -> System.out.println("Encontrado: " + cliente),
//            () -> System.out.println("Cliente não encontrado.")
//            );
//
//        System.out.println("\nBuscando cliente com ID 99 (não existe):");
//        repositorioDeClientes.buscarPorId(99L)
//                .ifPresentOrElse(
//            cliente -> System.out.println("Encontrado: " + cliente),
//            () -> System.out.println("Cliente não encontrado.")
//            );
//
//    // 5. Removo uma entidade e testo a exceção.
//        System.out.println("\nRemovendo cliente com ID 1...");
//        repositorioDeClientes.remover(1L);
//        System.out.println("Clientes restantes:");
//        repositorioDeClientes.listarTodos().forEach(System.out::println);
//
//        System.out.println("\nTentando remover cliente com ID 100 (não existe):");
//        try {
//        repositorioDeClientes.remover(100L);
//    } catch (EntidadeNaoEncontradaException e) {
//        System.out.println("ERRO CAPTURADO: " + e.getMessage());
//    }
//}


//--------------------------+  Questão 8  +--------------------------


System.out.println("--- Demonstrando o Padrão Strategy para Cálculo de Frete ---");

    // Crio um pedido. A estratégia inicial será Sedex.
    Pedido pedido = new Pedido(new BigDecimal("150.00"), "20000111", new Sedex());

    // 1. Calculo com a estratégia inicial (Sedex)
        System.out.println("Valor do frete (Sedex): R$" + pedido.calcularFrete());

    // 2. Troco a estratégia para PAC e calculo novamente o frete PARA O MESMO PEDIDO.
        pedido.setEstrategiaDeFrete(new Pac());
        System.out.println("Valor do frete (PAC): R$" + pedido.calcularFrete());

    // 3. Troco para Retirada na Loja.
        pedido.setEstrategiaDeFrete(new RetiradaNaLoja());
        System.out.println("Valor do frete (Retirada na Loja): R$" + pedido.calcularFrete());

    // 4. Crio uma estratégia promocional usando uma EXPRESSÃO LAMBDA.
    // Não precisei criar uma classe nova!
    // A lógica é: se o valor do pedido for maior que 200, o frete é grátis.
    // Senão, o frete é fixo de R$10.
    CalculadoraFrete fretePromocional = p -> {
        System.out.println("Calculando frete com a estratégia PROMOCIONAL.");
        if (p.getValor().compareTo(new BigDecimal("200.00")) > 0) {
            return BigDecimal.ZERO; // Frete Grátis
        }
        return new BigDecimal("10.00"); // Frete fixo
    };

    // Uso a estratégia promocional.
        pedido.setEstrategiaDeFrete(fretePromocional);
        System.out.println("Valor do frete (Promocional p/ compra de R$150): R$" + pedido.calcularFrete());

    // Crio um novo pedido, mais caro, para testar o frete grátis da promoção.
    Pedido pedidoCaro = new Pedido(new BigDecimal("250.00"), "20000111", fretePromocional);
        System.out.println("Valor do frete (Promocional p/ compra de R$250): R$" + pedidoCaro.calcularFrete());

    // 5. Testo a validação do CEP.
        System.out.println("\n--- Testando validação ---");
        try {
        Pedido pedidoInvalido = new Pedido(new BigDecimal("100"), "CEP-INVALIDO", new Sedex());
        pedidoInvalido.calcularFrete();
    } catch (CepInvalidoException e) {
        System.out.println("ERRO CAPTURADO: " + e.getMessage());
    }
}


}