package com.example.petagramfinal

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListaMascotasFragment : Fragment(R.layout.fragment_lista_mascotas) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mascotas = arrayListOf(
            Mascota("Catty", R.drawable.dog_1, 5),
            Mascota("Ronny", R.drawable.dog_2, 3),
            Mascota("Luna", R.drawable.dog_3, 4),
            Mascota("Rocky", R.drawable.dog_4, 2),
            Mascota("Coco", R.drawable.dog_5, 1)
        )

        val lista = view.findViewById<RecyclerView>(R.id.rvMascotas)
        lista.layoutManager = LinearLayoutManager(requireContext())
        lista.adapter = MascotaAdaptador(mascotas)
    }
}
