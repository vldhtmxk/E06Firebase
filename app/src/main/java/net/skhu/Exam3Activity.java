package net.skhu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

    public class Exam3Activity extends AppCompatActivity {
        public static final int REQUEST_CREATE = 0;
        public static final int REQUEST_EDIT = 1;

        int memoIndex;
        Exam3Adapter exam3Adapter;
        ArrayList<Memo> arrayList;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_recycler_view3);

            arrayList = new ArrayList<Memo>();
            arrayList.add(new Memo("one"));
            arrayList.add(new Memo("two"));

            exam3Adapter = new Exam3Adapter(this, arrayList);
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView5);
            recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setItemAnimator(new DefaultItemAnimator());
            recyclerView.setAdapter(exam3Adapter);

            Button b = (Button) findViewById(R.id.btnAdd);
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View argO) {
                    EditText e = (EditText) findViewById(R.id.editText5);
                    String s = e.getText().toString();
                    e.setText("");
                    arrayList.add(new Memo(s));
                    exam3Adapter.notifyDataSetChanged();
                }
            });
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.mid_exam, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            int id = item.getItemId();
            if (id == R.id.action_add) {
                Intent intent = new Intent(this, MemoActivity.class);
                startActivity(intent);
                return true;
            }
            return super.onOptionsItemSelected(item);
        }

        @Override
        protected void onActivityResult(int requestcode, int resultCode, Intent data) {
            super.onActivityResult(requestcode, resultCode, data);
            if (resultCode == RESULT_OK) {
                Bundle bundle = data.getExtras();
                Memo memo = (Memo) bundle.getSerializable("MEMO");
                if (requestcode == REQUEST_CREATE)
                    arrayList.add(memo);
                else if (requestcode == REQUEST_EDIT)
                    arrayList.set(memoIndex, memo);
                exam3Adapter.notifyDataSetChanged();
            }
        }
    }

