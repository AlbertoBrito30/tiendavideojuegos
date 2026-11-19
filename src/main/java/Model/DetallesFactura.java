/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author betit
 */
public class DetallesFactura {
    private int idDetallesFactura;
    private int idProducto;
    private int cantidad;
    private double precioUnitario;
    private int idFactura;

    public DetallesFactura(int idDetallesFactura, int idProducto, int cantidad, double precioUnitario, int idFactura) {
        this.idDetallesFactura = idDetallesFactura;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.idFactura = idFactura;
    }

    public int getIdDetallesFactura() {
        return idDetallesFactura;
    }

    public void setIdDetallesFactura(int idDetallesFactura) {
        this.idDetallesFactura = idDetallesFactura;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }
    
    
    
}
