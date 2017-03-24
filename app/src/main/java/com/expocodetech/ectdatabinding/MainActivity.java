package com.expocodetech.ectdatabinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.expocodetech.ectdatabinding.adapter.MyCardAdapter;
import com.expocodetech.ectdatabinding.databinding.ActivityMainBinding;
import com.expocodetech.ectdatabinding.model.Item;
import com.expocodetech.ectdatabinding.model.User;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Las siguientes declaracion de propieades no es necesaria cuando se usa Data Binding
    //Ya que las mismas estan contenidas dentro de la clase que genera Android Studios a partir del
    //Layout que queremos conectar con el Activity
    ActivityMainBinding mBinding;
    private User mUser;

    private RecyclerView mRecyclerView;
    private ArrayList<Item> mItems;
    private MyCardAdapter mCardAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Mapeamos el Layout activity_main a una instancia de la clase ActivityMainBinding
        //la cual genere autoamticamente Android Studios a partir del layout R.layout.activity_main
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        //Una ves instanciada la clase ActivityMainBinding podemos acceder a los componentes UI
        //y por consiguietne podemos manipular sus propiedades
        loadUser();
        /*mBinding.name.setText(getString(R.string.name_txt));
        mBinding.descrip.setText(getString(R.string.descrip_txt));*/

        //Cargamos le RecyclerView
        loadItems();

        /*
        //En el siguiente trozo código no usamos Data Binding
        setContentView(R.layout.activity_main);
        mTvName = (TextView) findViewById(R.id.name);
        mTvName.setText(getString(R.string.name_txt));
        mTvDescrip = (TextView) findViewById(R.id.descrip);
        mTvDescrip.setText(getString(R.string.descrip_txt));
        */
    }

    private void loadUser(){
        mUser = new User(getString(R.string.name_txt), getString(R.string.descrip_txt));
        mBinding.setUser(mUser);
    }

    private void loadItems(){
        mItems = Utils.buildFakeItemsList();
        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        LinearLayoutManager lm = new LinearLayoutManager(this);
        lm.setOrientation(LinearLayoutManager.HORIZONTAL);
        mRecyclerView.setLayoutManager(lm);
        mCardAdapter = new MyCardAdapter(mItems);
        mRecyclerView.setAdapter(mCardAdapter);
    }
}

