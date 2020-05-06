package net.skhu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

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
        if(id == R.id.action_signUp) {
            Intent intent=new Intent(this, SignUpActivity.class);
            startActivity(intent);
        }
        if(id == R.id.action_checkBox) {
            Intent intent =new Intent(this, CheckboxesActivity.class);
            startActivity(intent);
        }
        if(id == R.id.action_listView) {
            Intent intent = new Intent(this, TestActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
    public void btnRecyclerView1_clicked(View view) {
        Intent intent = new Intent(this, TestActivity.class);
        startActivity(intent);
    }
    public  void  btnRecyclerView2_clicked(View view) {
        Intent intent = new Intent(this, RecyclerView2Activity.class);
        startActivity(intent);
    }
    public  void  btnRecyclerView3_clicked(View view) {
        Intent intent = new Intent(this, RecyclerView3Activity.class);
        startActivity(intent);
    }
}
