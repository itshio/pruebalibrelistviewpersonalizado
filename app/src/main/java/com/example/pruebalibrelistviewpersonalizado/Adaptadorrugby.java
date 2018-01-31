package com.example.pruebalibrelistviewpersonalizado;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by DIDACT on 31/01/2018.
 */

public class Adaptadorrugby extends ArrayAdapter<Rugby> {

    ArrayList<Rugby> jugadores;
    Context c;

    public Adaptadorrugby(Context c,ArrayList<Rugby> jugadores){

        super(c, R.layout.item_rugby, jugadores);
        this.c =c;
        this.jugadores = jugadores;



    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater= LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.item_rugby,null);

        //TextView año
        TextView tv_marca=(TextView)item.findViewById(R.id.item_año);
        tv_marca.setText(""+jugadores.get(position).getAño());

        //TextView equipo
        TextView tv_modelo=(TextView)item.findViewById(R.id.item_equipo);
        tv_modelo.setText(jugadores.get(position).getEquipo());

        //ImageView
        String imagen = jugadores.get(position).getImagen();

        int idimagen = c.getResources().getIdentifier(imagen,"drawable",c.getPackageName());

        ImageView iv_imagen = (ImageView)item.findViewById(R.id.item_imagen);

        iv_imagen.setImageResource(idimagen);


        return item;
    }
}

