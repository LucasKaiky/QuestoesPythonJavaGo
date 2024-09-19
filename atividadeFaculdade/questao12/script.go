// questão 12: Métodos de Conveniência - Crie um método que permita somar dois objetos Produto baseados no preço.

package main

import "fmt"

type Produto struct {
	Nome  string
	Preco float64
}

func SomarPrecos(p1, p2 Produto) float64 {
	return p1.Preco + p2.Preco
}

func main() {
	produto1 := Produto{Nome: "Produto A", Preco: 50}
	produto2 := Produto{Nome: "Produto B", Preco: 100}

	somaPrecos := SomarPrecos(produto1, produto2)
	fmt.Printf("Soma dos preços: R$ %.2f\n", somaPrecos)
}
