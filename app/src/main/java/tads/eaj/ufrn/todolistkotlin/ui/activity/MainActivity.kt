package tads.eaj.ufrn.todolistkotlin.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import tads.eaj.ufrn.todolistkotlin.R
import tads.eaj.ufrn.todolistkotlin.dao.ItemsDao
import tads.eaj.ufrn.todolistkotlin.ui.recycler.adapter.ListaProdutosAdapter

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val recycler = findViewById<RecyclerView>(R.id.recyclerviwer)
        val itemsDao = ItemsDao()

        recycler.adapter = ListaProdutosAdapter(
            context = this, itemsDao.getItems()
        )
        val fab = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        fab.setOnClickListener {
            val intent = Intent(this, FormItemActivity::class.java)
            startActivity(intent)
        }
    }
}