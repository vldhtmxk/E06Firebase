package net.skhu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Exam3EditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam3_edit);
    }

    public  void  btnExam3_clicked(View view) {
        Intent intent = new Intent(this, Exam3Activity.class);
        startActivity(intent);
    }
}
