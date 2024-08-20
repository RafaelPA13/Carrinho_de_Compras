public class Produto {
    //Variáveis ralacionadas ao produto
    private String nome;
    private double preco;

    //Construtor do produto
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    //Forma de imprimir o produto
    @Override
    public String toString() {
        return nome + " - R$" + preco;
    }

}
