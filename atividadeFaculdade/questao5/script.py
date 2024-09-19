# questão 5: Polimorfismo - Utilize polimorfismo para criar uma função que receba uma lista de objetos Animal e chame o método som de cada um, demonstrando comportamento diferente para cada subclasse.

class Animal:
    def som(self):
        print("Animal faz um som.")

class Cachorro(Animal):
    def som(self):
        print("Cachorro faz: Au Au!")

class Gato(Animal):
    def som(self):
        print("Gato faz: Miau!")

def emitir_sons(animais):
    for animal in animais:
        animal.som()

animais = [Cachorro(), Gato()]
emitir_sons(animais)
