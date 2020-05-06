package net.skhu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Exam3EditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam3_edit);

        final EditText editText_title = (EditText) findViewById(R.id.editText5);
        Memo memo = (Memo) getIntent().getSerializableExtra("MEMO");
        if (memo != null)
            editText_title.setText(memo.getTitle());

        Button button = (Button) findViewById(R.id.btnSave);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText_title = (EditText) findViewById(R.id.editText5);
                String title = editText_title.getText().toString();
                if (isEmptyOrWhiteSpace(title)) {
                    editText_title.setError("제목을 입력하세요");
                }
                Memo memo = new Memo(title);
                Intent intent = new Intent();
                intent.putExtra("MEMO", memo);
                setResult(RESULT_OK, intent);
                finish();
            }
        };
    }

    public  void  btnExam3_clicked(View view) {
        Intent intent = new Intent(this, Exam3Activity.class);
        startActivity(intent);
    }
    static boolean isEmptyOrWhiteSpace(String s) {
        if(s==null) return true;
        return s.toString().trim().length()==0;
    }
}
