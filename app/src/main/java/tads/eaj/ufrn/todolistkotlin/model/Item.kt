package tads.eaj.ufrn.todolistkotlin.model

import java.math.BigDecimal

data class Item(
    val title: String,
    val descricao: String,
    val valor: BigDecimal
)
