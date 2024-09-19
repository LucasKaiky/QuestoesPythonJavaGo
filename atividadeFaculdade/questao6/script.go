// questão 6: Composição - Implemente uma classe Motor e associe-a a uma classe Carro. A classe Carro deve ter um objeto do tipo Motor como um de seus atributos.

package main

import "fmt"

type Motor struct {
	Tipo string
}

type Carro struct {
	Marca  string
	Modelo string
	Motor  Motor
}

func (c Carro) ExibirDetalhes() {
	fmt.Printf("Marca: %s, Modelo: %s, Motor: %s\n", c.Marca, c.Modelo, c.Motor.Tipo)
}

func main() {
	motorV8 := Motor{Tipo: "V8"}
	carro := Carro{Marca: "Ford", Modelo: "Mustang", Motor: motorV8}
	carro.ExibirDetalhes()
}
