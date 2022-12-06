package com.example.fachri08

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tombolAksi: Button = findViewById(R.id.buttonGanti)
        tombolAksi.setOnClickListener {
            ubahAngka()
        }


    }
    //fungsi ketika tombol di klik akan di panggil fungsi ini
    private fun ubahAngka(){

        //mengubah isi textbox
        val txtHello: TextView = findViewById(R.id.txt1)
        val image1: ImageView = findViewById(R.id.img1)
        isiGambar(txtHello,image1)

        val txtDadu2: TextView = findViewById(R.id.txt2)
        val image2: ImageView = findViewById(R.id.img2)
        isiGambar(txtDadu2,image2)


        val txtDadu3: TextView = findViewById(R.id.txt3)
        val image3: ImageView = findViewById(R.id.img3)
        isiGambar(txtDadu3,image3)

    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private fun isiGambar(txtHello: TextView, image1: ImageView){
        val tes = (1 until 6).random()
        txtHello.text = tes.toString()

        when (tes) {
            1 -> image1.setImageDrawable(getDrawable(R.drawable.img1))
            2 -> image1.setImageDrawable(getDrawable(R.drawable.img2))
            3 -> image1.setImageDrawable(getDrawable(R.drawable.img3))
            4 -> image1.setImageDrawable(getDrawable(R.drawable.img4))
            5 -> image1.setImageDrawable(getDrawable(R.drawable.img5))
            else -> { // Note the block
                image1.setImageDrawable(getDrawable(R.drawable.img6))
            }
        }


    }
    fun pindahPage(view: View){
        val intent = Intent(this, ListMovie::class.java).apply {
            // putExtra(, message)
        }
        startActivity(intent)
    }


}
