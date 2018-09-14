package dk.tobias.layout.layoutchallenges

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*


fun sortString(inputStr:String): String{

    val arr=inputStr.toCharArray()
    arr.sort()
    return "["+arr.joinToString("")+"]"
}



/*
fun onRadioButtonClicked(view: View) {
    // Is the button now checked?
    val checked = (view as RadioButton).isChecked

    // Check which radio button was clicked
    when (view.getId()) {
        R.id.radio1 -> {
            if (checked)
            //Radio 1 chosen
                println("Radio 1 chosen")
        }
        R.id.radio2 -> {
            if (checked)
            //Radio 2 chosen
                println("Radio 2 chosen")
        }

    }
}
*/

class MainActivity : AppCompatActivity() {
    enum class RadioState {
        UNSET,RADIO1, RADIO2
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val radioGroupClick=findViewById<RadioGroup>(R.id.radioGroup)
        //onRadioButtonClicked(radioGroupClick)
        var radioFlag = RadioState.UNSET

        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        radioGroup?.setOnCheckedChangeListener { _, checkedId ->
            var text = "You selected: "
            if (R.id.radio1 == checkedId){
                text += resources.getString(R.string.challenge1)
                Toast.makeText(applicationContext, text, Toast.LENGTH_SHORT).show()
                //flagRadio1=true
                //flagRadio2=false
                radioFlag=RadioState.RADIO1
            }

            else {
                text += resources.getString(R.string.challenge2)
                Toast.makeText(applicationContext, text, Toast.LENGTH_SHORT).show()
                //flagRadio2=true
                //flagRadio1=false
                radioFlag=RadioState.RADIO2
            }
        }

        // get references
        val btnClick= findViewById<Button>(R.id.button)
        val altOut= findViewById<TextView>(R.id.output)
        val input= findViewById<EditText>(R.id.editText)
        // set on-click listener
        btnClick.setOnClickListener {
            if (input != null) {
                val str = input.text.toString()
                if (str.isNotEmpty()) {

                    if (radioFlag==RadioState.RADIO1) {
                        altOut.text = sortString(str)
                    }
                    if(radioFlag==RadioState.RADIO2){
                        altOut.text = "hej"
                    }
                }
            }

        }}


}
