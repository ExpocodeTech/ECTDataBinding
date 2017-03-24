package com.expocodetech.ectdatabinding;

import com.expocodetech.ectdatabinding.model.Item;

import java.util.ArrayList;
import java.util.Locale;
import java.util.StringTokenizer;

/**
 * Created by expocodetech on 24/3/17.
 */

public class Utils {

    public static ArrayList<Item> buildFakeItemsList(){
        ArrayList<Item> arrayListItems = new ArrayList<Item>();
        for(int i=0; i < 6; i++){
            Item item = new Item(String.format(Locale.getDefault(), "Item numero %d", i));
            arrayListItems.add(item);
        }
        return arrayListItems;
    }
}
