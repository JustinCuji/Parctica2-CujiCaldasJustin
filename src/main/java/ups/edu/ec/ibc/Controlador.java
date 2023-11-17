/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.ibc;


import java.util.Scanner;


// Clase que representa el controlador en el patrón MVC
class Controlador {
    private Persona usuario; // Usuario asociado al controlador
    private Carrito carrito; // Carrito asociado al controlador
    private Vista vista; // Vista asociada al controlador

    // Constructor de la clase Controlador
    public Controlador(Persona usuario, Carrito carrito, Vista vista) {
        this.usuario = usuario; // Inicializa el usuario asociado al controlador
        this.carrito = carrito; // Inicializa el carrito asociado al controlador
        this.vista = vista; // Inicializa la vista asociada al controlador
    }

    // Método para iniciar el sistema
    public void iniciarSistema(Scanner scanner) {
        int opcion;
        do {
            vista.mostrarMenuPrincipal(); // Muestra el menú principal a través de la vista
            opcion = vista.leerOpcion(scanner); // Lee la opción seleccionada por el usuario
            procesarOpcion(opcion, scanner); // Procesa la opción seleccionada
        } while (opcion != 3);
    }

    // Método para procesar la opción seleccionada por el usuario
    private void procesarOpcion(int opcion, Scanner scanner) {
        switch (opcion) {
            case 1:
                agregarProductoAlCarrito(scanner); // Opción para agregar un producto al carrito
                break;
            case 2:
                realizarCompra(); // Opción para realizar la compra
                break;
            case 3:
                vista.mostrarMensajeDespedida(); // Opción para salir del sistema
                break;
            default:
                vista.mostrarMensajeOpcionInvalida(); // Opción inválida
        }
    }

    // Método para agregar un producto al carrito
    private void agregarProductoAlCarrito(Scanner scanner) {
        int idProducto = vista.leerIdProducto(scanner); // Lee el ID del producto
        String nombreProducto = vista.leerNombreProducto(scanner); // Lee el nombre del producto
        double precioProducto = vista.leerPrecioProducto(scanner); // Lee el precio del producto

        // Crear un nuevo producto según el nombre proporcionado
        Producto producto;
        if (nombreProducto.equals("Electronico")) {
            System.out.print("Ingrese la marca del producto electrónico: ");
            String marca = scanner.next();
            producto = new Electronico(idProducto, nombreProducto, precioProducto, marca);
        } else if (nombreProducto.equals("Ropa")) {
            System.out.print("Ingrese la talla de la prenda de ropa: ");
            String talla = scanner.next();
            producto = new Ropa(idProducto, nombreProducto, precioProducto, talla);
        } else {
            producto = new Producto(idProducto, nombreProducto, precioProducto);
        }

        carrito.agregarProducto(producto); // Agrega el producto al carrito
        vista.mostrarMensajeProductoAgregado(); // Muestra un mensaje indicando que el producto ha sido agregado
    }

    // Método para realizar la compra
    private void realizarCompra() {
        if (carrito.getProductos().isEmpty()) {
            vista.mostrarMensajeCarritoVacio(); // Muestra un mensaje si el carrito está vacío
        } else {
            vista.mostrarResumenCompra(carrito.getProductos()); // Muestra un resumen de los productos en el carrito
            vista.mostrarTotalCompra(calcularTotalCompra(carrito)); // Muestra el total de la compra
            carrito.realizarCompra(); // Realiza la compra (lógica adicional puede incluir generar un pedido, vaciar el carrito, etc.)
        }
    }

    // Método para calcular el total de la compra
    private double calcularTotalCompra(Carrito carrito) {
        double total = 0.0;
        for (Producto producto : carrito.getProductos()) {
            total += producto.getPrecio(); // Suma los precios de los productos en el carrito
        }
        return total;
    }
}
