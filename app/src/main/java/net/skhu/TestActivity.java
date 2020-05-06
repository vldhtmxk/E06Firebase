package net.skhu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class TestActivity extends AppCompatActivity {
    ArrayList<String> arrayList;
    RecyclerView1Adapter recyclerView1Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        arrayList = new ArrayList<String>();
        arrayList.add("유림이");
        arrayList.add("멍충이");
        recyclerView1Adapter = new RecyclerView1Adapter(this, arrayList);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerView1Adapter);


        Button b = (Button)findViewById(R.id.btnAdd);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View argO) {
                EditText e = (EditText) findViewById(R.id.editText1);
                CharSequence s = e.getText();
                e.setText("");
                arrayList.add(s.toString());
                recyclerView1Adapter.notifyDataSetChanged();
            }
        });
    }


}
