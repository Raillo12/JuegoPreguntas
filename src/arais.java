import java.util.Random;

public class arais {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola bienvenido a un bucle del 1 al 10");
    
   
    
    String nombre[] = {"Papel" ,"Tijeras"};
  
    Random rm = new Random();

    int numRandom = rm.nextInt(nombre.length);
    
    System.out.println(nombre[numRandom]);
        
     
    
    
    }
}
