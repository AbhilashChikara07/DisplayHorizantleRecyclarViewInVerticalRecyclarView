package com.example.okutech.displayhorizantelviewinrecyclarview.Adaptor;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.okutech.displayhorizantelviewinrecyclarview.Entity.EntityFour;
import com.example.okutech.displayhorizantelviewinrecyclarview.Entity.EntityOne;
import com.example.okutech.displayhorizantelviewinrecyclarview.Entity.EntityThree;
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

public class MainActivityAdaptor extends RecyclerView.Adapter<MainActivityAdaptor.ItemViewHolder> {

    private Context context;
    private ArrayList<WrapperEntity> mList;
    private static final int ENTITYONE = 1;
    private static final int ENTITYTWO = 2;
    private static final int ENTITYTHREE = 3;
    private static final int ENTITYFOUR = 4;

    public MainActivityAdaptor(Context context, ArrayList<WrapperEntity> mList) {
        this.context = context;
        this.mList = mList;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.common_inflate_layout, parent, false);
        ItemViewHolder holder = new ItemViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        switch (getItemViewType(position)) {
            case ENTITYONE: {
                holder.headerTV.setText("FIRST VIEW");
                attachedEntityOneAdaptor(holder.recyclerView, position);
                break;
            }
            case ENTITYTWO: {
                holder.headerTV.setText("SECOND VIEW");
                attachedEntityTwoAdaptor(holder.recyclerView, position);
                break;
            }
            case ENTITYTHREE: {
                holder.headerTV.setText("THIRD VIEW");
                attachedEntityThirdAdaptor(holder.recyclerView, position);
                break;
            }
            case ENTITYFOUR: {
                holder.headerTV.setText("FOURTH VIEW");
                attachedEntityFourthAdaptor(holder.recyclerView, position);
                break;
            }
        }
    }


    private void attachedEntityOneAdaptor(RecyclerView recyclerView, int position) {
        EntityOneAdaptor adaptor = new EntityOneAdaptor(context, mList.get(position).get());
        recyclerView.setAdapter(adaptor);
        adaptor.notifyDataSetChanged();
    }

    private void attachedEntityTwoAdaptor(RecyclerView recyclerView, int position) {
        EntityTwoAdaptor adaptor = new EntityTwoAdaptor(context, mList.get(position).get());
        recyclerView.setAdapter(adaptor);
        adaptor.notifyDataSetChanged();
    }

    private void attachedEntityThirdAdaptor(RecyclerView recyclerView, int position) {
        EntityThreeAdaptor adaptor = new EntityThreeAdaptor(context, mList.get(position).get());
        recyclerView.setAdapter(adaptor);
        adaptor.notifyDataSetChanged();
    }

    private void attachedEntityFourthAdaptor(RecyclerView recyclerView, int position) {
        EntityFourAdaptor adaptor = new EntityFourAdaptor(context, mList.get(position).get());
        recyclerView.setAdapter(adaptor);
        adaptor.notifyDataSetChanged();
    }

    @Override
    public int getItemViewType(int position) {
        Object object = mList.get(position).get().get(0);
        if (object instanceof EntityOne) {
            return ENTITYONE;
        } else if (object instanceof EntityTwo) {
            return ENTITYTWO;
        } else if (object instanceof EntityThree) {
            return ENTITYTHREE;
        } else if (object instanceof EntityFour) {
            return ENTITYFOUR;
        } else return 5;
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private RecyclerView recyclerView;
        private TextView headerTV;
        private TextView viewAllTV;

        public ItemViewHolder(View itemView) {
            super(itemView);
            recyclerView = (RecyclerView) itemView.findViewById(R.id.recyclerView);
            viewAllTV = (TextView) itemView.findViewById(R.id.viewAllTV);
            viewAllTV.setOnClickListener(this);
            headerTV = (TextView) itemView.findViewById(R.id.headerTV);

            LinearLayoutManager layoutManager = new LinearLayoutManager(context);
            layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
            recyclerView.setLayoutManager(layoutManager);

        }

        @Override
        public void onClick(View view) {

        }
    }
}
