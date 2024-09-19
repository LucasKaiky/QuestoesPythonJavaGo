// questão 9: Interfaces - Defina uma interface para imprimível que tenha um método imprimir. Implemente essa interface em classes como Relatório e Contrato.

package questao9;

interface Imprimivel {
    void imprimir();
}

class Relatorio implements Imprimivel {
    private String conteudo;

    public Relatorio(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo relatório: " + conteudo);
    }
}

class Contrato implements Imprimivel {
    private String partes;

    public Contrato(String partes) {
        this.partes = partes;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo contrato entre: " + partes);
    }
}

public class Main {
    public static void main(String[] args) {
        Imprimivel relatorio = new Relatorio("Relatório de Vendas");
        Imprimivel contrato = new Contrato("Empresa X e Empresa Y");

        relatorio.imprimir();
        contrato.imprimir();
    }
}
