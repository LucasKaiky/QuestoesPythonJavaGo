# questão 6: Composição - Implemente uma classe Motor e associe-a a uma classe Carro. A classe Carro deve ter um objeto do tipo Motor como um de seus atributos.

class Motor:
    def __init__(self, tipo):
        self.tipo = tipo

class Carro:
    def __init__(self, marca, modelo, motor):
        self.marca = marca
        self.modelo = modelo
        self.motor = motor

    def exibir_detalhes(self):
        print(f"Marca: {self.marca}, Modelo: {self.modelo}, Motor: {self.motor.tipo}")

motor_v8 = Motor("V8")
carro1 = Carro("Ford", "Mustang", motor_v8)
carro1.exibir_detalhes()
