# questão 7: Associação - Crie uma classe Escola e uma classe Professor. A associação deve permitir que uma escola tenha vários professores, e um professor possa lecionar em várias escolas.

class Professor:
    def __init__(self, nome):
        self.nome = nome

class Escola:
    def __init__(self, nome):
        self.nome = nome
        self.professores = []

    def adicionar_professor(self, professor):
        self.professores.append(professor)

    def exibir_professores(self):
        print(f"Professores na escola {self.nome}:")
        for professor in self.professores:
            print(f"- {professor.nome}")

professor1 = Professor("João")
professor2 = Professor("Maria")

escola1 = Escola("Escola A")
escola2 = Escola("Escola B")

escola1.adicionar_professor(professor1)
escola1.adicionar_professor(professor2)

escola2.adicionar_professor(professor1)

escola1.exibir_professores()
escola2.exibir_professores()
