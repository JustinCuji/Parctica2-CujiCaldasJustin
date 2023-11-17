/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.ibc;


import java.util.List;
import java.util.Scanner;


class Vista {
     // Método para mostrar el menú principal
    public void mostrarMenuPrincipal() {
        System.out.println("1. Agregar producto al carrito");
        System.out.println("2. Realizar compra");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
    }
// Método para leer la opción seleccionada por el usuario
    public int leerOpcion(Scanner scanner) {
        return scanner.nextInt();
    }
// Método para leer la opción seleccionada por el usuario
    public int leerIdProducto(Scanner scanner) {
        System.out.print("Ingrese el ID del producto: ");
        return scanner.nextInt();
    }
// Método para leer el nombre del producto ingresado por el usuario
    public String leerNombreProducto(Scanner scanner) {
        System.out.print("Ingrese el nombre del producto: ");
        scanner.nextLine();  // Consumir la nueva línea pendiente
        return scanner.nextLine();
    }
 // Método para leer el precio del producto ingresado por el usuario

    public double leerPrecioProducto(Scanner scanner) {
        System.out.print("Ingrese el precio del producto: ");
        return scanner.nextDouble();
    }

    public void mostrarMensajeProductoAgregado() {
        System.out.println("Producto agregado al carrito.");
    }

    public void mostrarMensajeCarritoVacio() {
        System.out.println("El carrito está vacío. Agrega productos antes de realizar una compra.");
    }

    public void mostrarResumenCompra(List<Producto> productos) {
        System.out.println("Resumen de la compra:");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public void mostrarTotalCompra(double total) {
        System.out.println("Total: $" + total);
    }

    public void mostrarMensajeDespedida() {
        System.out.println("Saliendo del programa. ¡Hasta luego!");
    }

    public void mostrarMensajeOpcionInvalida() {
        System.out.println("Opción no válida. Inténtelo de nuevo.");
    }
}





