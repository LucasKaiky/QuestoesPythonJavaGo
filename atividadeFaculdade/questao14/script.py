# questão 14: Singleton - Implemente o padrão de projeto Singleton para garantir que apenas uma instância de uma classe Configuracao seja criada.

class Configuracao:
    _instancia = None

    def __new__(cls):
        if cls._instancia is None:
            cls._instancia = super().__new__(cls)
        return cls._instancia

    def mostrar_mensagem(self):
        print("Configuração única!")

config1 = Configuracao()
config2 = Configuracao()

config1.mostrar_mensagem()
print(config1 is config2)  # Verifica se são a mesma instância
