package br.com.portfolio.felipe.gadelha.entity

interface Authentication {
    fun authenticate(password: Int): Boolean
}