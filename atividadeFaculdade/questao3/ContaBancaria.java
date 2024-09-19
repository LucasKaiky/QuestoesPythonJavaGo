package questao3;

public class ContaBancaria {
    private double saldo;
    private String titular;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Lucas", 1000.0);
        conta.depositar(500.0);
        System.out.println("Saldo após depósito: " + conta.getSaldo());
        conta.sacar(200.0);
        System.out.println("Saldo após saque: " + conta.getSaldo());
    }
}
