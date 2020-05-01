package com.example.e02view;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.os.Bundle;
import android.widget.AdapterView;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.action_signup) {
            Toast.makeText(this,"회원가입 메뉴 클릭",Toast.LENGTH_SHORT).show();
            return true;
        } if(id == R.id.action_memo) {
            Intent intent = new Intent(this, MemoActivity.class);
            startActivity(intent);
            Toast.makeText(this,"메모장 메뉴 클릭",Toast.LENGTH_SHORT).show();
        } else if(id == R.id.action_buttons) {
            Intent intent = new Intent(this, ButtonActivity.class);
            startActivity(intent);
            return true;
        } else if(id == R.id.action_checkboxes) {
            Intent intent = new Intent(this, CheckboxesActivity.class);
            startActivity(intent);
            return true;
        } else if(id ==R.id.action_spinners) {
            Intent intent = new Intent(this, SpinnersActivity.class);
            startActivity(intent);
            return true;
        } else if(id ==R.id.action_alerts) {
            Intent intent = new Intent(this, AlertsActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}