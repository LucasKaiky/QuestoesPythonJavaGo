class ContaBancaria:
    def __init__(self, titular, saldo_inicial):
        self.__saldo = saldo_inicial
        self.titular = titular

    def depositar(self, valor):
        if valor > 0:
            self.__saldo += valor

    def sacar(self, valor):
        if 0 < valor <= self.__saldo:
            self.__saldo -= valor

    def get_saldo(self):
        return self.__saldo

    def get_titular(self):
        return self.titular

conta = ContaBancaria("Lucas", 1000.0)
conta.depositar(500.0)
print(f"Saldo após depósito: {conta.get_saldo()}")
conta.sacar(200.0)
print(f"Saldo após saque: {conta.get_saldo()}")
