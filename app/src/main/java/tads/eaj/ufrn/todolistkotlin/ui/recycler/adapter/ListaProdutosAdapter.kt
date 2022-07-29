package tads.eaj.ufrn.todolistkotlin.ui.recycler.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import tads.eaj.ufrn.todolistkotlin.R
import tads.eaj.ufrn.todolistkotlin.model.Item

class ListaProdutosAdapter(
    private val context: Context,
    items: List<Item>
) : RecyclerView.Adapter<ListaProdutosAdapter.ViewHolder>() {
    private val items = items.toMutableList()

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun vincula(item: Item) {
            val title = itemView.findViewById<TextView>(R.id.title)
            val descricao = itemView.findViewById<TextView>(R.id.descricao)
            val valor = itemView.findViewById<TextView>(R.id.valor)

            title.text = item.title
            descricao.text = item.descricao
            valor.text = item.valor.toPlainString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val produto = items[position]
        holder.vincula(produto)
    }

    override fun getItemCount(): Int = items.size
    fun update(items: List<Item>) {
        this.items.clear()
        this.items.addAll(items)
        notifyDataSetChanged()
    }
}
