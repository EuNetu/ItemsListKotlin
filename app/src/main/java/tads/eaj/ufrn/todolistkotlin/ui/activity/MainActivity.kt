package tads.eaj.ufrn.todolistkotlin.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import tads.eaj.ufrn.todolistkotlin.R
import tads.eaj.ufrn.todolistkotlin.model.Produto
import tads.eaj.ufrn.todolistkotlin.ui.recycler.adapter.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val recycler = findViewById<RecyclerView>(R.id.recyclerviwer)

        recycler.adapter = ListaProdutosAdapter(
            context = this, listOf(
                Produto(
                    title = "title",
                    descricao = "desc",
                    valor = BigDecimal("25.00")),
                Produto(
                    title = "title2",
                    descricao = "desc2",
                    valor = BigDecimal("28.00")),
                Produto(
                    title = "title3",
                    descricao = "desc3",
                    valor = BigDecimal("35.00"))
            )
        )
    }
}