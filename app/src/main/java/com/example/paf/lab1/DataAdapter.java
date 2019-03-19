package com.example.paf.lab1;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    private numberClass numberClass;

    public DataAdapter()
    {
        super();
        numberClass = new numberClass();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        public View elementLV;
        public ViewHolder(View v)
        {
            super(v);
            this.elementLV = v;
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new ViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position)
    {
        String col = ((position + 1) % 2 == 0) ? "#CCCCCC" : "#FFFFFF";
        holder.elementLV.setBackgroundColor(Color.parseColor(col));
        TextView mTextView = (TextView) holder.elementLV.findViewById(R.id.name);
        mTextView.setText(numberClass.numberPerevod(position + 1));
    }

    @Override
    public int getItemCount()
    {
        return 1000000;
    }

}