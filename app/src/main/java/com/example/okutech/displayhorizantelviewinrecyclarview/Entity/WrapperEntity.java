package com.example.okutech.displayhorizantelviewinrecyclarview.Entity;

import java.util.ArrayList;

/**
 * Description
 *
 * @author Abhilash Chikara
 * @version 1.0
 * @since 6/29/17
 */

public class WrapperEntity<T> {

    private ArrayList<T> list;

    public WrapperEntity(ArrayList<T> list) {
        this.list = list;
    }


    public ArrayList<T> get() {
        return list;
    }


}
