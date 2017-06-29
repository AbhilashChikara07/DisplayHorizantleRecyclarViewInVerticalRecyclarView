package com.example.okutech.displayhorizantelviewinrecyclarview.Adaptor;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.okutech.displayhorizantelviewinrecyclarview.Entity.EntityFour;
import com.example.okutech.displayhorizantelviewinrecyclarview.R;

import java.util.ArrayList;

/**
 * Description
 *
 * @author Abhilash Chikara
 * @version 1.0
 * @since 6/28/17
 */

public class EntityFourAdaptor extends RecyclerView.Adapter<EntityFourAdaptor.ViewHolderClass> {

    private Context mContext;
    private ArrayList<Object> mList;

    public EntityFourAdaptor(Context mContext, ArrayList<Object> mList) {
        this.mContext = mContext;
        this.mList = mList;
    }

    @Override
    public ViewHolderClass onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.common_inflate_tv, parent, false);
        ViewHolderClass holderClass = new ViewHolderClass(view);
        return holderClass;
    }

    @Override
    public void onBindViewHolder(ViewHolderClass holder, int position) {
        Object o = mList.get(position);
        if (o instanceof EntityFour) {
            EntityFour entityTwo = (EntityFour) o;
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
