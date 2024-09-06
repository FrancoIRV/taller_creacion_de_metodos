
import java.util.Scanner;

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
    public static int pedirOpcion(){
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        return opcion;
    }
    public static boolean validarOpcion(int opcion){
        boolean estado = false;
        if (opcion >= 1 && opcion <= 4){
            estado = true;
        }
        return estado;
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
    public static int[][] llenarMatriz(int[][] matriz){
        Random num = new Random();
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; i < matriz[i].length; j++){
                matriz[i][j] = num.nextInt(10);
            }
        }
        return matriz;
    }
    /* metodo para pedir la fila que se quiere imprimir */
    public static int filImprimir(){
        Scanner scanner = new Scanner(System.in);
        int filaPedida = scanner.nextInt();
        return filaPedida;

    }
    public static boolean validarMostrar(int filapedida, int[][] matriz){
        boolean estado = false;
        if (filapedida > 0 && filapedida <= matriz.length){
            estado = true;
        }
        return estado;
    }
    public static void mostrarFila(int fila, int[][] matriz) {
        for (int i = 0; i < matriz[fila].length; i++) {
            System.out.print(matriz[fila][i]);
        }
    }
    /* metodo para contar los 0 de la matriz */
    public static int contar0s(int[][] matriz){
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 0) {
                    contador = contador + 1;
                }

            }
        }
        return contador;
    }
    public static boolean verificarTipo(int contador, int[][] matriz){
        boolean estado = false;
        if ((contador/matriz.length) > 50){
            estado = true;
        }
        return estado;
    }


    }
