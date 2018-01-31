package com.example.pruebalibrelistviewpersonalizado;

/**
 * Created by DIDACT on 31/01/2018.
 */

public class Rugby {


    int año;
    String equipo;
    String imagen;
    String nombre;

    public Rugby(int año, String equipo, String imagen) {
        this.año = año;
        this.equipo = equipo;
        this.imagen = imagen;
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
