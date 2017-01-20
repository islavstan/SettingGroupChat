package com.islavstan.settinggroupchat;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class GroupContactsAdapter extends RecyclerView.Adapter<GroupContactsAdapter.MyViewHolder> {
    private List<Users> eList;
    int layout ;
    Context c;
    private LayoutInflater layoutInflater;

    public GroupContactsAdapter(Context c, List<Users>l, int layout){
        eList=l;
        layoutInflater=(LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.layout=layout;
        this.c=c;
    }





    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v =layoutInflater.inflate(layout,viewGroup,false);
        MyViewHolder viewHolder=new MyViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.creator_name.setText(eList.get(position).getName());
        holder.creator_number.setText(eList.get(position).getNumber());

    }

    @Override
    public int getItemCount() {
        return eList.size();
    }




    public class MyViewHolder extends RecyclerView.ViewHolder {
      TextView creator_name, creator_number;


        public MyViewHolder(View itemView) {
            super(itemView);

            creator_name=(TextView)itemView.findViewById(R.id.creator_name);
            creator_number=(TextView)itemView.findViewById(R.id.creator_number);




        }




    }}