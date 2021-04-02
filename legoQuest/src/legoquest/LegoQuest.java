package legoquest;
import java.util.Scanner;
import java.io.*;

public class LegoQuest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        do{
             System.out.println("Escoja una opción:");
             System.out.println("1-Elegir Jugetes");
             System.out.println("2-Adivinar Jugetes");
             System.out.println("3-Salir del programa.");
             opcion = sc.nextInt();

            switch (opcion){
                case 1:

                    break;
                case 2:
                    String name;
                    System.out.println("¿Como se llama el archivo?");
                    name = sc.next();
                    
                    reader.bufRead(name);

                    break;
                case 3:

                    break;
                default:

            }
        }while(opcion != 3);
    }


}
