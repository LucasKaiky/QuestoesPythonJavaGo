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

func main() {
	var animal Animal

	animal = Cachorro{}
	animal.Som()

	animal = Gato{}
	animal.Som()
}
