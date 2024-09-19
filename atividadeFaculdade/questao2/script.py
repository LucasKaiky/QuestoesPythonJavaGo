class Carro:
    def __init__(self, marca, modelo, ano):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano
        self.velocidade = 0

    def acelerar(self, incremento):
        self.velocidade += incremento

    def frear(self, decremento):
        self.velocidade -= decremento
        if self.velocidade < 0:
            self.velocidade = 0

    def exibir_velocidade(self):
        print(f"Velocidade atual: {self.velocidade} km/h")

carro1 = Carro("Toyota", "Corolla", 2020)
carro1.acelerar(50)
carro1.exibir_velocidade()
carro1.frear(20)
carro1.exibir_velocidade()
carro1.frear(40)
carro1.exibir_velocidade()
