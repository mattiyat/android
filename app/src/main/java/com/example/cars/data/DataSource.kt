package com.example.cars.data

import com.example.cars.R
import com.example.cars.model.Cars

class DataSource {
    fun loadAffirmations(): List<Cars> {

        return listOf<Cars>(
            Cars(R.string.car1),
            Cars(R.string.car2),
            Cars(R.string.car3),
            Cars(R.string.car4),
        )
    }
}