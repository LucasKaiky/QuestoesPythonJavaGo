package questao2;

public class Carro {
    String marca;
    String modelo;
    int ano;
    int velocidade;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
    }

    public void acelerar(int incremento) {
        velocidade += incremento;
    }

    public void frear(int decremento) {
        velocidade -= decremento;
        if (velocidade < 0) {
            velocidade = 0;
        }
    }

    public void exibirVelocidade() {
        System.out.println("Velocidade atual: " + velocidade + " km/h");
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        carro1.acelerar(50);
        carro1.exibirVelocidade();
        carro1.frear(20);
        carro1.exibirVelocidade();
        carro1.frear(40);
        carro1.exibirVelocidade();
    }
}
