package com.example.laboratorio8.Beans;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
private int idPelicula;
private String titulo;
private String director;
private int anioPublicacion;
private double rating;
 private double boxOffice;
 private Genero genero;
 private List<Actor> actores;
 public Pelicula() {
 }

 public Pelicula(int idPelicula, String titulo, String director, int anioPublicacion, double rating, double boxOffice) {
  this.idPelicula = idPelicula;
  this.titulo = titulo;
  this.director = director;
  this.anioPublicacion = anioPublicacion;
  this.rating = rating;
  this.boxOffice = boxOffice;
 }


 public int getIdPelicula() {
return idPelicula;
}

public void setIdPelicula(int idPelicula) {
 this.idPelicula = idPelicula;
 }

 public String getTitulo() {
 return titulo;
 }

public void setTitulo(String titulo) {
 this.titulo = titulo;
}

public String getDirector() {
return director;
 }

public void setDirector(String director) {
this.director = director;
 }

public int getAnioPublicacion() {
 return anioPublicacion;
}

public void setAnioPublicacion(int anioPublicacion) {
this.anioPublicacion = anioPublicacion;
}

public double getRating() {
return rating;
}

 public void setRating(double rating) {
this.rating = rating;
}

 public double getBoxOffice() {
return boxOffice;
}

 public void setBoxOffice(double boxOffice) {
 this.boxOffice = boxOffice;
}

 public Genero getGenero() {
 return genero;
}

 public void setGenero(Genero genero) {
 this.genero = genero;
}

 public List<Actor> getActores() {
 return actores;
 }

public void setActores(List<Actor> actores) {
this.actores = actores;
 }
}