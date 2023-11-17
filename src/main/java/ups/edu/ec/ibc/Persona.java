package ups.edu.ec.ibc;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


// Clase que representa a un usuario del sistema
class Persona {
    private String nombre;   // Atributo que almacena el nombre del usuario
    private Carrito carrito; // Atributo que representa el carrito de compras del usuario

    // Constructor de la clase Usuario
    public Persona(String nombre) {
        this.nombre = nombre;          // Inicializa el nombre del usuario con el valor proporcionado
        this.carrito = new Carrito();  // Inicializa el carrito del usuario creando un nuevo objeto Carrito
    }

    // Método que devuelve el carrito de compras del usuario
    public Carrito getCarrito() {
        return carrito;
    }

    // Método toString que devuelve una representación de cadena de la instancia de Usuario
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", carrito=" + carrito +
                '}';
    }
}
