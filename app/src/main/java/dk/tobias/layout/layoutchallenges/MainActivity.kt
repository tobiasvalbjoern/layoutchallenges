package dk.tobias.layout.layoutchallenges

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

fun sortString(inputStr:String): String{

    val arr=inputStr.toCharArray()
    arr.sort()
    return "["+arr.joinToString("")+"]"
}

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get references
        val btnClick= findViewById<Button>(R.id.button)
        val altOut= findViewById<TextView>(R.id.output)
        val input= findViewById<EditText>(R.id.editText)
        // set on-click listener
        btnClick.setOnClickListener{
            if (input != null) {
                val str=input.text.toString()
                if(str.isNotEmpty()){
                altOut.text = sortString(str)}
            }





        }
    }




}
