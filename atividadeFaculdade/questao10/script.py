# questão 10: Métodos com Nomes Diferentes - Implemente uma classe Calculadora com métodos somar que aceita diferentes números de parâmetros (dois ou três números).

class Calculadora:
    def somar_dois(self, a, b):
        return a + b

    def somar_tres(self, a, b, c):
        return a + b + c

calculadora = Calculadora()
print(f"Soma de dois números: {calculadora.somar_dois(2, 3)}")
print(f"Soma de três números: {calculadora.somar_tres(2, 3, 4)}")
