# questão 15: Exceções Personalizadas - Crie uma classe de exceção personalizada SaldoInsuficienteException que seja lançada quando houver uma tentativa de saque superior ao saldo disponível na classe ContaBancaria.

class SaldoInsuficienteException(Exception):
    pass

class ContaBancaria:
    def __init__(self, saldo_inicial):
        self.saldo = saldo_inicial

    def sacar(self, valor):
        if valor > self.saldo:
            raise SaldoInsuficienteException("Saldo insuficiente para realizar o saque.")
        self.saldo -= valor

    def get_saldo(self):
        return self.saldo

conta = ContaBancaria(500)

try:
    conta.sacar(600)
except SaldoInsuficienteException as e:
    print(e)

print(f"Saldo atual: {conta.get_saldo()}")
