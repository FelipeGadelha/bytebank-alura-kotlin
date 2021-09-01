package br.com.portfolio.felipe.gadelha.exception

class InsufficientFundsException(
    message: String = "O saldo é insuficiente"
) : Exception(message)