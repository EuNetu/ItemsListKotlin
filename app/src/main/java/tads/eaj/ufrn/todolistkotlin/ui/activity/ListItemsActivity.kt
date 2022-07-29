package tads.eaj.ufrn.todolistkotlin.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import tads.eaj.ufrn.todolistkotlin.R
import tads.eaj.ufrn.todolistkotlin.dao.ItemsDao
import tads.eaj.ufrn.todolistkotlin.ui.recycler.adapter.ListaProdutosAdapter

class ListItemsActivity : AppCompatActivity(R.layout.activity_list_items) {
    val itemsDao = ItemsDao()
    private val adapter = ListaProdutosAdapter(context = this, itemsDao.getItems())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        configureRecyclerView()
        configureFAB()
    }

    override fun onResume() {
        super.onResume()
        adapter.update(itemsDao.getItems())
    }

    private fun configureFAB() {
        val fab = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        fab.setOnClickListener {
            val intent = Intent(this, FormItemActivity::class.java)
            startActivity(intent)
        }
    }

    private fun configureRecyclerView() {
        val recycler = findViewById<RecyclerView>(R.id.recyclerviwer)
        recycler.adapter = adapter
    }
}