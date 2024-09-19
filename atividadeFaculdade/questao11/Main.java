// questão 11: Classes Abstratas - Crie uma classe abstrata Funcionario com um método abstrato calcularSalario. Derive classes como FuncionarioHorista e FuncionarioAssalariado que implementam calcularSalario de formas distintas.

package questao11;

abstract class Funcionario {
    protected String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public abstract double calcularSalario();
}

class FuncionarioHorista extends Funcionario {
    private double horasTrabalhadas;
    private double valorHora;

    public FuncionarioHorista(String nome, double horasTrabalhadas, double valorHora) {
        super(nome);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorHora;
    }
}

class FuncionarioAssalariado extends Funcionario {
    private double salarioMensal;

    public FuncionarioAssalariado(String nome, double salarioMensal) {
        super(nome);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularSalario() {
        return salarioMensal;
    }
}

public class Main {
    public static void main(String[] args) {
        Funcionario horista = new FuncionarioHorista("Carlos", 160, 50);
        Funcionario assalariado = new FuncionarioAssalariado("Ana", 3000);

        System.out.println("Salário do horista: R$ " + horista.calcularSalario());
        System.out.println("Salário do assalariado: R$ " + assalariado.calcularSalario());
    }
}
