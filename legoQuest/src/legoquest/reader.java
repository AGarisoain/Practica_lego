/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package legoquest;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Andrés
 */
class reader {

    static void bufRead(String name) {
        
        
        String line = "";
        Scanner sc = new Scanner(System.in);
        
        try {
            FileReader content = new FileReader(name); //el archivo que he usado para hacer pruebas se llama prueba.txt, esta dentro de la carpeta legoQuest
            
            BufferedReader mybuffer = new BufferedReader(content);
            
            while(line!=null){
                char answer;
                boolean lego;
                boolean vehicle;
                boolean face;
                boolean simple;
                String shape;
                String color;
                
                if(line.equals("")){                                                    //contempla la situacion inicial
                    line = mybuffer.readLine();                                          //lee {
                }
                
                if (line.equals("{")){
                    System.out.println("--------------------------------");
                    System.out.println("        NUEVO JUGUETE");
                }else{
                    System.out.println("Ha habido un error en la lectura, hay mas lineas de las esperadas en un juguete");
                    break;
                }
                
                line = mybuffer.readLine();                                         //lee si es un lego
                if (line.equals("true")){
                    System.out.println("El juguete es una pieza de lego");
                    lego = true;
                }else{
                    System.out.println("El juguete NO es una pieza de lego");
                    lego = false;
                }
                
                line = mybuffer.readLine();                                         //lee el color
                color = line;
                
                if(lego){
                    System.out.println("Es de color " + color);
                }
                
                line = mybuffer.readLine();                                         //lee si es simple
                if (lego && line.equals("true")){
                    System.out.println("La pieza es simple");
                    simple = true;
                }else if (lego && line.equals("false")){
                    System.out.println("La pieza es compleja");
                    simple = false;
                }else{
                    simple = false;
                }
                
                line = mybuffer.readLine();                                         //lee la descripcion
                if (lego && !simple){
                    System.out.println("Descripcion: " + line);
                }
                
                line = mybuffer.readLine();                                         //lee si la base es mas pequeña que el techo
                if (lego && !simple && line.equals("true")){
                    System.out.println("La base es mas pequeña que el techo");
                }else if (lego && !simple && line.equals("false")){
                    System.out.println("La base NO es mas pequeña que el techo");
                }
                
                line = mybuffer.readLine();                                         //lee la altura
                if (lego && !line.equals("null")){
                    System.out.println("La altura de la pieza es: " + line);
                }
                
                line = mybuffer.readLine();                                         //lee el numero de anclajes superiorres
                if (lego){
                    System.out.println("Anclajes superiores: " + line);
                }
                
                line = mybuffer.readLine();                                         //lee el numero de anclajes inferiores
                if (lego){
                    System.out.println("Anclajes inferiores: " + line);
                }
                
                line = mybuffer.readLine();                                         //lee si es un vehiculo
                if (line.equals("true")){
                    System.out.println("El juguete es un vehiculo");
                    System.out.println("Es de color " + color);
                    vehicle = true;
                }else if (!lego){
                    System.out.println("El juguete NO es un vehiculo");
                    vehicle = false;
                }else{
                    vehicle = false;
                }
                
                line = mybuffer.readLine();                                         //lee las ruedas
                if (vehicle && !line.equals("null")){
                    System.out.println("El juguete tiene " + line + " rueda/s");
                }
                
                line = mybuffer.readLine();                                         //lee el tipo de vehiculo
                if (vehicle){
                    System.out.println("Su tipo es: " + line);
                }
                
                line = mybuffer.readLine();                                         //lee si tiene rostro
                if (line.equals("true")){
                    System.out.println("El juguete tiene almenos una cara");
                    System.out.println("Es de color " + color);
                    face = true;
                }else if(!lego && !vehicle){
                    System.out.println("El juguete NO tiene cara");
                    face = false;
                }else{
                    face = false;
                }
                
                line = mybuffer.readLine();                                         //lee las patas
                if (face){
                    System.out.println("El juguete tiene " + line + " pata/s");
                }
                
                line = mybuffer.readLine();                                         //lee la forma
                shape = line;
                if (face){
                    System.out.println("El juguete tiene forma de " + line);
                }
                
                line = mybuffer.readLine();                                         //lee el nombre
                if (face){
                    System.out.println("Nombre: " + line);
                }
                
                if (!lego && !face && !vehicle){                                    //si no es ni lego ni vehiculo ni tiene cara
                    System.out.println("Es de color " + color);
                    System.out.println("El juguete tiene forma: " + shape);
                }
                
                line = mybuffer.readLine();                                         //lee las piezas
                if (!lego && !face && !vehicle){
                    System.out.println("El juguete tiene " + line + " pieza/s");
                }
                
                line = mybuffer.readLine();                                          //lee }
                if (line.equals("}")){
                    
                }else{
                    System.out.println("Ha habido un error en la lectura, hay mas lineas de las esperadas en un juguete");
                    break;
                }
                
                System.out.println("¿Siguiente juguete? (s: si, [other]: exit)");
                answer = sc.next().charAt(0);

                if(answer == 's' || answer == 'S'){

                }else{
                    break;
                }
                
                line = mybuffer.readLine();                                          //lee { si sigue el archivo y null si ha acabado
            }  
            content.close();
        } catch (IOException e){
            System.out.println("Archivo no encontrado");

        }  
    }  

}

    
    /*
        content = content + "{" + "\n" + toys[i].lego + "\n";
        content = content + toys[i].color + "\n";
        content = content + toys[i].simple + "\n";
        content = content + toys[i].descripcion + "\n";
        content = content + toys[i].baseMasPequeñaQueTecho + "\n";
        content = content + toys[i].altura + "\n";
        content = content + toys[i].anclajesSuperiores + "\n";
        content = content + toys[i].anclajesInferiores + "\n";
        content = content + toys[i].vehiculo + "\n";
        content = content + toys[i].ruedas + "\n";
        content = content + toys[i].tipoDeVehiculo + "\n";
        content = content + toys[i].rostro + "\n";
        content = content + toys[i].patas + "\n";
        content = content + toys[i].forma + "\n";
        content = content + toys[i].nombre + "\n";
        content = content + toys[i].piezas + "\n" + "}" + "\n";
    */

