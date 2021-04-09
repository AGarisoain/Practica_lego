package legoquest;
import java.io.*;
class writerXML {
    static void writer(Toy[] toys){
        try{
            File old = new File("PruebasPracticaIvanAndres.xml");
            old.delete();
        }catch (Exception e){
            
        } 
        String content = "";
        content = content +"<?xml version='1.0' encoding='UTF-8'?>"  + "\n";
        content = content + "<jugetes>" + "\n";
        for(int i=0; i<toys.length; i++){
            content = content + "\t"  + "<jugete>" + "\n";
            content = content + "\t"  + "\t" + "<lego>"+ toys[i].lego + "</lego>" + "\n";
            content = content + "\t"  + "\t" + "<color>" +toys[i].color + "</color>" + "\n";
            content = content + "\t"  + "\t" + "<simple>" + toys[i].simple + "</simple>" + "\n";
            content = content + "\t"  + "\t" +"<descripcion>" + toys[i].descripcion + "</descripcion>" + "\n";
            content = content + "\t"  + "\t" + "<baseMasPequeñaQueTecho>" +  toys[i].baseMasPequeñaQueTecho + "</baseMasPequeñaQueTecho>" + "\n";
            content = content + "\t"  + "\t" + "<altura>" + toys[i].altura + "</altura>" + "\n";
            content = content + "\t"  + "\t" + "<anclajesSuperiores>" + toys[i].anclajesSuperiores + "</anclajesSuperiores>" + "\n";
            content = content + "\t"  + "\t" + "<anclajesInferiores>" + toys[i].anclajesInferiores + "</anclajesInferiores>" + "\n";
            content = content + "\t"  + "\t" + "<vehiculo>" + toys[i].vehiculo + "</vehiculo>" + "\n";
            content = content + "\t"  + "\t" + "<ruedas>" + toys[i].ruedas + "</ruedas>" + "\n";
            content = content + "\t"  + "\t" + "<tipoDeVehiculo>" + toys[i].tipoDeVehiculo + "</tipoDeVehiculo>" + "\n";
            content = content + "\t"  + "\t" + "<rostro>" + toys[i].rostro + "</rostro>" + "\n";
            content = content + "\t"  + "\t" + "<patas>" + toys[i].patas + "</patas>" + "\n";
            content = content + "\t"  + "\t" + "<forma>" + toys[i].forma + "</forma>" + "\n";
            content = content + "\t"  + "\t" + "<nombre>" + toys[i].nombre + "</nombre>" + "\n";
            content = content + "\t"  + "\t" + "<piezas>" + toys[i].piezas + "</piezas>" + "\n";
            content = content + "\t"  + "</jugete>" + "\n";
        }
        content = content + "</jugetes>" + "\n";
        try{
            FileWriter escritura = new FileWriter("PruebasPracticaIvanAndres.xml", true);
            escritura.write(content);
            escritura.close();
        } catch (IOException ex){
            System.out.println("Algo ha fallado");
        }
    }
}