package dk.tobias.layout.layoutchallenges

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

fun sortString(inputStr:String): String=
        inputStr.toCharArray().sorted().joinToString(",","[","]")

fun longestWord(inputStr: String): String{
    val words=inputStr.split(' ')
    var longest = 0
    var word = ""
    for (i in words) {
        if (longest < i.length) {
            longest = i.length
            word = i
        }
    }
    return "[$word]"
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var radio1=true
        radioGroup.setOnCheckedChangeListener { _, checkedId ->
            var text = getString(R.string.toastMsg)

            when(checkedId){
                R.id.radio1->{
                    text += resources.getString(R.string.alphabetic)
                    Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
                    radio1=true
                }
                else->{
                    text += resources.getString(R.string.longestWord)
                    Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
                    radio1=false
                }
            }
        }

        button.setOnClickListener {
            if (editText != null) {
                val str = editText.text.toString()
                if (str.isNotEmpty()) {

                    if (radio1) {
                        output.text = sortString(str)
                    }
                    if(!radio1){
                        output.text = longestWord(str)
                    }
                }
            }

        }}
}
