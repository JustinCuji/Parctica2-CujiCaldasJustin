/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.ibc;


import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Usuario
 */
// Clase que representa el carrito de compra de un usuario
class Carrito {
    private List<Producto> productos; // Lista que almacena los productos en el carrito

    // Constructor de la clase Carrito
    public Carrito() {
        this.productos = new ArrayList<>(); // Inicializa la lista de productos como una nueva ArrayList
    }

    // Método para agregar un producto al carrito
    public void agregarProducto(Producto producto) {
        productos.add(producto); // Añade el producto a la lista de productos en el carrito
    }

    // Método que devuelve la lista de productos en el carrito
    public List<Producto> getProductos() {
        return productos; // Devuelve la lista de productos en el carrito
    }

    // Método para realizar la compra (lógica de compra, generación de pedido, etc.)
    public void realizarCompra() {
        // Lógica para realizar la compra
        // Esto podría incluir la generación de un pedido, vaciar el carrito, etc.
    }

    // Método toString que devuelve una representación de cadena de la instancia de Carrito
    @Override
    public String toString() {
        return "Carrito{" +
                "productos=" + productos +
                '}';
    }
}
