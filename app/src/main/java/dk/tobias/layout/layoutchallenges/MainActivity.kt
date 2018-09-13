package dk.tobias.layout.layoutchallenges

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to button
        val btnclick= findViewById<Button>(R.id.button)
        val changedoutput= findViewById<TextView>(R.id.output)

        // set on-click listener
        btnclick.setOnClickListener{
            changedoutput.text = "hej"
        }
    }




}
