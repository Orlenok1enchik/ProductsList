package com.example.newproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class ItemsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items)

        val ItemsList: RecyclerView = findViewById(R.id.itemsList)
        val items = arrayListOf<Item>()

        items.add(Item(1,  "Лилия", "Идейные соображения высшего порядка, а также постоянный количественный рост и сфера нашей", "Цветок лилия", 100, "lily"))
        items.add(Item(2,  "Лилия", "Идейные соображения высшего порядка, а также постоянный количественный рост и сфера нашей", "Цветок лилия", 100, "lily2"))
        items.add(Item(3,  "Лилия", "Идейные соображения высшего порядка, а также постоянный количественный рост и сфера нашей", "Цветок лилия", 100, "lily3"))
    }
}