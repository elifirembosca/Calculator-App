package com.example.hesapmakinesi

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var ilkSayi:String =""
    var islem:String = ""
    var yeniIslem:Boolean=true

    fun butonSecimi(view: View) {
        if (yeniIslem){
            textSonuc.setText("")
        }
        var secilenButon = view as Button
        var butonDegeri:String = textSonuc.text.toString()
        when(secilenButon){
            button0->{
                butonDegeri+="0"
            }
            button1->{
                butonDegeri+="1"
            }
            button2->{
                butonDegeri+="2"
            }
            button3->{
                butonDegeri+="3"
            }
            button4->{
                butonDegeri+="4"
            }
            button5->{
                butonDegeri+="5"
            }
            button6->{
                butonDegeri+="6"
            }
            button7->{
                butonDegeri+="7"
            }
            button8->{
                butonDegeri+="8"
            }
            button9->{
                butonDegeri+="9"
            }
        }
        yeniIslem=false
        textSonuc.setText(butonDegeri)
    }


    fun DortIslem(view: View) {
        var butonIslem= view as Button
        when(butonIslem){
            buttonArti -> {
                islem = "+"
            }
            buttonCarpi->{
                islem="*"
            }
            buttonEksi->{
                islem="-"
            }
            buttonBolu->{
                islem="/"
            }
        }
        ilkSayi=textSonuc.text.toString()
        yeniIslem=true
    }


    fun Esittir(view: View) {
        var sonuc:Double?=null
        var ikinciSayi=textSonuc.text.toString()
        when(islem){
            "/"->{
                sonuc=ilkSayi.toDouble()/ikinciSayi.toDouble()
            }
            "*"->{
                sonuc=ilkSayi.toDouble()*ikinciSayi.toDouble()
            }
            "-"->{
                sonuc=ilkSayi.toDouble()-ikinciSayi.toDouble()

            }
            "+"->{
                sonuc=ilkSayi.toDouble()+ikinciSayi.toDouble()
            }
        }
        textSonuc.setText(sonuc.toString())
        yeniIslem=true

    }

    fun Ac(view: View) {
        textSonuc.setText("0")
        yeniIslem=true
    }

}