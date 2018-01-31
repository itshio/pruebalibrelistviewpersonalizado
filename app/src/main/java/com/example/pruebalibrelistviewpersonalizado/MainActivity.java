package com.example.pruebalibrelistviewpersonalizado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.LineNumberInputStream;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvrugby;
    ArrayList<Rugby> lista_jugadores = new ArrayList<Rugby>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cargarDatos();


        lvrugby= (ListView)findViewById(R.id.lvrugby);
        Adaptadorrugby adaptador= new Adaptadorrugby(this, lista_jugadores);
        lvrugby.setAdapter(adaptador);

        lvrugby.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Rugby c = ((Rugby)parent.getItemAtPosition(position));
                String equipos =c.getEquipo();
                Toast.makeText(getApplicationContext(),"has pulsado "+equipos,Toast.LENGTH_LONG).show();


            }
        });

        lvrugby.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                Rugby c = ((Rugby)parent.getItemAtPosition(position));
                int anual = c.getAño();
                Toast.makeText(getApplicationContext(),"ganador año "+anual, Toast.LENGTH_LONG).show();








                return true;
            }
        });
    }



        private void cargarDatos(){

        lista_jugadores.add(new Rugby(2001,"Irlanda","keith"));
        lista_jugadores.add(new Rugby(2002,"Francia","fabien"));
        lista_jugadores.add(new Rugby(2003,"Inglaterra","jonny"));
        lista_jugadores.add(new Rugby(2004,"Sudafrica","schalk"));
        lista_jugadores.add(new Rugby(2005,"Nueva Zelanda","daniel"));
        lista_jugadores.add(new Rugby(2006,"Nueva Zelanda","richie"));
        lista_jugadores.add(new Rugby(2007,"Sudafrica","bryan"));
        lista_jugadores.add(new Rugby(2008,"Gales","shane"));
        lista_jugadores.add(new Rugby(2009,"Nueva Zelanda","richie"));
        lista_jugadores.add(new Rugby(2010,"Nueva Zelanda","richie"));
        lista_jugadores.add(new Rugby(2011,"Francia","thierry"));
        lista_jugadores.add(new Rugby(2012,"Nueva Zelanda","daniel"));
        lista_jugadores.add(new Rugby(2013,"Nueva Zelanda","kieran"));
        lista_jugadores.add(new Rugby(2014,"Nueva Zelanda","brodie"));
        lista_jugadores.add(new Rugby(2015,"Nueva Zelanda","daniel"));
        lista_jugadores.add(new Rugby(2016,"Nueva Zelanda","beauden"));
        lista_jugadores.add(new Rugby(2017,"Nueva Zelanda","beauden"));




}






}//NO BORRAR









