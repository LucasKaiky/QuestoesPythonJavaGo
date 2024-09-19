// questão 8: Agregação - Modele uma classe Empresa que agregue uma lista de objetos Empregado. Cada empregado deve ter atributos como nome, cargo, e salario.

package main

import "fmt"

type Empregado struct {
	Nome   string
	Cargo  string
	Salario float64
}

type Empresa struct {
	Nome      string
	Empregados []Empregado
}

func (e *Empresa) AdicionarEmpregado(empregado Empregado) {
	e.Empregados = append(e.Empregados, empregado)
}

func (e Empresa) ExibirEmpregados() {
	fmt.Printf("Empregados da empresa %s:\n", e.Nome)
	for _, empregado := range e.Empregados {
		fmt.Printf("- %s, Cargo: %s, Salário: R$%.2f\n", empregado.Nome, empregado.Cargo, empregado.Salario)
	}
}

func main() {
	empresa := Empresa{Nome: "Tech Solutions"}
	empregado1 := Empregado{Nome: "Ana", Cargo: "Desenvolvedora", Salario: 5000}
	empregado2 := Empregado{Nome: "Carlos", Cargo: "Gerente", Salario: 7000}

	empresa.AdicionarEmpregado(empregado1)
	empresa.AdicionarEmpregado(empregado2)

	empresa.ExibirEmpregados()
}
