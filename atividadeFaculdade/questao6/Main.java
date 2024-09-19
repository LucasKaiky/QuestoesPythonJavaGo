// questão 6: Composição - Implemente uma classe Motor e associe-a a uma classe Carro. A classe Carro deve ter um objeto do tipo Motor como um de seus atributos.

package questao6;

class Motor {
    private String tipo;

    public Motor(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}

class Carro {
    private String marca;
    private String modelo;
    private Motor motor;

    public Carro(String marca, String modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Motor: " + motor.getTipo());
    }
}

public class Main {
    public static void main(String[] args) {
        Motor motorV8 = new Motor("V8");
        Carro carro1 = new Carro("Ford", "Mustang", motorV8);
        carro1.exibirDetalhes();
    }
}
