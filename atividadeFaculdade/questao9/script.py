# questão 9: Protocolos - Defina um protocolo para imprimível que tenha um método imprimir. Implemente esse protocolo em classes como Relatório e Contrato.

from typing import Protocol

class Imprimivel(Protocol):
    def imprimir(self) -> None:
        ...

class Relatorio:
    def __init__(self, conteudo: str):
        self.conteudo = conteudo

    def imprimir(self) -> None:
        print(f"Imprimindo relatório: {self.conteudo}")

class Contrato:
    def __init__(self, partes: str):
        self.partes = partes

    def imprimir(self) -> None:
        print(f"Imprimindo contrato entre: {self.partes}")

relatorio = Relatorio("Relatório de Vendas")
contrato = Contrato("Empresa X e Empresa Y")

relatorio.imprimir()
contrato.imprimir()
