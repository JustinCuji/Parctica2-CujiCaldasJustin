/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.ibc;


class Electronico extends Producto {
    private String marca;

    public Electronico(int id, String nombre, double precio, String marca) {
        super(id, nombre, precio);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Electronico{" +
                "id=" + getId() +
                ", nombre='" + getNombre() + '\'' +
                ", precio=" + getPrecio() +
                ", marca='" + marca + '\'' +
                '}';
    }
}
