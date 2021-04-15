package legoquest;
import java.io.*;
class WriterBinario {
    static void writerbinario(Toy[] toys){
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
       //Toy[] arraybinario = (Toy[]) array.toArray();