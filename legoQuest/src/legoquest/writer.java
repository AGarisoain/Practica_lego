package legoquest;
import java.io.*;
class writer {
    static void writer(Toy[] toys){
        String content = "";
        for(int i=0; i<toys.length; i++){
          
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
        }
        try{
            FileWriter escritura = new FileWriter("PruebasPracticaIvanAndres.txt", true);
            escritura.write(content);
            escritura.close();
        } catch (IOException ex){
            System.out.println("Algo ha fallado");
        }
    }
}
