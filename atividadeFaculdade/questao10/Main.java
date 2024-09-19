// questão 10: Sobrecarga de Métodos - Implemente uma classe Calculadora com métodos somar que aceita diferentes números de parâmetros (dois ou três números).

package questao10;

class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public int somar(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("Soma de dois números: " + calculadora.somar(2, 3));
        System.out.println("Soma de três números: " + calculadora.somar(2, 3, 4));
    }
}
