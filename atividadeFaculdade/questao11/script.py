# questão 11: Classes Abstratas - Crie uma classe abstrata Funcionario com um método abstrato calcularSalario. Derive classes como FuncionarioHorista e FuncionarioAssalariado que implementam calcularSalario de formas distintas.

from abc import ABC, abstractmethod

class Funcionario(ABC):
    def __init__(self, nome):
        self.nome = nome

    @abstractmethod
    def calcular_salario(self):
        pass

class FuncionarioHorista(Funcionario):
    def __init__(self, nome, horas_trabalhadas, valor_hora):
        super().__init__(nome)
        self.horas_trabalhadas = horas_trabalhadas
        self.valor_hora = valor_hora

    def calcular_salario(self):
        return self.horas_trabalhadas * self.valor_hora

class FuncionarioAssalariado(Funcionario):
    def __init__(self, nome, salario_mensal):
        super().__init__(nome)
        self.salario_mensal = salario_mensal

    def calcular_salario(self):
        return self.salario_mensal

horista = FuncionarioHorista("Carlos", 160, 50)
assalariado = FuncionarioAssalariado("Ana", 3000)

print(f"Salário do horista: R$ {horista.calcular_salario()}")
print(f"Salário do assalariado: R$ {assalariado.calcular_salario()}")
