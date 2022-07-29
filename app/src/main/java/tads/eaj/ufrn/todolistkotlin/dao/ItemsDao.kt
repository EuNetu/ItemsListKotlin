package tads.eaj.ufrn.todolistkotlin.dao

import tads.eaj.ufrn.todolistkotlin.model.Item

class ItemsDao {

    private val items = mutableListOf<Item>()

    fun addItem(item : Item){
        items.add(item)
    }

    fun getItems() : List<Item>{
        return items.toList()
    }
}