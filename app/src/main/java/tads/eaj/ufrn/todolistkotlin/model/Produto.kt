package tads.eaj.ufrn.todolistkotlin.model

import java.math.BigDecimal

data class Produto(
    val title: String,
    val descricao: String,
    val valor: BigDecimal
)
