package com.example.loginapplication.staffdetails;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.loginapplication.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<ListData>listData;




    public MyAdapter(List<ListData> listData)
    {
        this.listData=listData;

    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_data,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ListData ld=listData.get(position);
        holder.txtid.setText(ld.getId());
        holder.txtname.setText(ld.getName());
        holder.txtEmail.setText(ld.getEmail());
        holder.txtdesignation.setText(ld.getDesignation());
        holder.txtnumber.setText(ld.getNumber());

        Picasso.get().load(ld.getImageUrl()).into(holder.iv);


    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView txtid,txtname,txtdesignation,txtnumber,txtEmail;
        private ImageView iv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtid=(TextView)itemView.findViewById(R.id.idtxt);
            txtname=(TextView)itemView.findViewById(R.id.nametxt);
            txtEmail=(TextView)itemView.findViewById(R.id.Emailtxt);
            txtdesignation=(TextView)itemView.findViewById(R.id.designationtxt);
            txtnumber=(TextView)itemView.findViewById(R.id.numbertxt);

            iv=(ImageView)itemView.findViewById(R.id.imgf);
        }
    }



}


