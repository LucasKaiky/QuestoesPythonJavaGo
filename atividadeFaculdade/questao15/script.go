// questão 15: Erros Personalizados - Crie um error personalizado que seja lançado quando houver uma tentativa de saque superior ao saldo disponível na classe ContaBancaria.

package main

import (
	"fmt"
)

type SaldoInsuficienteError struct{}

func (e *SaldoInsuficienteError) Error() string {
	return "Saldo insuficiente para realizar o saque."
}

type ContaBancaria struct {
	Saldo float64
}

func (c *ContaBancaria) Sacar(valor float64) error {
	if valor > c.Saldo {
		return &SaldoInsuficienteError{}
	}
	c.Saldo -= valor
	return nil
}

func main() {
	conta := ContaBancaria{Saldo: 500}

	err := conta.Sacar(600)
	if err != nil {
		fmt.Println(err)
	}

	fmt.Printf("Saldo atual: %.2f\n", conta.Saldo)
}
