package com.example.assignment61

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textView1:TextView = findViewById(R.id.textView1)
        var textView2:TextView = findViewById(R.id.textView7)
        var numberone:EditText=findViewById(R.id.numberone)
        var numbertwo:EditText=findViewById(R.id.numbertwo)

        var btnplus:Button =findViewById(R.id.plus)
        var btnmult:Button =findViewById(R.id.multply)
        var btnminus:Button=findViewById(R.id.minus)
        var btnvidider:Button=findViewById(R.id.divider)
        var btnmodulo:Button=findViewById(R.id.modulo)
        var btnclear:Button=findViewById(R.id.clear)
        //การบวก
        btnplus.setOnClickListener() {
            var num1 = numberone.text.toString()
            var num2 = numbertwo.text.toString()
            var total = 0.00
            if(num1 == ""  || num2 == ""){
                val toast = Toast.makeText(applicationContext, "กรุณาใส่ทั้งnumber1 และ Number2", Toast.LENGTH_LONG)
                toast.show()
            }
            else{
                total = num1.toString().toDouble() + num2.toString().toDouble()
                textView1.setText("+")
                textView2.setText(total.toString())

            }
        }

        //การลบ
        btnminus.setOnClickListener(){
            var num1 = numberone.text.toString()
            var num2 = numbertwo.text.toString()
            var total = 0.000
            if(num1 == ""  || num2 == ""){
                val toast = Toast.makeText(applicationContext, "กรุณาใส่ทั้งnumber1 และ Number2", Toast.LENGTH_LONG)
                toast.show()
            }
            else{
                total = num1.toString().toDouble() - num2.toString().toDouble()
                textView1.setText("-")
                textView2.setText(total.toString())

            }
        }

        //การคูณ
        btnmult.setOnClickListener(){
            var num1 = numberone.text.toString()
            var num2 = numbertwo.text.toString()
            var total = 0.000
            if(num1 == ""  || num2 == ""){
                val toast = Toast.makeText(applicationContext, "กรุณาใส่ทั้งnumber1 และ Number2", Toast.LENGTH_LONG)
                toast.show()
            }
            else{
                total = num1.toString().toDouble() * num2.toString().toDouble()
                textView1.setText("*")
                textView2.setText(total.toString())

            }
        }

        //การหาร
        btnvidider.setOnClickListener(){
            var num1 = numberone.text.toString()
            var num2 = numbertwo.text.toString()
            var total = 0.000
            if(num1 == ""  || num2 == ""){
                val toast = Toast.makeText(applicationContext, "กรุณาใส่ทั้งnumber1 และ Number2", Toast.LENGTH_LONG)
                toast.show()
            }
            else{
                total = num1.toString().toDouble() / num2.toString().toDouble()
                textView1.setText("/")
                textView2.setText(total.toString())

            }
        }

        //การมอด
        btnmodulo.setOnClickListener(){
            var num1 = numberone.text.toString()
            var num2 = numbertwo.text.toString()
            var total = 0.000
            if(num1 == ""  || num2 == ""){
                val toast = Toast.makeText(applicationContext, "กรุณาใส่ทั้งnumber1 และ Number2", Toast.LENGTH_LONG)
                toast.show()
            }
            else if(num2=="0") {
                val toast1 =
                    Toast.makeText(applicationContext, "ห้ามกรอกค่า number2 = 0", Toast.LENGTH_LONG)
                toast1.show()
            }
            else{
                total = num1.toString().toDouble() % num2.toString().toDouble()
                textView1.setText("%")
                textView2.setText(total.toString())
            }
        }
        btnclear.setOnClickListener(){
            numberone.setText("")
            numbertwo.setText("")
            textView1.setText("")
            textView2.setText("")
        }
    }
}