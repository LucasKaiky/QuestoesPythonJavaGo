# questão 12: Sobrecarga de Operadores - Sobrecargue o operador + para somar dois objetos Produto baseados no preço.

class Produto:
    def __init__(self, nome, preco):
        self.nome = nome
        self.preco = preco

    def __add__(self, outro_produto):
        return self.preco + outro_produto.preco

produto1 = Produto("Produto A", 50)
produto2 = Produto("Produto B", 100)

soma_precos = produto1 + produto2
print(f"Soma dos preços: R$ {soma_precos}")
