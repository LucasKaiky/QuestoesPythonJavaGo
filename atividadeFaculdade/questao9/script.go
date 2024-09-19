// questão 9: Interfaces - Defina uma interface para imprimível que tenha um método imprimir. Implemente essa interface em classes como Relatório e Contrato.

package main

import "fmt"

type Imprimivel interface {
	Imprimir()
}

type Relatorio struct {
	Conteudo string
}

func (r Relatorio) Imprimir() {
	fmt.Println("Imprimindo relatório:", r.Conteudo)
}

type Contrato struct {
	Partes string
}

func (c Contrato) Imprimir() {
	fmt.Println("Imprimindo contrato entre:", c.Partes)
}

func main() {
	var imprimivel Imprimivel

	relatorio := Relatorio{Conteudo: "Relatório de Vendas"}
	contrato := Contrato{Partes: "Empresa X e Empresa Y"}

	imprimivel = relatorio
	imprimivel.Imprimir()

	imprimivel = contrato
	imprimivel.Imprimir()
}
