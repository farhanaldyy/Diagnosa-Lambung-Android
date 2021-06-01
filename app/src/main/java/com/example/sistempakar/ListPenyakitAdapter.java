package com.example.sistempakar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListPenyakitAdapter extends RecyclerView.Adapter<ListPenyakitAdapter.ListViewHolder> {
    private ArrayList<Penyakit> listPeyakit;
    public ListPenyakitAdapter(ArrayList<Penyakit> list) {
        this.listPeyakit = list;
    }

    @NonNull
    @Override
    public ListPenyakitAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.desain_layout_adapter, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListPenyakitAdapter.ListViewHolder holder, int position) {
        Penyakit penyakit = listPeyakit.get(position);
        Glide.with(holder.itemView.getContext())
                .load(penyakit.getFoto())
                .apply(new RequestOptions().override(90, 90))
                .into(holder.image_item);
        holder.tv_name.setText(penyakit.getName());
        holder.tv_keterangan.setText(penyakit.getKeterangan());
    }

    @Override
    public int getItemCount() {
        return listPeyakit.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView image_item;
        TextView tv_name, tv_keterangan;
        public ListViewHolder(View itemview) {
            super(itemview);
            image_item = itemview.findViewById(R.id.image_item);
            tv_name = itemview.findViewById(R.id.tv_penyakit);
            tv_keterangan = itemview.findViewById(R.id.tv_detailPenyakit);
        }
    }
}
