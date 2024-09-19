# questão 13: Métodos Estáticos - Adicione um método estático à classe Matematica que calcula o fatorial de um número.

class Matematica:
    @staticmethod
    def fatorial(n):
        if n == 0 or n == 1:
            return 1
        else:
            return n * Matematica.fatorial(n - 1)

print(f"Fatorial de 5: {Matematica.fatorial(5)}")
