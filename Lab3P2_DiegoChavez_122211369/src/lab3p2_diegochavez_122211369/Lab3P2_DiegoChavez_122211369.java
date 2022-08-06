



package lab3p2_diegochavez_122211369;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2_DiegoChavez_122211369 {

    static Scanner lea = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion_menu = 0;
        ArrayList lista = new ArrayList();
        while (opcion_menu != 8) {
            System.out.println("Que desea hacer? \n 1.Crear cohete  \n 2. Crear planeta \n 3. Editar cohete \n 4. Editar planeta "
                    + "+\n 5. Listar Cohetes  \n 6. Listar Planetas  \n 7.  Probar cohete  \n 8. Salir    ");
            opcion_menu = lea.nextInt();

            switch (opcion_menu) {

                case 1:
                    System.out.println("Proporcione el nombre del cohete");
                    String nombre = lea.next();
                    System.out.println("Proporcione la capacidad de soporte del cohete");
                    float peso = lea.nextFloat();
                    int potencia = 0;
                    while (potencia <= 0 || potencia > 9) {
                        System.out.println("Proporcione la potencia, debe ser del 1 - 9 ");
                        potencia = lea.nextInt();
                    }// fin del while
                    String numeroserie = "";
                    boolean bandera = true;
                    while (bandera == true) {
                        System.out.println("Proporcione el numero de serie del cohete, no se debe repetir");
                        numeroserie = lea.next();
                        bandera = false;
                        for (Object object : lista) {
                            bandera = true;
                            if (object instanceof cohetes) {
                                if ((((cohetes) object).getNombre()).equals(numeroserie)) {
                                    bandera = true;
                                }
                            }// fin del if

                        }// fin del fore
                    }// fin del while del numero de serie
                    int opcion = 0;
                    while (opcion != 1 && opcion != 2 && opcion != 3) {
                        System.out.println("Que tipo de cohete desea?\n 1. Liquido \n 2. Fases \n 3. Solido");
                        switch (opcion) {
                            case 1:
                                System.out.println("Proporcione el numero de litros");
                                float litros = lea.nextFloat();
                                lista.add(new liquido(litros, peso, nombre, numeroserie, potencia, 1));
                                break;
                            case 2:

                                System.out.println("Proporcione el numero de fases");
                                int numfases = lea.nextInt();
                                System.out.println("Proporcione el numero de motores");
                                int motores = lea.nextInt();
                                System.out.println("Proporcione la altura");
                                float altura = lea.nextFloat();
                                lista.add(new fases(numfases, motores, altura, peso, nombre, numeroserie, potencia, 1));
                                break;
                            case 3:
                                System.out.println("Proporcione el numero de kilos");
                                float kilos = lea.nextFloat();
                                System.out.println("Proporcione el material");
                                String material = lea.next();
                                lista.add(new solido(kilos, material, peso, nombre, numeroserie, potencia, 1));
                                break;

                        }// fin del switch
                    }// fin del while
                    break;// fin de agregar cohetes

                case 2:

                    System.out.println("Proporcione la masa del planeta");
                    float masa = lea.nextFloat();
                    System.out.println("Proporcione el radio del planeta");
                    float radio = lea.nextFloat();

                    System.out.print("Proporcione la temperatura");
                    float temperatura = lea.nextInt();

                    String nombreplaneta = "";
                    bandera = true;
                    while (bandera) {
                        System.out.println("Proporcione el nombre del planeta, no se debe repetir");
                        nombreplaneta = lea.next();
                        for (Object object : lista) {
                            bandera = false;
                            if (object instanceof planetas) {
                                if ((((planetas) object).getNombre()).equals(nombreplaneta)) {
                                    bandera = true;
                                }
                            }// fin del if

                        }// fin del fore
                    }// fin del while del numero de serie
                    opcion = 0;
                    while (opcion != 1 && opcion != 2) {
                        System.out.println("Que tipo de planeta desea?\n 1. Rocoso \n 2. Gaseoso");
                        switch (opcion) {
                            case 1:
                                System.out.println("Proporcione la densidad");
                                float densidad = lea.nextFloat();
                                System.out.println("Tiene su planeta indicaciones de vida? 1. Si 2.No");
                                int opcion2 = 0;
                                boolean bandera2 = true;
                                while (opcion2 != 1 && opcion2 != 2) {
                                    switch (opcion2) {
                                        case 1:
                                            bandera2 = true;
                                            break;
                                        case 2:
                                            bandera2 = false;
                                            break;

                                    }// fin del switch
                                }// fin del while
                                lista.add(new rocosos(bandera2, densidad, nombreplaneta, masa, radio, temperatura));
                                break;
                            case 2:

                                System.out.println("Proporcione la presion");
                                float presion = lea.nextInt();
                                System.out.println("Proporcione el numero de anillos");
                                int anillos = lea.nextInt();

                                lista.add(new gaseosos(presion, anillos, nombreplaneta, masa, radio, temperatura));
                                break;

                        }// fin del swithc que decide entre planetas
                    }// fin del while

                    break; // fin de agregar planetas

                case 3:
                    int contador = 0;
                    for (Object object : lista) {

                        if (object instanceof planetas) {
                            System.out.println(contador + object.toString());
                        }// fin del if
                        contador++;
                    }// fin del fore

                    int coheteaeditar = -1;
                    while (coheteaeditar < 0 && coheteaeditar > lista.size() - 1 && lista.get(coheteaeditar) instanceof cohetes) {
                        System.out.println("Que cohete desea editar?");
                        coheteaeditar = lea.nextInt();
                    }// fin del while
                    System.out.println("Desea agregar o eliminar? Presione cualquier numero para agregar, el numero 2. para  Eliminar");
                    int opcion4 = lea.nextInt();
                    if (opcion4 != 2) {
                        int opcion3 = 0;
                        while (opcion3 != 2) {

                            System.out.println("Proporcione el nombre de la persona");
                            String nombrepersona = lea.next();
                            System.out.println("Proporcione el peso de la persona");
                            float pesopersona = lea.nextFloat();
                            System.out.println("Proporcione la edad");
                            int edad = lea.nextInt();
                            personas persona = new personas(nombrepersona, edad, pesopersona);

                            ((cohetes) lista.get(coheteaeditar)).getPersonas().add(persona);
                            System.out.println("Desea seguir agregando personas?  Si 2.No");
                            opcion3 = lea.nextInt();

                        }
                    }// fin del if
                    else {
                        System.out.println("Que desea eliminar?");
                        int opcion5 = lea.nextInt();
                        ((cohetes) lista.get(coheteaeditar)).getPersonas().remove(opcion5);
                    }

                    break; // fin del case 3

                case 4:

                    contador = 0;
                    for (Object object : lista) {

                        if (object instanceof planetas) {
                            System.out.println(contador + object.toString());
                        }// fin del if
                        contador++;
                    }// fin del fore

                    int planetaaeditar = -1;
                    while (planetaaeditar < 0 && planetaaeditar > lista.size() - 1 && lista.get(planetaaeditar) instanceof planetas) {
                        System.out.println("Que planeta desea editar?");
                        planetaaeditar = lea.nextInt();
                    }// fin del while
                    System.out.println("Desea agregar o eliminar? Presione cualquier numero para agregar, el numero 2. para  Eliminar");
                    opcion4 = lea.nextInt();
                    if (opcion4 != 2) {
                        int opcion3 = 0;
                        while (opcion3 != 2) {

                            System.out.println("Proporcione el nombre de la luna");
                            String nombreluna = lea.next();

                            System.out.println("Proporcione el numero de crateres");
                            int crateres = lea.nextInt();
                            lunas luna = new lunas(crateres, nombreluna);
                            //  listapersonas.add(persona);
                            ((planetas) lista.get(planetaaeditar)).getLunas().add(luna);
                            System.out.println("Desea seguir agregando lunas?  Si 2.No");
                            opcion3 = lea.nextInt();

                        }
                    }
                    else {
                        System.out.println("Que desea eliminar?");
                        int opcion5 = lea.nextInt();
                        ((planetas) lista.get(planetaaeditar)).getLunas().remove(opcion5);
                    }

                        break;

                    
            
        
    

case 5:
                    for (Object object : lista) {

                        if (object instanceof planetas) {
                            System.out.println(object.toString());
                        }// fin del if

                    }// fin del fore
                    break;// fin de listar cohetes

                case 6:
                    for (Object object : lista) {

                        if (object instanceof planetas) {
                            System.out.println(object.toString());
                        }// fin del if

                    }// fin del fore
                    break;// fin de listar planetas

                case 7:
                    System.out.println(" Que cohete desea elegir ?");
                    int coheteaelegir = lea.nextInt();
                    System.out.println(" Que planeta desea elegir ?");
                    int planetaaelegir = lea.nextInt();
                    System.out.println("Velocidad del cohete" + ((cohetes) lista.get(coheteaelegir)).getVelocidad());
                    System.out.println("Velocidad del planeta" + ((planetas) lista.get(planetaaelegir)).getVelocidad());
                    if (((cohetes) lista.get(coheteaelegir)).getVelocidad() > ((planetas) lista.get(planetaaelegir)).getVelocidad()) {
                        System.out.println("El cohete puede escapar");
                    } else {
                        System.out.println("El cohete no puede escapar");
                    }
                    break;

                default:
                    System.out.println("Opcion no posible");
                    break;
            }// fin del switch

        }// fin del while

    }// fin del main

}// fin del class
