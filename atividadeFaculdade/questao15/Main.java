// questão 15: Exceções Personalizadas - Crie uma classe de exceção personalizada SaldoInsuficienteException que seja lançada quando houver uma tentativa de saque superior ao saldo disponível na classe ContaBancaria.

package questao15;

class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}

class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque.");
        }
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(500);

        try {
            conta.sacar(600);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Saldo atual: " + conta.getSaldo());
    }
}
