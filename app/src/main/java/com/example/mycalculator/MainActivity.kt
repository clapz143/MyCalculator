package com.example.mycalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.example.mycalculator.R

class MainActivity : AppCompatActivity() {

    private var staticInt : Int = 0
    var staticString : String = ""

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun add() {
            val A = findViewById<Button>(R.id.A)
            A.setOnClickListener {
                staticString += "a"
                Toast.makeText(applicationContext, "$staticString", Toast.LENGTH_SHORT).show()
            }

            val B = findViewById<Button>(R.id.B)
            B.setOnClickListener {
                staticString += "b"
                Toast.makeText(applicationContext, "$staticString", Toast.LENGTH_SHORT).show()
            }

            val C = findViewById<Button>(R.id.C)
            C.setOnClickListener {
                staticString += "c"
                Toast.makeText(applicationContext, "$staticString", Toast.LENGTH_SHORT).show()
            }

            val n1 = findViewById<Button>(R.id.n1)
            n1.setOnClickListener {
                staticInt += 1;
                Toast.makeText(applicationContext, "The Result will be $staticInt", Toast.LENGTH_SHORT).show()
            }

            val n2 = findViewById<Button>(R.id.n2)
            n2.setOnClickListener {
                staticInt += 2
                Toast.makeText(applicationContext, "The Result will be $staticInt", Toast.LENGTH_SHORT).show()
            }

            val n3 = findViewById<Button>(R.id.n3)
            n3.setOnClickListener {
                staticInt += 3
                Toast.makeText(applicationContext, "The Result will be $staticInt", Toast.LENGTH_SHORT).show()
            }
        }

        fun subtract () {

            val A = findViewById<Button>(R.id.A)
            A.setOnClickListener {
                staticString = staticString.dropLast(1)
                if (staticString == "")
                {
                    Toast.makeText(applicationContext, "Not Available!", Toast.LENGTH_SHORT).show()
                    staticInt = 0;
                }
                else
                {
                    Toast.makeText(applicationContext, "$staticString", Toast.LENGTH_SHORT).show()
                }

            }

            val B = findViewById<Button>(R.id.B)
            B.setOnClickListener {
                staticString = staticString.dropLast(1)
                if (staticString == "")
                {
                    Toast.makeText(applicationContext, "Not Available!", Toast.LENGTH_SHORT).show()
                    staticInt = 0;
                }
                else
                {
                    Toast.makeText(applicationContext, "$staticString", Toast.LENGTH_SHORT).show()
                }
            }

            val C = findViewById<Button>(R.id.C)
            C.setOnClickListener {
                staticString = staticString.dropLast(1)
                if (staticString == "")
                {
                    Toast.makeText(applicationContext, "Not Available!", Toast.LENGTH_SHORT).show()
                    staticInt = 0;
                }
                else
                {
                    Toast.makeText(applicationContext, "$staticString", Toast.LENGTH_SHORT).show()
                }
            }

            val n1 = findViewById<Button>(R.id.n1)
            n1.setOnClickListener {
                staticInt -= 1
                if (staticInt < 0)
                {
                    Toast.makeText(applicationContext, "The number equals negative in value", Toast.LENGTH_SHORT).show()
                    staticInt = 0;
                }
                else if (staticInt >= 0)
                {
                    Toast.makeText(applicationContext, "The Result will be $staticInt", Toast.LENGTH_SHORT).show()
                }
            }

            val n2 = findViewById<Button>(R.id.n2)
            n2.setOnClickListener {
                staticInt -= 2
                if (staticInt < 0)
                {
                    Toast.makeText(applicationContext, "The number equals negative in value", Toast.LENGTH_SHORT).show()
                    staticInt = 0;
                }
                else if (staticInt >= 0)
                {
                    Toast.makeText(applicationContext, "The Result will be $staticInt", Toast.LENGTH_SHORT).show()
                }
            }

            val n3 = findViewById<Button>(R.id.n3)
            n3.setOnClickListener {
                staticInt -= 3
                if (staticInt < 0)
                {
                    Toast.makeText(applicationContext, "The number equals negative in value", Toast.LENGTH_SHORT).show()
                    staticInt = 0;
                }
                else if (staticInt >= 0)
                {
                    Toast.makeText(applicationContext, "The Result will be $staticInt", Toast.LENGTH_SHORT).show()
                }
            }
        }
        val Add = findViewById<Button>(R.id.addnum)
        Add.setOnClickListener {
            add()
        }

        val Sub = findViewById<Button>(R.id.subnum)
        Sub.setOnClickListener {
            subtract()
        }
    }
}