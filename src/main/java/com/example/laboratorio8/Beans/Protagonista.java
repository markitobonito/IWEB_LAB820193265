package com.example.laboratorio8.Beans;
public class Protagonista {
    private Pelicula pelicula;
    private Actor actor;


    public Protagonista(Pelicula pelicula, Actor actor) {
        this.pelicula = pelicula;
        this.actor = actor;
    }
    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
}


