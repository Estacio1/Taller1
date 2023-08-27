package taller1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Edward
 */
public class nuevecuatro {
    public static void main(String[] args){
        Map<String, String> phoneBook = new HashMap<>();
        loadPhoneBook(phoneBook, "phone_numbers.txt");
        Scanner scanner = new Scanner (System.in);
        
        while(true){
            System.out.println("1. Consultar el nombre");
            System.out.println("2. Consultar el número de teléfono");
            System.out.println("2. salir");
            System.out.println("opción");
            int option = scanner.nextInt();
            
            scanner.nextLine();
            switch(option){
                case 1:
                    System.out.println("Ingrese tu nombre: ");
                    String name = scanner.nextLine();
                    String phoneNumberByName = phomeBook.get(name);
            }
        }
    }
}
