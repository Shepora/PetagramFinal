package com.example.petagramfinal

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MascotasFavoritasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_favoritas)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val barras = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(barras.left, barras.top, barras.right, barras.bottom)
            insets
        }

        setSupportActionBar(findViewById<Toolbar>(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val favoritas = arrayListOf(
            Mascota("Ronny", R.drawable.dog_2, 3),
            Mascota("Catty", R.drawable.dog_1, 5),
            Mascota("Luna", R.drawable.dog_3, 4),
            Mascota("Rocky", R.drawable.dog_4, 2),
            Mascota("Coco", R.drawable.dog_5, 1)
        )

        val lista = findViewById<RecyclerView>(R.id.rvFavoritas)
        lista.layoutManager = LinearLayoutManager(this)
        lista.adapter = MascotaAdaptador(favoritas)
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}
