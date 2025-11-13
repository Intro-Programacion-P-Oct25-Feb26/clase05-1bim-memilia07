/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo6;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USER_ASUS
 */
public class Ejemplo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double costo_fijo = 25;
        String nombre;
        String apellido;
        String usuario;
        int edad;
        double descuento = 0.5;
        String parroquia;
        double valor_total;
        double valor_completo;
        int dia_pago;
        
        
        System.out.println("Ingrese sus Nombres");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese sus Apellidos");
        apellido = entrada.nextLine();
        
        System.out.println("Ingrese su Usuario");
        usuario = entrada.nextLine();
        
        System.out.println("Ingrese su Edad");
        edad = entrada.nextInt();
        
        entrada.nextLine();
        
        System.out.println("Ingrese su Parroquia");
        parroquia = entrada.nextLine();
        
        System.out.println("Ingrese su Dia de Pago");
        dia_pago = entrada.nextInt();
        
         valor_total = (costo_fijo * descuento);
         valor_completo = (costo_fijo - valor_total);

        
        if ((dia_pago >= 0 && dia_pago < 10) || ((parroquia.equals("El Valle") || 
                (parroquia.equals("El Sagrario"))))){
            System.out.printf("FUERZA TOTAL\nNombre: %s\n"
                    + "Apellido: %s\n"
                    + "Usuario: %s\n"
                    + "Edad: %s\n"
                    + "Dia de pago: %s\n"
                    + "Parroquia:%s\n"
                    + "USTED HA APLICADO AL DESCUENTO: $%.2f\n\n", 
                    nombre, 
                    apellido, 
                    usuario, 
                    edad, 
                    dia_pago, 
                    parroquia, 
                    valor_total);
            
            }else{
            System.out.printf("FUERZA TOTAL\nNombre: %s\nApellido: "
                    + "%s\nUsuario: %s\nEdad: %s\nDia de pago: %s\nParroquia: "
                    + "%s\nMEMBRESIA MENSUAL SIN DESCUENTO: $%.2f\n\n", 
                    nombre, 
                    apellido, 
                    usuario, 
                    edad, 
                    dia_pago, 
                    parroquia, 
                    valor_completo);


    }
    
    }
}