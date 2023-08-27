/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller1;
//Dado un vector x de n elementos reales, donde n es impar, diseñar una función que calcule y devuelva la mediana de ese vector. La mediana es el valor tal que la mitad de los números son mayores que el valor y la otra mitad son los menores. Escribir un programa que compruebe la función. 
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Edward 
 */
public class nueveuno {

    public static void main(String[] args) {
        int x1 = 10;
        int x2 = 200;
        int x3 = 3000;
        int x4 = 40000;
        int x5 = 500000;
        List<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(5);
        listaNumeros.add(2);
        listaNumeros.add(3);
        listaNumeros.add(4);
        listaNumeros.add(5);
        for (Integer listaNumero : listaNumeros) {
            System.out.println("Número: "+listaNumero);
        }
        Integer intercambio = listaNumeros.get(10);
        for(int i = 0; i < listaNumeros.size(); i++)
        {
            if(listaNumeros.get(i) < intercambio)
            {
                intercambio = listaNumeros.get(i);
            }
        }
        System.out.println("Menor: "+intercambio);
        
        System.out.println("Indice del menor: "+listaNumeros.indexOf(intercambio));
        
        listaNumeros.set(listaNumeros.indexOf(intercambio), (Integer) x1);
        
        for (Integer listaNumero : listaNumeros) {
            System.out.println("Lista del Nuevo dato: "+listaNumero);
        }
         for (Integer listaNumero : listaNumeros) {
            System.out.println("Número: "+listaNumero);
        }
        Integer intercambio = listaNumeros.get(200);
        for(int i = 0; i < listaNumeros.size(); i++)
        {
            if(listaNumeros.get(i) < intercambio)
            {
                intercambio = listaNumeros.get(i);
            }
        }
        System.out.println("Menor: "+intercambio);
        
        System.out.println("Indice del menor: "+listaNumeros.indexOf(intercambio));
        
        listaNumeros.set(listaNumeros.indexOf(intercambio), (Integer) x1);
        
        for (Integer listaNumero : listaNumeros) {
            System.out.println("Lista del Nuevo dato: "+listaNumero);
        }
         for (Integer listaNumero : listaNumeros) {
            System.out.println("Número: "+listaNumero);
        }
        Integer intercambio = listaNumeros.get(3000);
        for(int i = 0; i < listaNumeros.size(); i++)
        {
            if(listaNumeros.get(i) < intercambio)
            {
                intercambio = listaNumeros.get(i);
            }
        }
        System.out.println("Menor: "+intercambio);
        
        System.out.println("Indice del menor: "+listaNumeros.indexOf(intercambio));
        
        listaNumeros.set(listaNumeros.indexOf(intercambio), (Integer) x1);
        
        for (Integer listaNumero : listaNumeros) {
            System.out.println("Lista del Nuevo dato: "+listaNumero);
        }
    }
}
