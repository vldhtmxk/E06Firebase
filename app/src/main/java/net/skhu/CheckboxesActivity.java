package net.skhu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class CheckboxesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkboxes);

        CompoundButton.OnCheckedChangeListener listener1 = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String s = String.format("%s : %b",buttonView.getText(),isChecked);
                Toast.makeText(CheckboxesActivity.this,s,Toast.LENGTH_SHORT).show();
            }
        };
        final CheckBox checkBox1 = (CheckBox) findViewById(R.id.chceckBox1);
        final Switch switch1 = (Switch) findViewById(R.id.switch1);
        checkBox1.setOnCheckedChangeListener(listener1);
        switch1.setOnCheckedChangeListener(listener1);

        RadioGroup.OnCheckedChangeListener listener2 = new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = (RadioButton) findViewById(checkedId);
                String s = radioButton.getText().toString();
                Toast.makeText(CheckboxesActivity.this,s,Toast.LENGTH_SHORT).show();
            }
        };
        final RadioGroup radioGroup1 = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup1.setOnCheckedChangeListener(listener2);

        RadioGroup.OnCheckedChangeListener listener3 = new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int drawbleId = 0;
                switch ( checkedId) {
                    case R.id.btnCat:drawbleId = R.drawable.animal_cat_large;break;
                    case R.id.btnDog: drawbleId = R.drawable.animal_dog_large;break;
                    case R.id.btnOwl: drawbleId= R.drawable.animal_owl_large;break;
                }
                ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
                imageView1.setImageResource(drawbleId);
            }
        };
        final RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.radioGroup2);
        radioGroup2.setOnCheckedChangeListener(listener3);



        Button button = (Button) findViewById(R.id.btnSave);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = "자동로그인?:";
                if(checkBox1.isChecked() == true)
                    s+=" On";
                else
                    s+=" Off";
                s += "자동로그인" + switch1.isChecked() +" ";
                s += "캐릭터이름 :";
                switch (radioGroup1.getCheckedRadioButtonId()) {
                    case R.id.radioButton1: s +="빨간"; break;
                    case R.id.radioButton2: s +="노란"; break;
                    case R.id.radioButton3: s += "파란"; break;
                }
                switch (radioGroup2.getCheckedRadioButtonId()) {
                    case R.id.btnCat: s +="고양이"; break;
                    case R.id.btnDog: s +="강아지"; break;
                    case R.id.btnOwl: s += "부엉이"; break;
                }
                Toast.makeText(CheckboxesActivity.this,s,Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void btnSave_onClicked(View button) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(R.string.saveSuccess);
        builder.setNeutralButton(R.string.close, null);
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
