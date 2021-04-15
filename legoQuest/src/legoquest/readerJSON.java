/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package legoquest;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
 
import java.io.FileReader;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Andrés
 */
class readerJSON {

    static void reader(String file) {
        Scanner sc = new Scanner(System.in);
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader(file));

            JSONObject jsonObject = (JSONObject) obj;

            JSONArray companyList = (JSONArray) jsonObject.get("juguetes");

            Iterator<JSONObject> iterator = companyList.iterator();
            while (iterator.hasNext()) {
                JSONObject juguete = (JSONObject) iterator.next();
                char answer;
                boolean lego;
                boolean vehicle;
                boolean face;
                boolean simple;
                
                if (juguete.get("lego").toString().equals("true")){
                    System.out.println("El juguete es una pieza de lego");
                    lego = true;
                }else{
                    System.out.println("El juguete NO es una pieza de lego");
                    lego = false;
                }

                if(lego){ //pone el color si es lego
                    System.out.println("Es de color " + juguete.get("color"));
                }

                if (lego && juguete.get("simple").toString().equals("true")){ //pone si es simple
                    System.out.println("La pieza es simple");
                    simple = true;
                }else if (lego && juguete.get("simple").toString().equals("false")){
                    System.out.println("La pieza es compleja");
                    simple = false;
                }else{
                    simple = false;
                }

                if (lego && !simple){   //pone la descripcion
                    System.out.println("Descripcion: " + juguete.get("descripcion"));
                }

                if (lego && !juguete.get("altura").toString().equals("null")){ //pone la altura
                    System.out.println("La altura de la pieza es: " + juguete.get("altura"));
                }

                if (lego){ //pone los anclajes superiores
                    System.out.println("Anclajes superiores: " + juguete.get("anclajesSuperiores"));
                }

                if (lego){ //pone los anclajes superiores
                    System.out.println("Anclajes inferiores: " + juguete.get("anclajesInferiores"));
                }

                if (juguete.get("vehiculo").toString().equals("true")){ //pone vehiculos
                    System.out.println("El juguete es un vehiculo");
                    System.out.println("Es de color " + juguete.get("color"));
                    vehicle = true;
                }else if (!lego){
                    System.out.println("El juguete NO es un vehiculo");
                    vehicle = false;
                }else{
                    vehicle = false;
                }

                if (vehicle && !juguete.get("ruedas").toString().equals("null")){ //pone las ruedas
                    System.out.println("El juguete tiene " + juguete.get("ruedas") + " rueda/s");
                }

                if (vehicle){ //tipo de vehiculo
                    System.out.println("Su tipo es: " + juguete.get("tipoDeVehiculo"));
                }

                if (juguete.get("rostro").toString().equals("true")){   //pone si tiene cara
                    System.out.println("El juguete tiene almenos una cara");
                    System.out.println("Es de color " + juguete.get("color"));
                    face = true;
                }else if(!lego && !vehicle){
                    System.out.println("El juguete NO tiene cara");
                    face = false;
                }else{
                    face = false;
                }

                if (face){ //pone las patas
                    System.out.println("El juguete tiene " + juguete.get("patas") + " pata/s");
                }

                if (face){ //pone la forma
                    System.out.println("El juguete tiene forma: " + juguete.get("forma"));
                }

                if (face){ //pone el nombre
                    System.out.println("Nombre: " + juguete.get("nombre"));
                }

                if (!lego && !face && !vehicle){                                    //si no es ni lego ni vehiculo ni tiene cara
                    System.out.println("Es de color " + juguete.get("color"));
                    System.out.println("El juguete tiene forma de " + juguete.get("forma"));
                }

                if (!lego && !face && !vehicle && juguete.get("piezas").toString().equals("true")){ //pone las piezas
                    System.out.println("El juguete tiene varias piezas");
                }else if (!lego && !face && !vehicle){
                    System.out.println("El juguete es una unica pieza");
                }

                System.out.println("¿Siguiente juguete? (s: si, [other]: exit)");
                answer = sc.next().charAt(0);

                if(answer == 's' || answer == 'S'){

                }else{
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
