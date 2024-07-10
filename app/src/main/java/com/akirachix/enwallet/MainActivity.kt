package com.akirachix.enwallet

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.enwallet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvExpences.layoutManager = LinearLayoutManager(this)
        displayContacts()
    }

    fun displayContacts() {
        val expense1 = Expence("Anna", "KES 40000", "1 July 2024", "")
        val expense2 = Expence("Wendy", "KES 40000", "1 July 2024", "")
        val expense3 = Expence("Joan", "KES 40000", "1 July 2024", "")
        val expense4 = Expence("Eli", "KES 40000", "1 July 2024", "")
        val expense5 = Expence("Rob", "KES 40000", "1 July 2024", "")
        val expense6 = Expence("John", "KES 40000", "1 July 2024", "")
        val expense7 = Expence("Abel", "KES 40000", "1 July 2024", "")
        val expense8 = Expence("Troy", "KES 40000", "1 July 2024", "")
        val expense9 = Expence("Shan", "KES 40000", "1 July 2024", "")
        val expense10 = Expence("Eli", "KES 40000", "1 July 2024", "")
        val expense11 = Expence("Rob", "KES 40000", "1 July 2024", "")
        val expense12= Expence("John", "KES 40000", "1 July 2024", "")
        val expense13= Expence("Abel", "KES 40000", "1 July 2024", "")
        val expense14= Expence("Troy", "KES 40000", "1 July 2024", "")
        val expense15 = Expence("Shan", "KES 40000", "1 July 2024", "")


        val expenseList = listOf(expense1, expense2, expense3, expense4, expense5, expense6, expense7, expense8,expense9,expense10, expense11, expense13, expense14, expense15)
        val expencesAdapter = ExpencesAdapter(expenseList)
        binding.rvExpences.adapter = expencesAdapter
    }
}