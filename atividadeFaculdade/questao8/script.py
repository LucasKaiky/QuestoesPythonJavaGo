# questão 8: Agregação - Modele uma classe Empresa que agregue uma lista de objetos Empregado. Cada empregado deve ter atributos como nome, cargo, e salario.

class Empregado:
    def __init__(self, nome, cargo, salario):
        self.nome = nome
        self.cargo = cargo
        self.salario = salario

class Empresa:
    def __init__(self, nome):
        self.nome = nome
        self.empregados = []

    def adicionar_empregado(self, empregado):
        self.empregados.append(empregado)

    def exibir_empregados(self):
        print(f"Empregados da empresa {self.nome}:")
        for empregado in self.empregados:
            print(f"- {empregado.nome}, Cargo: {empregado.cargo}, Salário: R${empregado.salario}")

empresa = Empresa("Tech Solutions")
empregado1 = Empregado("Ana", "Desenvolvedora", 5000)
empregado2 = Empregado("Carlos", "Gerente", 7000)

empresa.adicionar_empregado(empregado1)
empresa.adicionar_empregado(empregado2)

empresa.exibir_empregados()
