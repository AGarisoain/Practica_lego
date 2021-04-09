/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package legoquest;
import java.io.*;
/**
 *
 * @author Andrés
 */
class reader {

    static void bufRead(String name) {
        String line = "";
        try {
            FileReader content = new FileReader(name); //el archivo que he usado para hacer pruebas se llama prueba.txt, esta dentro de la carpeta legoQuest
            
            BufferedReader mybuffer = new BufferedReader(content);
            
            while(line!=null){
                line = mybuffer.readLine();
                if (line!=null){
                    System.out.println(line);
                }
            }  
            content.close();
        } catch (IOException e){
            System.out.println("Archivo no encontrado");
        }
        
    }
    
}
