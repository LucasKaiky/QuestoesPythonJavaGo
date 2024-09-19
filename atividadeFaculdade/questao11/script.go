// questão 11: Classes Abstratas - Simulação de classes abstratas usando interfaces. Crie uma interface Funcionario com um método calcularSalario. Derive tipos como FuncionarioHorista e FuncionarioAssalariado que implementam calcularSalario de formas distintas.

package main

import "fmt"

type Funcionario interface {
	CalcularSalario() float64
}

type FuncionarioHorista struct {
	Nome            string
	HorasTrabalhadas float64
	ValorHora       float64
}

func (f FuncionarioHorista) CalcularSalario() float64 {
	return f.HorasTrabalhadas * f.ValorHora
}

type FuncionarioAssalariado struct {
	Nome         string
	SalarioMensal float64
}

func (f FuncionarioAssalariado) CalcularSalario() float64 {
	return f.SalarioMensal
}

func main() {
	horista := FuncionarioHorista{Nome: "Carlos", HorasTrabalhadas: 160, ValorHora: 50}
	assalariado := FuncionarioAssalariado{Nome: "Ana", SalarioMensal: 3000}

	fmt.Printf("Salário do horista: R$ %.2f\n", horista.CalcularSalario())
	fmt.Printf("Salário do assalariado: R$ %.2f\n", assalariado.CalcularSalario())
}
