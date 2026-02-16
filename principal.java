import java.util.*;
public class principal {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    Vehiculo[] vehiculos = new Vehiculo[10];
    int opcion;
    int cont = 0;
    do{
        System.out.println("Seleccione una opcion.");
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. ");

        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                if(cont < vehiculos.length){
                    System.out.print("Ingrese el tipo de vehiculo: ");
                    
                    System.out.print("Ingrese la marca del vehiculo: ");
                    System.out.print("Ingrese el cilindraje del vehiclo: ");


                  //  tipo marca celda pago_anterior pago_actual cilindraje
                }
            case 2:
                break;
        
            default:
                break;
        }

    }while(opcion != 4);


}
    
}
