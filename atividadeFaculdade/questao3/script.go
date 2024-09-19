package main

import "fmt"

type ContaBancaria struct {
	titular string
	saldo   float64
}

func (c *ContaBancaria) Depositar(valor float64) {
	if valor > 0 {
		c.saldo += valor
	}
}

func (c *ContaBancaria) Sacar(valor float64) {
	if valor > 0 && valor <= c.saldo {
		c.saldo -= valor
	}
}

func (c ContaBancaria) GetSaldo() float64 {
	return c.saldo
}

func (c ContaBancaria) GetTitular() string {
	return c.titular
}

func main() {
	conta := ContaBancaria{titular: "Lucas", saldo: 1000.0}
	conta.Depositar(500.0)
	fmt.Printf("Saldo após depósito: %.2f\n", conta.GetSaldo())
	conta.Sacar(200.0)
	fmt.Printf("Saldo após saque: %.2f\n", conta.GetSaldo())
}
