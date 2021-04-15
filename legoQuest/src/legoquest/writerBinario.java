package legoquest;
import java.io.*;
class writerBinario {
    static void writerbinario(Toy[] toys){
        try{
//            File fichero = new File("PruebasPracticaIvanAndresBinario.txt");
            FileOutputStream conductor = new FileOutputStream("PruebasPracticaIvanAndresBinario.txt");
            ObjectOutputStream escritura = new ObjectOutputStream(conductor);
                for(int i=0; i<toys.length; i++){
                   escritura.writeObject(toys[i]);
                }
            escritura.close();
            conductor.close();
        } catch (IOException ex){

        }
    }
}