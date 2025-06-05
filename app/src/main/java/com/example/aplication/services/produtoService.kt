package com.example.aplication.services

import com.example.aplication.models.Produto

val jsonProdutos = """
    {
    {"nome": "Caneta", "preco": 2.8, "emPromocao":true}
    {"nome": "Caderno", "preco": 10.0, "emPromocao":true}
    {"nome": "Lápis", "preco": 2.8, "emPromocao":true}
    }
""".trimIndent()

val objProdutos = listOf(
    Produto("Camiseta", 59.90, true),
    Produto("Tênis", 199.90, false),
    Produto("Boné", 39.90, true),
)