/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package legoquest;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Andrés
 */
class writerJSON {

    static void writer(Toy[] toys) {
        JSONArray juguetes = new JSONArray();
        JSONObject JSONString = new JSONObject();
                
        for(int i=0; i<toys.length; i++){
            JSONObject juguete = new JSONObject();
            juguete.put("lego", toys[i].lego);
            juguete.put("color", toys[i].color);
            juguete.put("simple", toys[i].simple);
            juguete.put("descripcion", toys[i].descripcion);
            juguete.put("baseMasPequeñaQueTecho", toys[i].baseMasPequeñaQueTecho);
            juguete.put("altura", toys[i].altura);
            juguete.put("anclajesSuperiores", toys[i].anclajesSuperiores);
            juguete.put("anclajesInferiores", toys[i].anclajesInferiores);
            juguete.put("vehiculo", toys[i].vehiculo);
            juguete.put("ruedas", toys[i].ruedas);
            juguete.put("tipoDeVehiculo", toys[i].tipoDeVehiculo);
            juguete.put("rostro", toys[i].rostro);
            juguete.put("patas", toys[i].patas);
            juguete.put("forma", toys[i].forma);
            juguete.put("nombre", toys[i].nombre);
            juguete.put("piezas", toys[i].piezas);
            juguetes.add(juguete);
        }
        
        JSONString.put("juguetes", juguetes);
        
 
        
        try (FileWriter file = new FileWriter("juguetes.json")) {
            file.write( JSONString.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        

        
//        content += "{" + "\n" + toys[i].lego + "\n";
//        content += toys[i].color + "\n";
//        content += toys[i].simple + "\n";
//        content += toys[i].descripcion + "\n";
//        content += toys[i].baseMasPequeñaQueTecho + "\n";
//        content += toys[i].altura + "\n";
//        content += toys[i].anclajesSuperiores + "\n";
//        content += toys[i].anclajesInferiores + "\n";
//        content += toys[i].vehiculo + "\n";
//        content += toys[i].ruedas + "\n";
//        content += toys[i].tipoDeVehiculo + "\n";
//        content += toys[i].rostro + "\n";
//        content += toys[i].patas + "\n";
//        content += toys[i].forma + "\n";
//        content += toys[i].nombre + "\n";
        //content += toys[i].piezas + "\n" + "}" + "\n";
        
    }
    
}
