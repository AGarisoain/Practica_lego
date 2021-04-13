package legoquest;
import java.util.Scanner;
import java.io.*;

public class LegoQuest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        int submenu; 
        System.out.println("Escoja una opción:");
        System.out.println("1-Elegir Jugetes");
        System.out.println("2-Adivinar Jugetes");
        System.out.println("3-Salir del programa.");
        opcion = sc.nextInt();
        switch (opcion){
            case 1:
                int juguetes;
                System.out.println("Cuantos juguetes hay?");
                juguetes = sc.nextInt();
                Toy[] toys = new Toy[juguetes];
                recordToys(toys);
                System.out.println("En que formato lo quieres extraer?");
                System.out.println("1-Txt");
                System.out.println("2-XML");
                System.out.println("3-Binario");
                submenu = sc.nextInt();
                switch (submenu){
                   case 1:
                        writer.writer(toys);
                   break;
                   case 2:
                        writerXML.writer(toys);
                   break;
                   case 3:
                       writerbinario.writer(toys);
                   break;                    
                }                  

                writer.writer(toys);


                break;
            case 2:              
                reader.bufRead("PruebasPracticaIvanAndres.txt");

                break;
            case 3:

                break;
            default:
        }
    }
/*
    preguntas para identificar los objetos:
    es lego?{
        color/es?
        es simple?
            no: breve descripcio
            la base es mas pequeña que el techo?
        altura?
        numero de anclajes superiores?
        numero de anclajes inferiores?
        }
    es un vehiculo?{
        color/es?
        numero de ruedas?
        tipo de vehiculo?
    }
    tiene cara?{
        color?
        numero de patas?
        forma?
        nombre?
    }
    forma?
    color?
    son varias piezas?
    
    */

    private static void recordToys(Toy toys[]) {
        Scanner sc = new Scanner(System.in);
        char answer;
        
        for(int i=0; i<toys.length; i++){
            Toy juguete = new Toy();
            toys[i] = juguete;
        }
        
        for(int i=0; i<toys.length; i++){
            System.out.println("Es un lego? (s:si n:no)");
            answer = sc.next().charAt(0);

            if (answer == 's' || answer == 'S'){
                toys[i].lego = true;

                System.out.println("De que color/es es?");
                toys[i].color = sc.next();

                System.out.println("Es simple? (s:si n:no)");
                answer = sc.next().charAt(0);

                if (answer == 's' || answer == 'S'){
                    toys[i].simple = true;

                }else{
                    toys[i].simple = false;

                    System.out.println("Breve descripcion:");
                    toys[i].descripcion = sc.next();

                    System.out.println("La base es más pequeña que el techo? (s:si n:no)");
                    answer = sc.next().charAt(0);

                    if (answer == 's' || answer == 'S'){
                        toys[i].baseMasPequeñaQueTecho = true;
                    }
                }

                System.out.println("Que altura tiene?");
                toys[i].altura = sc.nextInt();

                System.out.println("Cuantos anclajes superiores tiene?");
                toys[i].anclajesSuperiores = sc.nextInt();

                System.out.println("Cuantos anclajes inferiores tiene?");
                toys[i].anclajesInferiores = sc.nextInt();

            }else{
                toys[i].lego = false;

                System.out.println("Es un vehiculo? (s:si n:no)");
                answer = sc.next().charAt(0);

                if (answer == 's' || answer == 'S'){
                    toys[i].vehiculo = true;

                    System.out.println("De que color/es es?");
                    toys[i].color = sc.next();

                    System.out.println("Cuantas ruedas tiene?");
                    toys[i].ruedas = sc.nextInt();

                    System.out.println("Que tipo de vehiculo es?");
                    toys[i].tipoDeVehiculo = sc.next();

                }else{
                    toys[i].vehiculo = false;

                    System.out.println("Tiene cara? (s:si n:no)");
                    answer = sc.next().charAt(0);

                    if (answer == 's' || answer == 'S'){
                        toys[i].rostro = true;

                        System.out.println("De que color/es es?");
                        toys[i].color = sc.next();

                        System.out.println("Cuantas patas tiene?");
                        toys[i].patas = sc.nextInt();

                        System.out.println("Que forma tiene?");
                        toys[i].forma = sc.next();

                        System.out.println("Que nombre tiene? (no: si se desconoce)");
                        toys[i].nombre = sc.next();

                    }else{
                        toys[i].rostro = false;

                        System.out.println("Que forma tiene?");
                        toys[i].forma = sc.next();

                        System.out.println("De que color/es es?");
                        toys[i].color = sc.next();

                        System.out.println("Tiene varias piezas?");
                        answer = sc.next().charAt(0);

                        if (answer == 's' || answer == 'S'){
                            toys[i].piezas = true;
                        }else{
                            toys[i].piezas = false;
                        }
                    }
                }
            }
        }
    }
}
