// questão 14: Singleton - Implemente o padrão de projeto Singleton para garantir que apenas uma instância de uma classe Configuracao seja criada.

package main

import (
	"fmt"
	"sync"
)

type Configuracao struct{}

var instanciaUnica *Configuracao
var once sync.Once

func GetInstancia() *Configuracao {
	once.Do(func() {
		instanciaUnica = &Configuracao{}
	})
	return instanciaUnica
}

func (c *Configuracao) MostrarMensagem() {
	fmt.Println("Configuração única!")
}

func main() {
	config1 := GetInstancia()
	config2 := GetInstancia()

	config1.MostrarMensagem()
	fmt.Println(config1 == config2) // Verifica se são a mesma instância
}
