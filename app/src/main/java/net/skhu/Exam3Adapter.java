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

     class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView textView;

        public ViewHolder(View view) {
            super(view);
            textView = view.findViewById(R.id.textView1);

        }
        public void setData() {
            Memo memo = arrayList.get(getAdapterPosition());
            textView.setText(memo.getTitle());
        }
        @Override
        public void onClick(View view) {
            int index = super.getAdapterPosition();
            Exam3Activity activity = (Exam3Activity) textView.getContext();
            activity.memoIndex = index;
            Memo memo = arrayList.get(index);
            Intent intent = new Intent(activity, Exam3EditActivity.class);
            intent.putExtra("MEMO",memo);
            activity.startActivity(intent);
        }
    }

    LayoutInflater layoutInflater;
    ArrayList<Memo> arrayList;

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
        View view = layoutInflater.inflate(R.layout.activity_exam3_edit, viewGroup, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, final  int index) {
        viewHolder.setData();
    }
}
