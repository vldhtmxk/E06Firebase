package com.example.e02view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.Button;

public class SpinnersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinners);

        String[] stringArray={"집주소","직장주소","기타"};
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,stringArray);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner spinner =(Spinner) findViewById(R.id.spinner_addressType);
        spinner.setAdapter(adapter);

        AdapterView.OnItemSelectedListener listener2 = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int index = spinner.getSelectedItemPosition();
                String text = spinner.getSelectedItem().toString();
                String s = String.format("주소!:%s(%d)", text, index);
                Toast.makeText(SpinnersActivity.this,s,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        };
        spinner.setOnItemSelectedListener(listener2);

        View.OnClickListener listener1 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Spinner spinner1 = (Spinner) findViewById(R.id.spinner_phoneType);
                int index1 =spinner1.getSelectedItemPosition();
                String text1 = spinner1.getSelectedItem().toString();


                int index2 = spinner.getSelectedItemPosition();
                String text2 = spinner.getSelectedItem().toString();

                String s = String.format("전화:%S(%d) 주소:%S(%d)", text1,index1,text2,index2);
                Toast.makeText(SpinnersActivity.this,s,Toast.LENGTH_SHORT).show();
            }

        };
        Button button = (Button) findViewById(R.id.btnSave);
    }
}
