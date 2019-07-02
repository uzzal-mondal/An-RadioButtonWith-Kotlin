# An-RadioButtonWith-Kotlin

                Radio Button


   Important method
    # getCheckedRadioButton()- 
this method work, RadioGroup are the selected the button get the radioButton id. 

ei method er kaj hole radioButton ta select
kora hoyese sei id ta niye ashbo and sei id ta akta selectedId variable er moddhe reke dibo.


   # genderButton.getText.toString()- 
gnder button working within getText and covert to string from toString() – method.

1.	Checkbox selected to Multiple item, but radioButton selected a Single Item. That is main different to RadioButton and CheckBox. 

2.	Today working this project , create a RadioGroup including RadioButton with Click to Button and showText RadioButton name however select Male or Female.

3.	All of them view are creating findviewById.

4.	First understand that , which the button selected to user then within textview to show result.

5.	User selected to Button ,  this is Button are storage in RadioGroup. That’s for we are using to RadioGroup.

6.	radiogp object to call this method getCheckedRadioButton() – this method work, RadioGroup are the selected the button get the radioButton id. Or   Radiogroup er j radio button ta select kora hoyese tar id ta se niye ashbe.

7.	This necessary to radioButton declare to variable. 

8.	Firstly radioGroup theke j button ta select kora holo tar id ta niye ashlam.

9.	And ei id er maddhome take find korbo j se kon radio butoon and take rakhabo amara genderButton

10.	J id ta amra click korbo tar id ta amra already peye gisi e jonno amra selectedId variable ta pass korbo. 

11.	Finaly – which the selected to  RadioGroup Button come to selectedId.

12.	  RadioGroup er j button ta select kora hobe sathe sathe tar id ta selectedId er moddhe chole ashbe.

13.	 Helping by selectedId with take a findViewById and storage to gender Button. 

14.	, genderButton get to Text use to getText with toString method. genderButton.getText.toString(),. Method    


15.	Then get to raidoButton, and set to the textview within this is get for the result.





#codding

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


