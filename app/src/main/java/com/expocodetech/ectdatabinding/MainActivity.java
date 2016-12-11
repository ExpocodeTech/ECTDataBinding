package com.expocodetech.ectdatabinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.expocodetech.ectdatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //Las siguientes declaracion de propieades no es necesaria cuando se usa Data Binding
    //Ya que las mismas estan contenidas dentro de la clase que genera Android Studios a partir del
    //Layout que queremos conectar con el Activity
    private TextView mTvName, mTvDescrip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Mapeamos el Layout activity_main a una instancia de la clase ActivityMainBinding
        //la cual genere autoamticamente Android Studios a partir del layout R.layout.activity_main
        ActivityMainBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_main);
        //Una ves instanciada la clase ActivityMainBinding podemos acceder a los componentes UI
        //y por consiguietne podemos manipular sus propiedades
        binding.name.setText(getString(R.string.name_txt));
        binding.descrip.setText(getString(R.string.descrip_txt));

        /*
        //En el siguiente trozo código no usamos Data Binding
        setContentView(R.layout.activity_main);
        mTvName = (TextView) findViewById(R.id.name);
        mTvName.setText(getString(R.string.name_txt));
        mTvDescrip = (TextView) findViewById(R.id.descrip);
        mTvDescrip.setText(getString(R.string.descrip_txt));
        */
    }
}

