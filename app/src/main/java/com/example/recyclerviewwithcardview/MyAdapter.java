package com.example.recyclerviewwithcardview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    String[] title, disc;
    int[] flags;

    public MyAdapter(Context context, String[] title, String[] disc, int[] flags) {
        this.context = context;
        this.title = title;
        this.disc = disc;
        this.flags = flags;
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.sample_view,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {

        holder.title.setText(title[position]);
        holder.disc.setText(disc[position]);
        holder.flags.setImageResource(flags[position]);

    }

    @Override
    public int getItemCount() {
        return title.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title, disc;
        ImageView flags;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.countryNameId);
            disc = itemView.findViewById(R.id.countryDetailsId);
            flags = itemView.findViewById(R.id.imageViewId);



        }
    }
}
