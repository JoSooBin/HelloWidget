package jsb.hellowidget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class CalcActivity : AppCompatActivity() {

    lateinit var edit1 : EditText
    lateinit var edit2 : EditText
    lateinit var textResult : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        title = "간단 계산기"

        edit1 = findViewById(R.id.Edit1)
        edit2 = findViewById(R.id.Edit2)
        textResult = findViewById(R.id.textResult)
    }

    fun computeAdd(v : View){
        var result = edit1.text.toString().toInt() + edit2.text.toString().toInt()
        textResult.text = result.toString()
    }
    fun computeSub(v : View){
        var result = edit1.text.toString().toInt() - edit2.text.toString().toInt()
        textResult.text = result.toString()
    }
    fun computeMul(v : View){
        var result = edit1.text.toString().toInt() * edit2.text.toString().toInt()
        textResult.text = result.toString()
    }
    fun computeDiv(v : View){
        var result = edit1.text.toString().toInt() / edit2.text.toString().toInt()
        textResult.text = result.toString()
    }
}