package net.skhu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Date;

import static net.skhu.SignUpActivity.isEmptyOrWhiteSpace;

public class MemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memo);

        Button button = (Button)findViewById(R.id.btnSave);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText_title = (EditText)findViewById(R.id.editText_title);
                String title = editText_title.getText().toString();
                if(isEmptyOrWhiteSpace(title)){
                    editText_title.setError("제목을 입력하세요");
                }
                EditText editText_content= (EditText)findViewById(R.id.editText_content);
                String body = editText_content.getText().toString();
                if(isEmptyOrWhiteSpace(body)){
                    editText_title.setError("내용을 입력하세요");
                }
                Memo memo = new Memo(title, body,new Date());
                Intent intent = new Intent();
                intent.putExtra("MEMO",memo);
                setResult(RESULT_OK, intent);
                finish();
            }
        };
    }
}
