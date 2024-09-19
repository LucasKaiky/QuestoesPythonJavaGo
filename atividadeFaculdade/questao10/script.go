// questão 10: Métodos com Nomes Diferentes - Implemente uma classe Calculadora com métodos somar que aceita diferentes números de parâmetros (dois ou três números).

package main

import "fmt"

type Calculadora struct{}

func (calc Calculadora) SomarDois(a, b int) int {
	return a + b
}

func (calc Calculadora) SomarTres(a, b, c int) int {
	return a + b + c
}

func main() {
	calculadora := Calculadora{}
	fmt.Println("Soma de dois números:", calculadora.SomarDois(2, 3))
	fmt.Println("Soma de três números:", calculadora.SomarTres(2, 3, 4))
}
