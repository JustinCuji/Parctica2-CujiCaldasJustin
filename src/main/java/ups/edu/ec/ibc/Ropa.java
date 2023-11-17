/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.ibc;


class Ropa extends Producto {
    private String talla;

    public Ropa(int id, String nombre, double precio, String talla) {
        super(id, nombre, precio);
        this.talla = talla;
    }

    public String getTalla() {
        return talla;
    }

    @Override
    public String toString() {
        return "Ropa{" +
                "id=" + getId() +
                ", nombre='" + getNombre() + '\'' +
                ", precio=" + getPrecio() +
                ", talla='" + talla + '\'' +
                '}';
    }
}