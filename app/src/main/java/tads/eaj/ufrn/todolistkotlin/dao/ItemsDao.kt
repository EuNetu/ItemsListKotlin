package tads.eaj.ufrn.todolistkotlin.dao

import tads.eaj.ufrn.todolistkotlin.model.Item

class ItemsDao {

    fun addItem(item : Item){
        items.add(item)
    }

    fun getItems() : List<Item>{
        return items.toList()
    }

    companion object {
        private val items = mutableListOf<Item>()
    }
}