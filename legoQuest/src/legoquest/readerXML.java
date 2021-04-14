/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package legoquest;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import java.util.Scanner;
import org.xml.sax.SAXException;

/**
 *
 * @author Andrés
 */
class readerXML {

    static void reader (String name){
        
        try{
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse(new File(name));
            
            //normaliza el documento
            document.getDocumentElement().normalize();
            
            //crea la array de juguetes
            NodeList nList = document.getElementsByTagName("jugete");


            for (int i = 0; i < nList.getLength(); i++){
                char answer;
                boolean lego;
                boolean vehicle;
                boolean face;
                boolean simple;
                Node node = nList.item(i);
                Scanner sc = new Scanner(System.in);
                
                System.out.println("--------------------------------");
                System.out.println("        NUEVO JUGUETE");
                if (node.getNodeType() == Node.ELEMENT_NODE){
                    Element eElement = (Element) node;
                    //System.out.println("lego : " + eElement.getElementsByTagName("lego").item(0).getTextContent());
                    //System.out.println("color : " + eElement.getElementsByTagName("color").item(0).getTextContent());
                    //System.out.println("simple : " + eElement.getElementsByTagName("simple").item(0).getTextContent());
                    //System.out.println("descripcion : " + eElement.getElementsByTagName("descripcion").item(0).getTextContent());

                    if (eElement.getElementsByTagName("lego").item(0).getTextContent().equals("true")){
                        System.out.println("El juguete es una pieza de lego");
                        lego = true;
                    }else{
                        System.out.println("El juguete NO es una pieza de lego");
                        lego = false;
                    }
                    
                    if(lego){ //pone el color si es lego
                        System.out.println("Es de color " + eElement.getElementsByTagName("color").item(0).getTextContent());
                    }
                    
                    if (lego && eElement.getElementsByTagName("simple").item(0).getTextContent().equals("true")){ //pone si es simple
                        System.out.println("La pieza es simple");
                        simple = true;
                    }else if (lego && eElement.getElementsByTagName("simple").item(0).getTextContent().equals("false")){
                        System.out.println("La pieza es compleja");
                        simple = false;
                    }else{
                        simple = false;
                    }
                    
                    if (lego && !simple){   //pone la descripcion
                        System.out.println("Descripcion: " + eElement.getElementsByTagName("descripcion").item(0).getTextContent());
                    }
                    
                    if (lego && !eElement.getElementsByTagName("altura").item(0).getTextContent().equals("null")){ //pone la altura
                        System.out.println("La altura de la pieza es: " + eElement.getElementsByTagName("altura").item(0).getTextContent());
                    }
                    
                    if (lego){ //pone los anclajes superiores
                        System.out.println("Anclajes superiores: " + eElement.getElementsByTagName("anclajesSuperiores").item(0).getTextContent());
                    }
                    
                    if (lego){ //pone los anclajes superiores
                        System.out.println("Anclajes inferiores: " + eElement.getElementsByTagName("anclajesInferiores").item(0).getTextContent());
                    }
                    
                    if (eElement.getElementsByTagName("vehiculo").item(0).getTextContent().equals("true")){ //pone vehiculos
                        System.out.println("El juguete es un vehiculo");
                        System.out.println("Es de color " + eElement.getElementsByTagName("color").item(0).getTextContent());
                        vehicle = true;
                    }else if (!lego){
                        System.out.println("El juguete NO es un vehiculo");
                        vehicle = false;
                    }else{
                        vehicle = false;
                    }
                    
                    if (vehicle && !eElement.getElementsByTagName("ruedas").item(0).getTextContent().equals("null")){ //pone las ruedas
                        System.out.println("El juguete tiene " + eElement.getElementsByTagName("ruedas").item(0).getTextContent() + " rueda/s");
                    }
                    
                    if (vehicle){ //tipo de vehiculo
                        System.out.println("Su tipo es: " + eElement.getElementsByTagName("tipoDeVehiculo").item(0).getTextContent());
                    }
                    
                    if (eElement.getElementsByTagName("rostro").item(0).getTextContent().equals("true")){   //pone si tiene cara
                        System.out.println("El juguete tiene almenos una cara");
                        System.out.println("Es de color " + eElement.getElementsByTagName("color").item(0).getTextContent());
                        face = true;
                    }else if(!lego && !vehicle){
                        System.out.println("El juguete NO tiene cara");
                        face = false;
                    }else{
                        face = false;
                    }
                    
                    if (face){ //pone las patas
                        System.out.println("El juguete tiene " + eElement.getElementsByTagName("patas").item(0).getTextContent() + " pata/s");
                    }
                    
                    if (face){ //pone la forma
                        System.out.println("El juguete tiene forma: " + eElement.getElementsByTagName("forma").item(0).getTextContent());
                    }
                    
                    if (face){ //pone el nombre
                        System.out.println("Nombre: " + eElement.getElementsByTagName("nombre").item(0).getTextContent());
                    }
                    
                    if (!lego && !face && !vehicle){                                    //si no es ni lego ni vehiculo ni tiene cara
                        System.out.println("Es de color " + eElement.getElementsByTagName("color").item(0).getTextContent());
                        System.out.println("El juguete tiene forma de " + eElement.getElementsByTagName("forma").item(0).getTextContent());
                    }
                    
                    if (!lego && !face && !vehicle){ //pone las piezas
                        System.out.println("El juguete tiene " + eElement.getElementsByTagName("piezas").item(0).getTextContent() + " pieza/s");
                    }
                    
                    System.out.println("¿Siguiente juguete? (s: si, [other]: exit)");
                    answer = sc.next().charAt(0);
                    
                    if(answer == 's' || answer == 'S'){
                        
                    }else{
                        break;
                    }
                        
                }
            }
            
        }catch(ParserConfigurationException | SAXException | IOException e){
            System.out.println("Algo ha salido mal");
        }
        
        
        
        
    }
    
}
