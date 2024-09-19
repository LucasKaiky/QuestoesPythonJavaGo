// questão 13: Métodos Estáticos - Adicione um método estático à classe Matematica que calcula o fatorial de um número.

package questao13;

class Matematica {
    public static int fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fatorial(n - 1);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Fatorial de 5: " + Matematica.fatorial(5));
    }
}
