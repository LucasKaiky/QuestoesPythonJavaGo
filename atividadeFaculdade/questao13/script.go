// questão 13: Métodos Estáticos - Adicione uma função regular à struct Matematica que calcula o fatorial de um número.

package main

import "fmt"

type Matematica struct{}

func (Matematica) Fatorial(n int) int {
	if n == 0 || n == 1 {
		return 1
	}
	return n * Matematica{}.Fatorial(n - 1)
}

func main() {
	m := Matematica{}
	fmt.Println("Fatorial de 5:", m.Fatorial(5))
}
