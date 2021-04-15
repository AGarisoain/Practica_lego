package legoquest;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class ReaderBinario {
    static void readerbinario(String args) {              
        char answer;
        Scanner sc = new Scanner(System.in);
        Toy binario;
        FileInputStream conductorentrada = null; 
        ArrayList<Toy> array = array = new ArrayList<Toy>();
        try{
         conductorentrada = new FileInputStream("PruebasPracticaIvanAndresBinario.txt");
         ObjectInputStream lectura = new ObjectInputStream(conductorentrada);
         binario = (Toy)lectura.readObject();
            while(binario != null){
               array.add(binario);
               binario = (Toy)lectura.readObject();
            }
         }
        catch (IOException | ClassNotFoundException ex){
        }
        for(int i=0; i<array.size(); i++){
            System.out.println("--------------------------------");
            System.out.println("        NUEVO JUGUETE");
            if (array.get(i).lego == true){
                    System.out.println("El juguete es una pieza de lego");
            }
            else if (array.get(i).lego == false){
                    System.out.println("El juguete NO es una pieza de lego");
            }
            if (array.get(i).lego == true){
                    System.out.println("Es de color " + array.get(i).color);
            }
            
            if (array.get(i).simple == true){
                System.out.println("La pieza es simple");  
            }
            else if (array.get(i).simple == false){
                System.out.println("La pieza es compleja");
            }
            if(array.get(i).lego == true && array.get(i).simple == false){
            System.out.println("Descripcion: " + array.get(i).descripcion);
            }
            if(array.get(i).lego == true && array.get(i).simple == false && array.get(i).baseMasPequeñaQueTecho == true){
            System.out.println("La base es mas pequeña que el techo");
            }
            else if(array.get(i).lego == true && array.get(i).simple == false && array.get(i).baseMasPequeñaQueTecho == false){
            System.out.println("La base NO es mas pequeña que el techo");
            }
            if(array.get(i).lego == true && array.get(i).altura != null){
            System.out.println("La altura de la pieza es: " + array.get(i).altura);
            }
            if(array.get(i).lego == true){
            System.out.println("Anclajes superiores: " + array.get(i).anclajesSuperiores);
            }
            if(array.get(i).lego == true){
            System.out.println("Anclajes inferiores: " + array.get(i).anclajesInferiores);
            }
            if(array.get(i).vehiculo == true){
            System.out.println("El juguete es un vehiculo");
            System.out.println("Es de color " + array.get(i).color);
            }
            else if (array.get(i).vehiculo == false){
                System.out.println("El juguete NO es un vehiculo");
            }
            if(array.get(i).vehiculo == true && array.get(i).ruedas != null){
                System.out.println("El juguete tiene " + array.get(i).ruedas + " rueda/s");
            }
            if (array.get(i).vehiculo == true && array.get(i).tipoDeVehiculo != null){
                System.out.println("Su tipo es: " + array.get(i).tipoDeVehiculo);
            }
            if (array.get(i).rostro == true){
                System.out.println("El juguete tiene almenos una cara");
                System.out.println("Es de color " + array.get(i).color);
            }
            else if (array.get(i).rostro == false){
                System.out.println("El juguete NO tiene cara");
            }
            if (array.get(i).rostro == true){
                System.out.println("El juguete tiene " + array.get(i).patas + " pata/s");
            }
            if (array.get(i).rostro == true){
                System.out.println("El juguete tiene forma de " + array.get(i).forma);
            }
            if (array.get(i).rostro == true){
                System.out.println("Nombre: " + array.get(i).nombre);
            }
            if (array.get(i).lego == false && array.get(i).vehiculo == false && array.get(i).rostro == false){
                System.out.println("Es de color " + array.get(i).color);
                System.out.println("El juguete tiene forma: " + array.get(i).forma);
            }
            if (array.get(i).lego == false && array.get(i).vehiculo == false && array.get(i).rostro == false && array.get(i).piezas == true){
                System.out.println("El juguete tiene varias piezas");
            }else if (array.get(i).lego == false && array.get(i).vehiculo == false && array.get(i).rostro == false){
                System.out.println("El juguete es una unica pieza");
            }
            
            System.out.println("¿Siguiente juguete? (s: si, [other]: exit)");
            answer = sc.next().charAt(0);

            if(answer == 's' || answer == 'S'){

            }else{
                break;
            }
        }
    }  
}