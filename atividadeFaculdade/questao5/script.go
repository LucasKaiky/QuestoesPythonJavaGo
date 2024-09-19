// questão 5: Polimorfismo - Utilize polimorfismo para criar uma função que receba uma lista de objetos Animal e chame o método som de cada um, demonstrando comportamento diferente para cada subclasse.

package main

import "fmt"

type Animal interface {
	Som()
}

type Cachorro struct{}

func (c Cachorro) Som() {
	fmt.Println("Cachorro faz: Au Au!")
}

type Gato struct{}

func (g Gato) Som() {
	fmt.Println("Gato faz: Miau!")
}

func EmitirSons(animais []Animal) {
	for _, animal := range animais {
		animal.Som()
	}
}

func main() {
	animais := []Animal{Cachorro{}, Gato{}}
	EmitirSons(animais)
}
