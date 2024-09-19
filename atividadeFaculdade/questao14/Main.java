// questão 14: Singleton - Implemente o padrão de projeto Singleton para garantir que apenas uma instância de uma classe Configuracao seja criada.

package questao14;

class Configuracao {
    private static Configuracao instanciaUnica;

    private Configuracao() {
        // Construtor privado
    }

    public static Configuracao getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new Configuracao();
        }
        return instanciaUnica;
    }

    public void mostrarMensagem() {
        System.out.println("Configuração única!");
    }
}

public class Main {
    public static void main(String[] args) {
        Configuracao config1 = Configuracao.getInstancia();
        Configuracao config2 = Configuracao.getInstancia();

        config1.mostrarMensagem();
        System.out.println(config1 == config2); // Verifica se são a mesma instância
    }
}
