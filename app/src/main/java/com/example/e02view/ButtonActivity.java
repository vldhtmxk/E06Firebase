package com.example.e02view;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.os.Bundle;

public class ButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg;
                int buttonId = view.getId();
                switch(buttonId) {
                    case R.id.button1: msg = "1번째 버튼이 클릭 되었습니다."; break;
                    case R.id.button2: msg = "2번째 버튼이 클릭 되었습니다."; break;
                    case R.id.button3: msg = "3번째 버튼이 클릭 되었습니다."; break;
                    case R.id.imageButton1: msg = "1번째 이미지 버튼이 클릭 되었습니다."; break;
                    case R.id.imageButton2: msg = "2번째 이미지 버튼이 클릭 되었습니다."; break;
                    case R.id.imageButton3: msg = "3번째 이미지 버튼이 클릭 되었습니다."; break;
                    case R.id.imageButton4: msg = "4번째 이미지 버튼이 클릭 되었습니다."; break;

                }
            }
        };
    }
}
