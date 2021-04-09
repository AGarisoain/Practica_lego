package legoquest;
import java.io.*;
import java.util.Scanner;
class writer {
    static void writer(){
        Scanner sc = new Scanner (System.in);
        String nombre;
        System.out.println("Escribe el nombre del fichero:");
        nombre = sc.next();
        
        try{
            FileWriter escritura = new FileWriter(nombre + ".txt", true);
            escritura.write("si\nsi\nno");
            escritura.close();
        } catch (IOException ex){
            System.out.println("algo ha fallado");
        }
    }
}
