package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author betit
 */
public class Videojuego {
    
    private int idProducto;
    private String titulo;
    private String plataforma;
    private String desarrollador;
    private int stock;
    private double precio;

    public Videojuego(String titulo, String plataforma, String desarrollador, int stock, double precio) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.desarrollador = desarrollador;
        this.stock = stock;
        this.precio = precio;
    }

    public Videojuego(int idProducto, String titulo, String plataforma, String desarrollador, int stock, double precio) {
        this.idProducto = idProducto;
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.desarrollador = desarrollador;
        this.stock = stock;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
