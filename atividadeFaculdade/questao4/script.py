class Animal:
    def som(self):
        print("Animal faz um som.")

class Cachorro(Animal):
    def som(self):
        print("Cachorro faz: Au Au!")

class Gato(Animal):
    def som(self):
        print("Gato faz: Miau!")

cachorro = Cachorro()
gato = Gato()

cachorro.som()
gato.som()
