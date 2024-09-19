// questão 12: Métodos de Conveniência - Crie um método que permita somar dois objetos Produto baseados no preço.

package questao12;

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public static double somarPrecos(Produto p1, Produto p2) {
        return p1.getPreco() + p2.getPreco();
    }
}

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Produto A", 50);
        Produto produto2 = new Produto("Produto B", 100);

        double somaPrecos = Produto.somarPrecos(produto1, produto2);
        System.out.println("Soma dos preços: R$ " + somaPrecos);
    }
}
