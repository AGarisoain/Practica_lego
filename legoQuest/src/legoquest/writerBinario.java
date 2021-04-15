/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package legoquest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Andrés
 */
class writerBinario {

    static void writerbinario(Toy[] toys) {
        try{
            File fichero = new File("PruebasPracticaIvanAndresBinario.txt");
            FileOutputStream conductor = new FileOutputStream(fichero);
            ObjectOutputStream escritura = new ObjectOutputStream(conductor);
                for(int i=0; i<toys.length; i++){
                   escritura.writeObject(toys[i]);
                }
            escritura.close();
        } catch (IOException ex){
            
        }
    }
    
}
