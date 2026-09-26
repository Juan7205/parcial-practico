package com.uniajc;

import com.uniajc.biblioteca.Libro;
import com.uniajc.biblioteca.LibroTexto;
import com.uniajc.biblioteca.LibroTextoUNIAC;
import com.uniajc.biblioteca.Novela;
import java.util.Scanner;

/**
 * Clase principal que demuestra el uso del sistema de gestión de biblioteca.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Objeto libro1 utilizando el constructor con parámetros.
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 5, 1);
        System.out.println("=== libro1 (constructor con parámetros) ===");
        System.out.println(libro1);

        // 2. Objeto libro2 utilizando el constructor por defecto y obtener datos por consola.
        System.out.println("\n=== Ingreso de datos para libro2 (constructor por defecto) ===");
        System.out.print("Título: ");
        String titulo = sc.nextLine();
        System.out.print("Autor: ");
        String autor = sc.nextLine();
        System.out.print("Número de ejemplares: ");
        int ejemplares = sc.nextInt();
        sc.nextLine(); // consumir el salto de línea pendiente
        System.out.print("Número de ejemplares prestados: ");
        int prestados = sc.nextInt();
        sc.nextLine();

        Libro libro2 = new Libro();
        libro2.setTitutlo(titulo);
        libro2.setAutor(autor);
        libro2.setEjemplares(ejemplares);
        libro2.setEjemplaresPrestados(prestados);
        System.out.println("\n=== libro2 (leído por consola) ===");
        System.out.println(libro2);

        // 3. Objeto LibroTextoUNIAC con todos sus atributos.
        LibroTextoUNIAC libroUNIAC = new LibroTextoUNIAC(
                "Fundamentos de Programación",
                "Laura M. B. S.",
                3, 0,
                "Fundamentos de Programación",
                "Facultad de Ingeniería",
                "9789580000006");
        System.out.println("\n=== libroTextoUNIAC ===");
        System.out.println(libroUNIAC);
        System.out.println("ISBN válido: " + libroUNIAC.esIsbnValido());

        
        Novela novela = new Novela("El Hobbit", "J.R.R. Tolkien", 4, 2, Novela.AVENTURAS);
        System.out.println("\n=== novela ===");
        System.out.println(novela);

        
        System.out.println("\n=== Prueba de préstamo y devolución ===");

        
        System.out.println("Intentando prestar libro1 (disponibles="
                + libro1.ejemplaresDisponibles() + "): " + libro1.prestar());
        System.out.println("Estado libro1 después de prestar: " + libro1);

        
        System.out.println("Intentando prestar libro1 otra vez (disponibles="
                + libro1.ejemplaresDisponibles() + "): " + libro1.prestar());
        System.out.println("Estado libro1 después del segundo intento: " + libro1);

        
        System.out.println("Intentando devolver libro1 (prestados="
                + libro1.getEjemplaresPrestados() + "): " + libro1.devolver());
        System.out.println("Estado libro1 después de devolver: " + libro1);

        
        System.out.println("\nIntentando prestar libro2 (disponibles="
                + libro2.ejemplaresDisponibles() + "): " + libro2.prestar());
        System.out.println("Intentando devolver libro2 (prestados="
                + libro2.getEjemplaresPrestados() + "): " + libro2.devolver());

       
        Libro agotado = new Libro("Agotado", "Nadie", 1, 1);
        System.out.println("\nIntentando prestar libro agotado (disponibles="
                + agotado.ejemplaresDisponibles() + "): " + agotado.prestar()
                + " (se espera false)");
 
        
        Libro noPrestado = new Libro("No prestado", "Nadie", 3, 0);
        System.out.println("Intentando devolver libro no prestado (prestados="
                + noPrestado.getEjemplaresPrestados() + "): " + noPrestado.devolver()
                + " (se espera false)");

        sc.close();
    }
}