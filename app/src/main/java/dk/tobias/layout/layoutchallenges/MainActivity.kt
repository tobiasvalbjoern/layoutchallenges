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
        val btnclick= findViewById<Button>(R.id.button)
        val changedoutput= findViewById<TextView>(R.id.output)
        val input= findViewById<EditText>(R.id.editText)
        // set on-click listener
        btnclick.setOnClickListener{
            if (input != null) {
                val str=input.text.toString()
                if(str.isNotEmpty()){
                changedoutput.text = sortString(str)}
            }





        }
    }




}
