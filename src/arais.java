import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola bienvenido a un bucle del 1 al 10");
    
   
    
    String nombre[] = {"Piedra" , "Papel" ,"Tijeras"};
  
    Random rm = new Random();

    int DatoRandom = rm.nextInt(3);
    
    System.out.println(nombre[DatoRandom]);
        
     
    
    
    }
}
