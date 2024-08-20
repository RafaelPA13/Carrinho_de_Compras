import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lista {
    //Variáveis relacionadas a lista de compras
    private double limite;
    private double saldo;
    List<Produto> listaDeCompras;

    //Construtor da Classe Lista
    public Lista(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.listaDeCompras = new ArrayList<>();
    }

    //Getter
    public double getSaldo() {
        return saldo;
    }

    //Função que adiciona o produto na lista
    public void adicionar(Produto produto) {
        this.saldo -= produto.getPreco();
        listaDeCompras.add(produto);
    }

    //Função que imprime a lista
    public void imprimir() {
        listaDeCompras.sort(Comparator.comparing(Produto::getPreco));
        System.out.println("**********************************\n");
        System.out.println("Lista de Compras: \n");
        listaDeCompras.forEach(item -> System.out.println(item));
        System.out.println("\nSaldo Atual: " + getSaldo());
        System.out.println("\n**********************************");
    }

}
