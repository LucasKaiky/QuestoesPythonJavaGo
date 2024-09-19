// questão 7: Associação - Crie uma classe Escola e uma classe Professor. A associação deve permitir que uma escola tenha vários professores, e um professor possa lecionar em várias escolas.

package questao7;

import java.util.ArrayList;
import java.util.List;

class Professor {
    private String nome;

    public Professor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Escola {
    private String nome;
    private List<Professor> professores;

    public Escola(String nome) {
        this.nome = nome;
        this.professores = new ArrayList<>();
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void exibirProfessores() {
        System.out.println("Professores na escola " + nome + ":");
        for (Professor professor : professores) {
            System.out.println("- " + professor.getNome());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Professor professor1 = new Professor("João");
        Professor professor2 = new Professor("Maria");

        Escola escola1 = new Escola("Escola A");
        Escola escola2 = new Escola("Escola B");

        escola1.adicionarProfessor(professor1);
        escola1.adicionarProfessor(professor2);

        escola2.adicionarProfessor(professor1);

        escola1.exibirProfessores();
        escola2.exibirProfessores();
    }
}
