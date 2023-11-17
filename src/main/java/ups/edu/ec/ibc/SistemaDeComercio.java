/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ups.edu.ec.ibc;


import java.util.Scanner;

public class SistemaDeComercio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre del usuario
        System.out.print("Ingrese su nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();

        // Crear usuario y carrito
        Persona usuario = new Persona(nombreUsuario);
        Carrito carrito = new Carrito();

        // Crear controlador y vista
        Controlador controlador = new Controlador(usuario, carrito, new Vista());
        controlador.iniciarSistema(scanner);

        scanner.close();
    }
}