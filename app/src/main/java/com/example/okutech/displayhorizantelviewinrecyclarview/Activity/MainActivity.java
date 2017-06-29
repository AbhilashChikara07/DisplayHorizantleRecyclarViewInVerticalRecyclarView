package com.example.okutech.displayhorizantelviewinrecyclarview.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.okutech.displayhorizantelviewinrecyclarview.Adaptor.MainActivityAdaptor;
import com.example.okutech.displayhorizantelviewinrecyclarview.Entity.EntityFour;
import com.example.okutech.displayhorizantelviewinrecyclarview.Entity.EntityOne;
import com.example.okutech.displayhorizantelviewinrecyclarview.Entity.EntityThree;
import com.example.okutech.displayhorizantelviewinrecyclarview.Entity.EntityTwo;
import com.example.okutech.displayhorizantelviewinrecyclarview.Entity.WrapperEntity;
import com.example.okutech.displayhorizantelviewinrecyclarview.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<WrapperEntity> mList = new ArrayList<>();
    private MainActivityAdaptor adaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addDataForEntityOne();
        addDataForEntityTwo();
        addDataForEntityThree();
        addDataForEntityFour();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adaptor = new MainActivityAdaptor(MainActivity.this, mList);
        recyclerView.setAdapter(adaptor);
        adaptor.notifyDataSetChanged();
    }

    private void addDataForEntityOne() {
        ArrayList<EntityOne> tempList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            EntityOne entityOne = new EntityOne();
            entityOne.setTextData(" Text String" + i);
            tempList.add(entityOne);
        }
        WrapperEntity wrapperEntity = new WrapperEntity(tempList);
        mList.add(wrapperEntity);
    }

    private void addDataForEntityTwo() {
        ArrayList<EntityTwo> tempList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            EntityTwo entityTwo = new EntityTwo();
            entityTwo.setTextData(" Text String" + i);
            tempList.add(entityTwo);
        }
        WrapperEntity wrapperEntity = new WrapperEntity(tempList);
        mList.add(wrapperEntity);
    }

    private void addDataForEntityThree() {
        ArrayList<EntityThree> tempList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            EntityThree entityThree = new EntityThree();
            entityThree.setTextData(" Text String" + i);
            tempList.add(entityThree);
        }
        WrapperEntity wrapperEntity = new WrapperEntity(tempList);
        mList.add(wrapperEntity);
    }

    private void addDataForEntityFour() {
        ArrayList<EntityFour> tempList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            EntityFour entityFour = new EntityFour();
            entityFour.setTextData(" Text String" + i);
            tempList.add(entityFour);
        }
        WrapperEntity wrapperEntity = new WrapperEntity(tempList);
        mList.add(wrapperEntity);
    }

}
