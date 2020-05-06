package net.skhu;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Exam3Adapter extends RecyclerView.Adapter<Exam3Adapter.ViewHolder> {

    public Class ViewHolder extends RecyclerView.ViewHolder
             implements View.OnClickListener{
        TextView textView;

        public ViewHolder(View view) {
            super(view);
            textView = textView.findViewById(R.id.textView1);

        }
        public void setData() {
            Memo memo = arrayList.get(getAdapterPosition());
            textView.setText(memo.getTitle());
        }
        @Override
        public void onClick(View view) {
            int index = super.getAdapterPosition();
            RecyclerView3Activity activity = (RecyclerView3Activity) textView1.getContext();
            activity.memoIndex = index;
            Memo memo = arrayList.get(index);
            Intent intent = new Intent(activity, MemoActivity.class);
            intent.putExtra("MEMO",memo);
        }
    }

    LayoutInflater layoutInflater;
    ArrayList<Memo> arrayList;
    int checkedCount =0;

    public Exam3Adapter(Context context, ArrayList<Memo> arrayList) {
        this.layoutInflater = LayoutInflater.from(context);
        this.arrayList = arrayList;
    }



    @Override
    public int getItemCount() {
        return arrayList.size();
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = layoutInflater.inflate(R.layout.activity_memo, viewGroup, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, final  int index) {
        viewHolder.setData();
    }
}
