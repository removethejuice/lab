package clase.pkg1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.ArrayList;

public class Clase1 {

    static Scanner lea = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion_menu = 0;
       
        while (opcion_menu != 5) {
            System.out.println("");

            System.out.println("1) Agregar");
            System.out.println("2 Listar");
            System.out.println("3 Eliminar");
            System.out.println("4 Modificar");
            System.out.println("5 Salir");
            lea = new Scanner(System.in);
            opcion_menu = lea.nextInt();

            ArrayList<String> producto = new ArrayList<String>();
            DateFormat formateador = new SimpleDateFormat("dd/M/yy");
            Date fecha = new Date  ;
            String fecha1 = "";
            
            switch (opcion_menu) {

                case 1:
                    //define el formato de la fecha

                    System.out.println("Proporcione la fecha ");
                    fecha1 = lea.next();
                    System.out.println("Agregue el nombre y costo del producto");
                    String producto2 = lea.next();
                    producto.add(producto2);
                    String costo = lea.next();
                    producto.add(costo);

                    try {

                        fecha = formateador.parse(fecha1);

                        Calendar calendario = new GregorianCalendar();

                        calendario.setTime(fecha);

                    } catch (ParseException e) {
                        e.printStackTrace();
                    }

                    break;

                case 2:
                    System.out.println(formateador.format(calendario.getTime()));
                    break;

                case 3:
                    System.out.println("Seleccione el objeto a remover");
                    int o = lea.nextInt();
                    calendario.remove(o);
                    break;

                case 4:
                    System.out.println("Seleccione el objeto a modificar");
                    fecha1 = lea.next();
                    fecha = formateador.parse(fecha1);

                        Calendar calendario = new GregorianCalendar();

                        calendario.setTime(fecha);
                        break;
                        
                        

            }// fin del swithc
        }// fin del while
    }// fin del main

}// fin del class

// la tarea es crear un menu que contiene 5 cosas
//1 agregar producto se tiene que agregar el producto junto con la fecha y demas caracteristicas
//2 Listar productos del inventario
//3 Modificar producto se tiene que poder modificar la fecha y el color
//4 Eliminaro Producto
//5 Salir
//
