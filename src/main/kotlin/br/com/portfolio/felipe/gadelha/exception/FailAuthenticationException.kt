package br.com.portfolio.felipe.gadelha.exception

class FailAuthenticationException(
    message: String = "Falha na autenticação"
) : Exception(message)