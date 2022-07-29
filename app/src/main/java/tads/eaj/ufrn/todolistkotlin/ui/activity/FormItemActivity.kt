package tads.eaj.ufrn.todolistkotlin.ui.activity

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import tads.eaj.ufrn.todolistkotlin.R
import tads.eaj.ufrn.todolistkotlin.dao.ItemsDao
import tads.eaj.ufrn.todolistkotlin.model.Item
import java.math.BigDecimal

class FormItemActivity : AppCompatActivity(R.layout.activity_form_item) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        buttonConfiguration()
    }

    private fun buttonConfiguration() {
        val buttonSave = findViewById<Button>(R.id.formbutton)
        val itemsDao = ItemsDao()
        buttonSave.setOnClickListener {
            val novoItem = creatingItem()
            itemsDao.addItem(novoItem)
            finish()
        }
    }

    private fun creatingItem(): Item {
        val formTitle = findViewById<EditText>(R.id.formtitle)
        val formDescricao = findViewById<EditText>(R.id.formdescricao)
        val formValor = findViewById<EditText>(R.id.formvalor)

        val title = formTitle.text.toString()
        val descricao = formDescricao.text.toString()
        val valorString = formValor.text.toString()

        val valor = if (valorString.isBlank()) {
            BigDecimal.ZERO
        } else {
            BigDecimal(valorString)
        }

        return Item(
            title = title,
            descricao = descricao,
            valor = valor
        )
    }
}