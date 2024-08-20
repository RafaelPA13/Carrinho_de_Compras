import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Criação de input
        Scanner input = new Scanner(System.in);

        //Definindo o saldo do cartão
        System.out.println("Informe o seu saldo: ");
        double limite = input.nextDouble();
        Lista listaDeCompras = new Lista(limite);

        //Loop
        int sair = 0;
        while (sair != 1) {
            //Inserção dos dados do produto
            System.out.println("Digite o produto: ");
            String nomeProduto = input.next();

            System.out.println("Digite o preço do produto: ");
            double precoProduto = input.nextDouble();

            Produto produto = new Produto(nomeProduto, precoProduto);

            //Condicional para verificação do saldo
            if (precoProduto <= listaDeCompras.getSaldo()) {
                System.out.println(nomeProduto + "adicionado com sucesso!");
                listaDeCompras.adicionar(produto);
            }
            else {
                System.out.println("Saldo insuficiente");
                break;
            }

            //Input de encerramento
            System.out.println("""
                    Deseja continuar?
                    - Digite 0 para sim
                    - Digite 1 para não
                    """);
            sair = input.nextInt();
        }

        //Impressão da lista ao final do loop
        listaDeCompras.imprimir();
    }
}