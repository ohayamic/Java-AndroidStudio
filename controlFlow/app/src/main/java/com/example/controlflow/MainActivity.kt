package com.example.controlflow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Control Flow using the range function
        //
        var getPrime: ArrayList<Int> = arrayListOf<Int>()
        var isPrime: ArrayList<Int> = arrayListOf<Int>()

        for (count in 1 .. 100){
            if(count % 3 == 0){
                println("Fizz $count")
            }else if (count % 5 == 0){
                println("Buzz $count")
            }
            if (count % 3 == 0 && count % 5 == 0){
                println("FizzBuzz $count")
            }
            if(count % 2 == 1){
                getPrime.add(count)
                for(num in getPrime){
                    var flag: Boolean = false
                    for(i in 2..num / 2){
                        if(num % i == 0){
                            flag = true
                            break
                        }
                    }
                    if (!flag){
                        println("$num are prime numbers")

                    }

                }

            }


        }
    }
}