package net.skhu;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Exam3Adapter extends RecyclerView.Adapter<Exam3Adapter.ViewHolder>
        implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    Class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        public ViewHolder(View view) {
            super(view);
            textView = textView.findViewById(R.id.textView1);

        }
        public void setData() {
            Memo memo = arrayList.get(getAdapterPosition());
            textView.setText(memo.getTitle());
        }
    }

    @Override
    public Exam3Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull Exam3Adapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
