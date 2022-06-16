package dev.amekwi.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var etfirstnumber: TextInputEditText
    lateinit var tilfirstnumber: TextInputLayout
    lateinit var etsecondnumber: TextInputEditText
    lateinit var tilsecondnumber: TextInputLayout
    lateinit var btnadd: Button
    lateinit var btnsubtract: Button
    lateinit var btnmultiply: Button
    lateinit var btnmodulus: Button
    lateinit var tvanswer: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnadd = findViewById(R.id.btnadd)
        btnsubtract = findViewById(R.id.btnsubtract)
        btnmultiply = findViewById(R.id.btnmultiply)
        btnmodulus = findViewById(R.id.btnmodulus)
        etfirstnumber = findViewById(R.id.etfirstnumber)
        etsecondnumber = findViewById(R.id.etsecondnumber)
        tilfirstnumber = findViewById(R.id.tilfirstnumber)
        tilsecondnumber = findViewById(R.id.tilsecondnumber)
        tvanswer = findViewById(R.id.tvanswer)

        btnmodulus.setOnClickListener {
            val number = etfirstnumber.text.toString()
            val numberDecimal = etsecondnumber.text.toString()
            if (number.isBlank()) {
                etfirstnumber.error = "Number is required"
                return@setOnClickListener
            }
            if (numberDecimal.isBlank()) {
                etsecondnumber.error = "NumberDecimal is required"
                return@setOnClickListener
            }
//            modulus(number.toInt(), numberDecimal.toInt())
        }
        btnmultiply.setOnClickListener {
            var num1 = etfirstnumber.text.toString().toDouble()
            var num2 = etsecondnumber.text.toString().toDouble()
            multiply(num1, num2)

        }

        btnsubtract.setOnClickListener {
            var num5 = etfirstnumber.text.toString().toDouble()
            var num6 = etsecondnumber.text.toString().toDouble()
            btnsubtract(num5, num6)
        }
        btnmodulus.setOnClickListener {
            var num0 = etfirstnumber.text.toString().toDouble()
            var num9 = etsecondnumber.text.toString().toDouble()
            modulus(num0, num9)
        }
        btnadd.setOnClickListener {
            var numh = etfirstnumber.text.toString().toDouble()
            var numi = etsecondnumber.text.toString().toDouble()
            add(numh, numi)

        }

        fun modulus(num0: Double, num9: Double) {
            var modulus = num0 % num9
            tvanswer.text = modulus.toString()

        }

//        fun multiply(num1: Double, num2: Double) {
//            var multiply = num1 * num2
//            tvanswer.text = multiply.toString()
//        }


//        fun add(numh: Double, numi: Double) {
//            var add = numh + numi
//            tvanswer.text = add.toString()
//        }


//        fun subtract(num5: Double, num6: Double) {
//            var subtract = num5 - num6
//            tvanswer.text = subtract.toString()

//        }
    }

     fun btnsubtract(num5: Double, num6: Double) {
         var subtract =num5-num6
         tvanswer.text=subtract.toString()

    }

     fun add(numh: Double, numi: Double) {
         var add= numh + numi
         tvanswer.text=add.toString()

    }

    fun modulus(num0: Double, num9: Double) {
        var modulus=num0%num9
        tvanswer.text=modulus.toString()

    }

     fun multiply(num1: Double, num2: Double) {
        var multiply=num1*num2
        tvanswer.text=multiply.toString()

    }
}




