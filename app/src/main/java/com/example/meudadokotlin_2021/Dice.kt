package com.example.meudadokotlin_2021

import android.util.Log
import kotlin.random.Random

data class Dice (val numFaces:Int){
    var number:Int = 1
        set(value) {
            if ((value <=numFaces)&&(value >=1)){
                field=value
            }else
            {
                Log.v("pdm","Tentaram alterar um valor fora do range")
            }
        }

    fun rollDice():Int {
        this.number = Random.nextInt(this.numFaces)+ 1
        return this.number
    }
}