/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cocktailshakersort;

import java.util.Scanner;


/**
 *
 * @author migue
 */
public class CocktailShakerSort {
    
    public void cocktailSort(int array[]) {
        boolean intercambiado;
        
        do {
            intercambiado = false;
            for (int i = 0; i <= array.length - 2; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    intercambiado = true;
                }
            }
            if (!intercambiado) {
                break;
            }
            intercambiado = false;
            for (int i = array.length - 2; i >= 0; i--) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    intercambiado = true;
                }
            }
        } while (intercambiado);
    }

    public void imprimirArray(int array[]) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CocktailShakerSort objeto = new CocktailShakerSort();
        
        int[] array;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingresa el tamaño del arreglo: ");
            int tamaño = scanner.nextInt();
            array = new int[tamaño];
            for (int i = 0; i < tamaño; i++) {
                System.out.println("Ingresa el elemento " + (i + 1) + ":");
                array[i] = scanner.nextInt();
            }
        }
        
        objeto.cocktailSort(array);
        System.out.println("Arreglo ordenado:");
        objeto.imprimirArray(array);
    }
}