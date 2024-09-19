package main

import "fmt"

type Carro struct {
	Marca      string
	Modelo     string
	Ano        int
	Velocidade int
}

func (c *Carro) Acelerar(incremento int) {
	c.Velocidade += incremento
}

func (c *Carro) Frear(decremento int) {
	c.Velocidade -= decremento
	if c.Velocidade < 0 {
		c.Velocidade = 0
	}
}

func (c Carro) ExibirVelocidade() {
	fmt.Printf("Velocidade atual: %d km/h\n", c.Velocidade)
}

func main() {
	carro1 := Carro{"Toyota", "Corolla", 2020, 0}
	carro1.Acelerar(50)
	carro1.ExibirVelocidade()
	carro1.Frear(20)
	carro1.ExibirVelocidade()
	carro1.Frear(40)
	carro1.ExibirVelocidade()
}
