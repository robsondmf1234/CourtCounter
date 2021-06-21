package com.example.courtcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main_linear.*

class MainActivity : AppCompatActivity() {
    var pontosTeamA = 0
    var pontosTeamB = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_linear)
    }

    fun threePointsA(view: View) {
        pontosTeamA = pontosTeamA + 3
        displayPontosTeamA(pontosTeamA)
    }


    fun twoPointsA(view: View) {
        pontosTeamA += 2
        displayPontosTeamA(pontosTeamA)
    }

    fun onePointA(view: View) {
        pontosTeamA += 1
        displayPontosTeamA(pontosTeamA)
    }

    fun threePointsB(view: View) {
        pontosTeamB += 3
        displayPontosTeamB(pontosTeamB)
    }

    fun twoPointsB(view: View) {
        pontosTeamB += 2
        displayPontosTeamB(pontosTeamB)
    }

    fun onePointB(view: View) {
        pontosTeamB += 1
        displayPontosTeamB(pontosTeamB)
    }


    private fun displayPontosTeamA(pontosTeamA: Int) {
        val textPoints = text_point_team_a
        textPoints.setText(pontosTeamA.toString())
    }


    private fun displayPontosTeamB(pontosTeamB: Int) {
        text_point_team_b.setText(pontosTeamB.toString())
    }

    fun reset(view: View) {
        pontosTeamA = 0
        pontosTeamB = 0
        displayPontosTeamA(pontosTeamA)
        displayPontosTeamB(pontosTeamB)
    }

}