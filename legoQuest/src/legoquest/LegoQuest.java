package legoquest;
import java.util.Scanner;
public class LegoQuest {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
<<<<<<< HEAD
        System.out.println("alo");
        System.out.println("aaaaa");
=======
       LegoQuest programa;
       programa = new LegoQuest();
       programa.run();  
    }
     public void run(){
         int opcion;
       do{
            System.out.println("Escoja una opción:");
            System.out.println("1-Elegir Jugetes");
            System.out.println("2-Adivinar Jugetes");
            System.out.println("3- Salir del programa.");
            opcion = sc.nextInt();
            controlaropcion(opcion);
       }while(opcion != 3);    
     }
     public void controlaropcion(int opcion){
        if(opcion == 1){     
        }
        if(opcion == 2){           
        }
>>>>>>> main
    }
}
