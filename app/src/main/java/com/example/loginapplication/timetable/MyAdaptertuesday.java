package com.example.loginapplication.timetable;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.loginapplication.R;

import java.util.List;
import java.util.Random;

public class MyAdaptertuesday extends RecyclerView.Adapter<MyAdaptertuesday.ViewHolder> {
    private List<ListDatatuesday>listDatatuesdays;
Button imgf;


    public MyAdaptertuesday(List<ListDatatuesday> listDatatuesdays)
    {
        this.listDatatuesdays=listDatatuesdays;

    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_tuesday,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ListDatatuesday ld=listDatatuesdays.get(position);
        holder.hall.setText(ld.getHall());
        holder.subname.setText(ld.getSubname());
        holder.staff.setText(ld.getStaff());
        holder.time.setText(ld.getTime());


        imgf.setText(ld.getSubname().toUpperCase().charAt(0)+"");
        Random random=new Random();
        int red=random.nextInt(255);
        int green=random.nextInt(255);
        int blue=random.nextInt(255);




        imgf.setBackgroundColor(Color.rgb(red,green,blue));


    }

    @Override
    public int getItemCount() {
        return listDatatuesdays.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView hall,subname,staff,time;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            hall=(TextView)itemView.findViewById(R.id.hall);
            subname=(TextView)itemView.findViewById(R.id.subname);
            staff=(TextView)itemView.findViewById(R.id.staff);
            time=(TextView)itemView.findViewById(R.id.time);
            imgf=(Button) itemView.findViewById(R.id.imgf);


        }
    }




}


