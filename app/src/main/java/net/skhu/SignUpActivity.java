package net.skhu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Button button = (Button)findViewById(R.id.btnSignUp);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText_loginId = (EditText)findViewById(R.id.editText_id);
                String loginId = editText_loginId.getText().toString();
                if(isEmptyOrWhiteSpace(loginId))
                    editText_loginId.setError("로그인 아이디를 입력하세요");

                EditText editText_password=(EditText)findViewById(R.id.editText_password);
                String password = editText_password.getText().toString();
                if(isEmptyOrWhiteSpace(password))
                    editText_loginId.setError("비밀번호를 입력하세요");

                String msg="회원가입 성공 :" + loginId+" "+password;
                Toast.makeText(SignUpActivity.this,msg,Toast.LENGTH_LONG).show();

            }
        };
        button.setOnClickListener(listener);

    }
    static boolean isEmptyOrWhiteSpace(String s) {
        if (s == null)
            return true;
        return s.trim().length() == 0;
    }
}
