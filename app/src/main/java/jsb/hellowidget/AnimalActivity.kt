package jsb.hellowidget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class AnimalActivity : AppCompatActivity() {

    //lateinit var Text1 : TextView
    lateinit var text2 :TextView
    lateinit var chkAgree: CheckBox
    lateinit var rGroup: RadioGroup
    lateinit var rdoDog: RadioButton
    lateinit var rdoCat : RadioButton
    lateinit var rdoRabbit : RadioButton

    lateinit var btnOk : Button
    lateinit var imgPet : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal)
        title = "애완동물 보기 앱"

        initvar()

        //체크박스 클릭시 이벤트 처리
        chkAgree.setOnCheckedChangeListener { compoundButton, b ->
            /*{
                text2.visibility = View.VISIBLE
                rGroup.visibility = View.VISIBLE
                btnOk.visibility = View.VISIBLE
                //imgPet.visibility = View.VISIBLE
            } else {
                text2.visibility = View.INVISIBLE
                rGroup.visibility = View.INVISIBLE
                btnOk.visibility = View.INVISIBLE
                imgPet.visibility =  View.INVISIBLE
            }*/
            var state = if(chkAgree.isChecked == true)
                View.VISIBLE else View.INVISIBLE

            text2.visibility = state
            rGroup.visibility = state
            btnOk.visibility = state
            imgPet.visibility = state
        }
    }
    fun initvar(){ //변수 초기화하는 함수
        text2 = findViewById(R.id.Text2)
        chkAgree = findViewById(R.id.Chkagree)
        rGroup = findViewById(R.id.Rgroup)
        rdoDog = findViewById(R.id.RdoDog)
        rdoCat = findViewById(R.id.RdoCat)
        rdoRabbit = findViewById(R.id.RdoRabbit)
        btnOk = findViewById(R.id.BtnOK)
        imgPet = findViewById(R.id.ImgPet)
    }

    //ImageView에 그림을 표시하려면 먼저, res -> drawable에 그림파일을 업로드하고 그림파일 호출시 'R.drawble.그림파일명'으로 지정하면됨
    //라디오버튼 그룹내 특정 라디오버튼이 클릭된것을 알아내려면 라디오 버튼 그룹명 .checkedRadioButtonId'을 사용하면 됨
    fun showAnimal(v:View){ //버튼 클릭시 선택적 이미지 표시
        imgPet.visibility = android.view.View.VISIBLE

        when(rGroup.checkedRadioButtonId){
            R.id.RdoDog -> imgPet.setImageResource(R.drawable.dog)
            R.id.RdoCat -> imgPet.setImageResource(R.drawable.cat)
            R.id.RdoRabbit -> imgPet.setImageResource(R.drawable.rabbit)
        }
    }
}