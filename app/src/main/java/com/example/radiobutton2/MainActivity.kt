package com.example.radiobutton2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // all of them view find view by id...

         var radiogp = findViewById<RadioGroup>(R.id.radioGroup_id);

         var  male = findViewById<RadioButton>(R.id.male_id);
         var female = findViewById<RadioButton>(R.id.feamale_id);

        var subButton = findViewById<Button>(R.id.submitButton_id);
        var showText = findViewById<TextView>(R.id.textView_id);

        // button call to  onClickListner(), then selected to method Male , or Female show the textview.
        // user selected a button and show the result...

        // this is button and call to setOnClickListner();


        /*
   1. first user kon buton ta selectkorse seta amake bujte hobe. erpor button er moddhe
       j text ta ache seta amara show korbo.
   2. user j button ta select korse seta paoar utso holo radio group a , radio group
       a duita button ache female and male.
   3. radioGroup a kon button select hoyese seta amake bujhte hobe.

       ##important....@@
       e jonno use korbo
       radioGroup.getCheckRadioButtonId() - ei method er kaj hole radioButton ta select
       kora hoyese sei id ta niye ashbo and sei id ta akta selectedId variable er moddhe reke dibo.

         ## important..@@
          akon kaj holo radioButton id ta find kora. RadioButton genderButton();

          radio group theke j button ta select kora hoyece tar id ta niye ashlam .
          ebar ei id er madhome take find korbo se kon radio button & take rakhbo amara
          gender button er moddhe .

          genderButton = findVieById(selectedId)
          pass korbo amder selectedId take..

       4. akon gender button a radio Button chole ashse. ebar gender button a ki text ache
        ta amara kivbae pabo.
         genderButton.getText.toString(); and variable er moddhe rakhbo.

         ei variable ta text view a set kore dibo..

               */

        subButton.setOnClickListener {


            var selectedId =  radiogp.checkedRadioButtonId
            var gender = findViewById<RadioButton>(selectedId)
            var value = gender.text.toString();

            showText.setText("You have selected to  "+value)

        }





    }
}
