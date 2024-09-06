import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        menu();
    }
    public static void menu() {
        System.out.println("Bienvenido!");
        System.out.println("Elige una opcion!");
        System.out.println("1. Crear matriz");
        System.out.println("2. Mostrar fila");
        System.out.println("3. Verificar matriz tipo 0");
        System.out.println("4. Salir");
    }
    public static void mostrarMensaje(String mensaje) {
        System.out.println("mensaje");
    }
    public static int pedirFila(){
        Scanner scanner = new Scanner(System.in);
        int dimensionFila = scanner.nextInt();
        return dimensionFila;
    }
    public static int pedirColumna() {
        Scanner scanner = new Scanner(System.in);
        int dimensionColumna = scanner.nextInt();
        return dimensionColumna;
    }
    public static boolean validarDimensiones(int filas, int columnas) {
        boolean estado = false;
        if (filas > 0 && columnas > 0) {
            estado = true;
        }
        return estado;
    }

    public static int[][] crearMatriz(int filas , int columnas){
        int[][]matriz = new int[filas][columnas];
        return matriz;
    }


    }
