package com.android.cgwx.testrvanimater;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class AAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private LayoutInflater mInflater;
    private Context context;


    @SuppressLint("CheckResult")
    public AAdapter(Context context) {
        this.context = context;
        mInflater = LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_rv, viewGroup, false);
        return new Type1ViewHolder(view);
    }


    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, final int i) {
        Type1ViewHolder vh = (Type1ViewHolder) viewHolder;
        vh.mTextView.setText("" + i);
    }


    @Override
    public int getItemCount() {
        return 10;
    }

    //此函数在调用 RecyclerView.setAdapter 时调用



    class Type1ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

                TextView mTextView;
//        RelativeLayout mRelativeLayout;
//        RelativeLayout mRelativeLayout2;
//        public int mPosition;
//
        Type1ViewHolder(View view) {
//            super();
            super(view);
            mTextView = view.findViewById(R.id.tv);
//            mRelativeLayout = view.findViewById(R.id.mRelativeLayout);
//            mRelativeLayout2 = view.findViewById(R.id.mBackRL);
//            view.setOnClickListener(this);
        }
//
        @Override
        public void onClick(View v) {
        }
    }
}

