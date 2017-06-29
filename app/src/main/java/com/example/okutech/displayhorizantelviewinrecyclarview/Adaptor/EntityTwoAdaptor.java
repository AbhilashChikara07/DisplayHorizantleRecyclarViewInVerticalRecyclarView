package com.example.okutech.displayhorizantelviewinrecyclarview.Adaptor;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.okutech.displayhorizantelviewinrecyclarview.Entity.EntityTwo;
import com.example.okutech.displayhorizantelviewinrecyclarview.Entity.WrapperEntity;
import com.example.okutech.displayhorizantelviewinrecyclarview.R;

import java.util.ArrayList;

/**
 * Description
 *
 * @author Abhilash Chikara
 * @version 1.0
 * @since 6/28/17
 */

public class EntityTwoAdaptor extends RecyclerView.Adapter<EntityTwoAdaptor.ViewHolderClass> {

    private Context mContext;
    private ArrayList<WrapperEntity> mList;

    public EntityTwoAdaptor(Context mContext, ArrayList<WrapperEntity> mList) {
        this.mContext = mContext;
        this.mList = mList;
    }

    @Override
    public EntityTwoAdaptor.ViewHolderClass onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.common_inflate_tv, parent, false);
        EntityTwoAdaptor.ViewHolderClass holderClass = new EntityTwoAdaptor.ViewHolderClass(view);
        return holderClass;
    }

    @Override
    public void onBindViewHolder(EntityTwoAdaptor.ViewHolderClass holder, int position) {
        Object o = mList.get(position);
        if (o instanceof EntityTwo) {
            EntityTwo entityTwo = (EntityTwo) o;
            holder.textView.setText(entityTwo.getTextData());
        }
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ViewHolderClass extends RecyclerView.ViewHolder {
        private TextView textView;

        public ViewHolderClass(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.textView);
        }
    }
}




