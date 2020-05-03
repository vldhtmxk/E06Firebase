package net.skhu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnListView_clicked(View view) {
        Intent intent = new Intent(this, ListViewActivity.class);
        startActivity(intent);
    }
    public void btnRecyCleView1_clicked(View view) {
        Intent intent = new Intent(this, RecyclerView1Activity.class);
        startActivity(intent);
    }
    public void btnRecyCleView2_clicked(View view) {
        Intent intent = new Intent(this, RecyclerView2Activity.class);
        startActivity(intent);
    }
    public void btnRecyCleView3_clicked(View view) {
        Intent intent = new Intent(this, RecyclerView3Activity.class);
        startActivity(intent);
    }
}
