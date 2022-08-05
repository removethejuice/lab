package tarea.pkg3;

import java.util.ArrayList;
import java.util.Scanner;

public class Tarea3 {

    static Scanner lea = new Scanner(System.in);

    public static void main(String[] args) {
        //se conoce el nombre, cantidad de quintales, precio, unidad de medida (libra, medida, kilo) y lugar de procedencia.
        int opcion_menu = 0;
        ArrayList lista = new ArrayList();
        while (opcion_menu != 6) {
            System.out.println("Seleccione una opcion: ");
            System.out.println("1.	Agregar Producto\n"
                    + "2.	Modificar Producto\n"
                    + "3.	Eliminar Producto\n"
                    + "4.	Simulación de Facturación\n"
                    + "5.	Reporte\n"
                    + "6.      Salir");
            opcion_menu = lea.nextInt();
            switch (opcion_menu) {

                case 1:
                    int opcion_menu2 = 0;
                    while (opcion_menu2 != 6) {
                        System.out.println("Que producto desea agregar?");
                        System.out.println("1.Granos Basicos\n 2. Liquidos\n 3. Carnes y embutidos\n 4.Frutas/Verduras\n 6. Salir");
                        opcion_menu2 = lea.nextInt();
                        switch (opcion_menu2) {
                            case 1:
                                //de este tipo de productos se conoce el nombre, cantidad de quintales, precio, unidad de medida (libra, medida, kilo) y lugar de procedencia.
                                System.out.println("Proporcione el nombre");
                                String nombre = lea.next();
                                System.out.println("Proporcione la cantidad de quintales");
                                float cant = lea.nextFloat();
                                System.out.println("Proporcione el precio");
                                float precio = lea.nextFloat();
                                int unidad = 0;
                                while (unidad != 1 && unidad != 2) {
                                    System.out.println("Proporcione la unidad: \n 1.Libras\n 2.Kilogramos \n ");
                                    unidad = lea.nextInt();
                                    if (unidad != 1 && unidad != 2) {
                                        System.out.println("Seleccione una opcion adecuada");

                                    }// fin del if
                                }// fin del while
                                System.out.println("Proporcione el lugar de procedencia");
                                String lugar = lea.next();

                                lista.add(new granosbasicos(nombre, cant, precio, unidad, lugar));

                                break;

                            case 2:

                                //Productos de limpieza: de éstos se conoce el tipo (líquido, polvo)*, marca*, código (no se debe repetir y es alfanumérico),
                                //precio*, cantidad en inventario*, proveedor* y el nombre del producto*.
                                System.out.println("Proporcione el nombre");
                                nombre = lea.next();
                                System.out.println("Proporcione la cantidad en el inventario");
                                int cant2 = lea.nextInt();
                                System.out.println("Proporcione el precio");
                                precio = lea.nextFloat();
                                unidad = 0;
                                while (unidad != 1 && unidad != 2) {
                                    System.out.println("Proporcione la unidad: \n 1.Liquido\n 2.Polvo \n ");
                                    unidad = lea.nextInt();
                                    if (unidad != 1 && unidad != 2) {
                                        System.out.println("Seleccione una opcion adecuada");

                                    }// fin del if
                                }// fin del while

                                System.out.println("Proporcione el tamanio");
                                int tamanio = lea.nextInt();
                                while (tamanio != 1 && tamanio != 2 && tamanio != 3) {
                                    System.out.println("Proporcione el tamanio: \n 1.Pequenio\n 2.Mediano \n 3.Grande ");
                                    tamanio = lea.nextInt();
                                    if (tamanio != 1 && tamanio != 2 && tamanio != 3) {
                                        System.out.println("Seleccione una opcion adecuada");

                                    }// fin del if
                                }// fin del while

                                System.out.println("Proporcione el proveedor");
                                lugar = lea.next();

                                System.out.println("Proporcione la marca");
                                String marca = lea.next();

                                System.out.println("Proporcione el codigo");
                                String codigo = lea.next();

                                for (Object object : lista) {
                                    if (object instanceof liquidos) {
                                        while ((((liquidos) object).getcodigo()).equals(codigo)) {
                                            System.out.println("Proporcione el codigo, no se debe repetir!");
                                            codigo = lea.next();
                                        }
                                    }// fin del if

                                }// fin del fore

                                lista.add(new liquidos(nombre, cant2, precio, unidad, tamanio, lugar, marca, codigo));

                                break;// fin del segundo case

                            case 3:
                                //Carnes y embutidos de estos se conocen su lugar de procedencia, 
                                //cantidad en inventario, tipo (res, carne blanca, cerdo) y su precio.

                                System.out.println("Proporcione la cantidad en el inventario");
                                cant = lea.nextFloat();
                                System.out.println("Proporcione el precio");
                                precio = lea.nextFloat();
                                unidad = 0;
                                while (unidad != 1 && unidad != 2 && unidad != 3) {
                                    System.out.println("Proporcione la unidad: \n 1.Res\n 2.Carne blanca \n 3. Cerdo");
                                    unidad = lea.nextInt();
                                    if (unidad != 1 && unidad != 2 && unidad != 3) {
                                        System.out.println("Seleccione una opcion adecuada");

                                    }// fin del if
                                }// fin del while
                                System.out.println("Proporcione el lugar de procedencia");
                                lugar = lea.next();

                                lista.add(new carnesyembutidos(cant, precio, unidad, lugar));

                                break;//* fin del case 3

                            case 4:

                                //Frutas/verduras: se conoce su precio, cantidad a inventariar, 
                                //su categoría si el producto es una Fruta la categoría puede tomas estos valores: cítricos, tropical, de grano o rica en fibra. 
                                //Si el producto es una verdura entonces los valores para categorizarla pueden ser: tubérculos, legumbres, de hojas.
                                System.out.println("Proporcione el nombre de el objeto");
                                nombre = lea.next();
                                System.out.println("Proporcione la cantidad a inventariar");
                                cant = lea.nextFloat();
                                System.out.println("Proporcione el precio");
                                precio = lea.nextFloat();
                                unidad = 0;
                                int unidad2 = 0;
                                while (unidad != 1 && unidad != 2) {
                                    System.out.println("Es fruta o vegetal? \n 1.Fruta\n 2.Vegetal \n ");
                                    unidad = lea.nextInt();
                                    if (unidad == 1) {
                                        System.out.println("1. Citrico \n  2. Tropical \n 3. Grano\n  4.Rica en fibra");
                                        unidad2 = lea.nextInt();
                                        while (unidad2 != 1 && unidad2 != 2 && unidad2 != 3 && unidad2 != 4) {
                                            System.out.println("1. Citrico \n  2. Tropical \n 3. Grano\n  4.Rica en fibra");
                                            unidad2 = lea.nextInt();
                                        }// fin del while
                                    }// fin del if
                                    else if (unidad == 2) {
                                        System.out.println("1. Tuberculos \n  2. Legumbres \n 3. Hojas\n  ");
                                        unidad2 = lea.nextInt();
                                        while (unidad2 != 1 && unidad2 != 2 && unidad2 != 3) {
                                            System.out.println("1. Tuberculos \n  2. Legumbres \n 3. Hojas\n  ");
                                            unidad2 = lea.nextInt();
                                        }// fin del while
                                    }// fin del segundo if
                                    if (unidad != 1 && unidad != 2) {
                                        System.out.println("Seleccione una opcion adecuada");

                                    }// fin del if
                                }// fin del while

                                lista.add(new frutasverduras(nombre, cant, precio, unidad2));

                                break;

                            default:
                                System.out.println("Opcion equivocada");
                                break;

                        }// fin del switch
                    }// fin del while

                    break; // fin del case 1

                case 2:
                    boolean bandera = false;
                    System.out.println("Proporcione el nombre de el objeto que desea editar, en el caso de la carne el lugar de procedencia");
                    String editar = lea.next();
                    for (Object object : lista) {
                        if (object instanceof granosbasicos) {
                            if ((((granosbasicos) object).getnombre()).equals(editar)) {
                                bandera = true;
                                int opcion = 0;
                                while (opcion != 6) {
                                    System.out.println("Que objeto desea editar? \n 1. Nombre  \n 2. Cantidad \n 3. Precio \n 4.Unidad \n  5. Lugar");
                                    opcion = lea.nextInt();
                                    switch (opcion) {

                                        case 1:
                                            System.out.println("Proporcione el nombre");
                                            String nombre = lea.next();
                                            ((granosbasicos) object).setnombre(nombre);
                                            break;
                                        case 2:
                                            System.out.println("Proporcione la cantidad de quintales");
                                            float cant = lea.nextFloat();
                                            ((granosbasicos) object).setcantquint(cant);
                                            break;
                                        case 3:
                                            System.out.println("Proporcione el precio");
                                            float precio = lea.nextFloat();
                                            ((granosbasicos) object).setprecio(precio);
                                            break;
                                        case 4:
                                            int unidad = 0;
                                            while (unidad != 1 && unidad != 2) {
                                                System.out.println("Proporcione la unidad: \n 1.Libras\n 2.Kilogramos \n ");
                                                unidad = lea.nextInt();
                                                if (unidad != 1 && unidad != 2) {
                                                    System.out.println("Seleccione una opcion adecuada");

                                                }// fin del if
                                            }// fin del while
                                            ((granosbasicos) object).setunidad(unidad);
                                            break;
                                        case 5:
                                            System.out.println("Proporcione el lugar de procedencia");
                                            String lugar = lea.next();
                                            ((granosbasicos) object).setlugar(lugar);
                                            break;

                                        default:
                                            System.out.println("Seleccione una opcion adecuada");
                                            break;
                                    }// fin de switch interno  
                                }// fin del while interno

                            }// fin del segundo if que determina si el nombre del objeto existe
                        }// fin del primer if que determina si es de granos basicos

                        if (object instanceof liquidos) {
                            if ((((liquidos) object).getnombre()).equals(editar)) {

                                bandera = true;
                                int opcion = 0;
                                while (opcion != 6) {
                                    System.out.println("Que objeto desea editar? \n 1. Nombre  \n 2. Cantidad \n 3. Precio \n 4.Unidad \n  5. Tamanio \n 6. Proveedor \n 7. Marca\n 8. codigo \n 9. Salir");
                                    opcion = lea.nextInt();
                                    switch (opcion) {

                                        case 1:
                                            System.out.println("Proporcione el nombre");
                                            String nombre = lea.next();
                                            ((liquidos) object).setnombre(nombre);
                                            break;
                                        case 2:
                                            System.out.println("Proporcione la cantidad en el inventario");
                                            int cant2 = lea.nextInt();
                                            ((liquidos) object).setcant2(cant2);
                                            break;
                                        case 3:
                                            System.out.println("Proporcione el precio");
                                            float precio = lea.nextFloat();
                                            ((liquidos) object).setprecio(precio);
                                            break;
                                        case 4:
                                            int unidad = 0;
                                            while (unidad != 1 && unidad != 2) {
                                                System.out.println("Proporcione la unidad: \n 1.Liquido\n 2.Polvo \n ");
                                                unidad = lea.nextInt();
                                                if (unidad != 1 && unidad != 2) {
                                                    System.out.println("Seleccione una opcion adecuada");

                                                }// fin del if
                                            }// fin del while
                                            ((liquidos) object).setunidad(unidad);
                                            break;
                                        case 5:
                                            System.out.println("Proporcione el tamanio");
                                            int tamanio = lea.nextInt();
                                            while (tamanio != 1 && tamanio != 2 && tamanio != 3) {
                                                System.out.println("Proporcione el tamanio: \n 1.Pequenio\n 2.Mediano \n 3.Grande ");
                                                tamanio = lea.nextInt();
                                                if (tamanio != 1 && tamanio != 2 && tamanio != 3) {
                                                    System.out.println("Seleccione una opcion adecuada");

                                                }// fin del if
                                            }// fin del while
                                            ((liquidos) object).settamanio(tamanio);
                                            break;
                                        case 6:
                                            System.out.println("Proporcione el proveedor");
                                            String lugar = lea.next();
                                            ((liquidos) object).setlugar(lugar);

                                            break;

                                        case 7:
                                            System.out.println("Proporcione la marca");
                                            String marca = lea.next();
                                            ((liquidos) object).setmarca(marca);
                                            break;

                                        case 8:
                                            System.out.println("Proporcione el codigo");
                                            String codigo = lea.next();

                                            for (Object object2 : lista) {
                                                if (object2 instanceof liquidos) {
                                                    while ((((liquidos) object2).getcodigo()).equals(codigo)) {
                                                        System.out.println("Proporcione el codigo, no se debe repetir!");
                                                        codigo = lea.next();
                                                    }
                                                }// fin del if

                                            }// fin del fore

                                            break;

                                        default:
                                            System.out.println("Seleccione una opcion adecuada");
                                            break;
                                    }// fin de switch interno  
                                }// fin del while interno

                            }// fin del for instance  of
                        }// fin del equals que determina si es de la clase de liquidos

                        if (object instanceof carnesyembutidos) {
                            if ((((carnesyembutidos) object).getLugar()).equals(editar)) {
                                bandera = true;
                                int opcion = 0;
                                while (opcion != 5) {
                                    System.out.println("Que objeto desea editar? \n 1. Nombre  \n 2. Cantidad \n 3. Precio \n 4.Unidad \n  5. Tamanio \n 6. Proveedor \n 7. Marca\n 8. codigo \n 9. Salir");
                                    opcion = lea.nextInt();
                                    switch (opcion) {

                                        case 1:
                                            System.out.println("Proporcione la cantidad en el inventario");
                                            float cant = lea.nextFloat();
                                            ((carnesyembutidos) object).setCant(cant);
                                            break;

                                        case 2:
                                            System.out.println("Proporcione el precio");
                                            float precio = lea.nextFloat();
                                            ((carnesyembutidos) object).setPrecio(precio);
                                            break;

                                        case 3:
                                            int unidad = 0;
                                            while (unidad != 1 && unidad != 2 && unidad != 3) {
                                                System.out.println("Proporcione la unidad: \n 1.Res\n 2.Carne blanca \n 3. Cerdo");
                                                unidad = lea.nextInt();
                                                if (unidad != 1 && unidad != 2 && unidad != 3) {
                                                    System.out.println("Seleccione una opcion adecuada");

                                                }// fin del if
                                            }// fin del while
                                            ((carnesyembutidos) object).setUnidad(unidad);
                                            break;

                                        case 4:
                                            System.out.println("Proporcione el lugar de procedencia");
                                            String lugar = lea.next();
                                            ((carnesyembutidos) object).setLugar(lugar);
                                            break;

                                        default:
                                            System.out.println("Seleccione una opcion adecuada");
                                            break;

                                    }// fin del switch
                                }// fin del while
                            }// fin del primer if que determina si es el objeto buscado en carnes
                        }// fin de carnes
                        if (object instanceof frutasverduras) {
                            if ((((frutasverduras) object).getNombre()).equals(editar)) {
                                bandera = true;
                                int opcion = 0;
                                while (opcion != 5) {
                                    System.out.println("Que objeto desea editar? \n 1. Nombre  \n 2. Cantidad \n 3. Precio \n 4.Unidad \n  5. Salir");
                                    opcion = lea.nextInt();
                                    switch (opcion) {

                                        case 1:
                                            System.out.println("Proporcione el nombre de el objeto");
                                            String nombre = lea.next();
                                            ((frutasverduras) object).setNombre(nombre);
                                            break;
                                        case 2:
                                            System.out.println("Proporcione la cantidad a inventariar");
                                            float cant = lea.nextFloat();
                                            ((frutasverduras) object).setCant(cant);
                                            break;
                                        case 3:
                                            System.out.println("Proporcione el precio");
                                            float precio = lea.nextFloat();
                                            ((frutasverduras) object).setPrecio(precio);

                                            break;
                                        case 4:
                                            int unidad = 0;
                                            int unidad2 = 0;
                                            while (unidad != 1 && unidad != 2) {
                                                System.out.println("Es fruta o vegetal? \n 1.Fruta\n 2.Vegetal \n ");
                                                unidad = lea.nextInt();
                                                if (unidad == 1) {
                                                    System.out.println("1. Citrico \n  2. Tropical \n 3. Grano\n  4.Rica en fibra");
                                                    unidad2 = lea.nextInt();
                                                    while (unidad2 != 1 && unidad2 != 2 && unidad2 != 3 && unidad2 != 4) {
                                                        System.out.println("1. Citrico \n  2. Tropical \n 3. Grano\n  4.Rica en fibra");
                                                        unidad2 = lea.nextInt();
                                                    }// fin del while
                                                }// fin del if
                                                else if (unidad == 2) {
                                                    System.out.println("1. Tuberculos \n  2. Legumbres \n 3. Hojas\n  ");
                                                    unidad2 = lea.nextInt();
                                                    while (unidad2 != 1 && unidad2 != 2 && unidad2 != 3) {
                                                        System.out.println("1. Tuberculos \n  2. Legumbres \n 3. Hojas\n  ");
                                                        unidad2 = lea.nextInt();
                                                    }// fin del while
                                                }// fin del segundo if
                                                if (unidad != 1 && unidad != 2) {
                                                    System.out.println("Seleccione una opcion adecuada");

                                                }// fin del if
                                            }// fin del while

                                            break;

                                        default:
                                            System.out.println("Seleccione una opcion adecuada");
                                            break;
                                    }// fin del switch
                                }// fin del while
                            }// fin del if que determina frutas
                        }// fin del instance of de frutas, basicamente fin de frutas

                    }// fin del fore, basicamente del ejercicio2

                    if (bandera == false) {
                        System.out.println("Opcion incorrecta no se encuentra en la lista!");
                    }

                    break; // fin del case 2, editar las cosas wei

                case 3: {
                    bandera = false;
                    System.out.println("Proporcione el nombre de el objeto que desea borrar, en el caso de la carne el lugar de procedencia");
                    editar = lea.next();
                    int contador = 0;
                    for (Object object3 : lista) {
                        if (object3 instanceof granosbasicos) {
                            if ((((granosbasicos) object3).getnombre()).equals(editar)) {
                                lista.remove(contador);
                                bandera = true;

                            }// fin del segundo if que determina si el nombre del objeto existe
                        }// fin del primer if que determina si es de granos basicos

                        if (object3 instanceof liquidos) {
                            if ((((liquidos) object3).getnombre()).equals(editar)) {

                                bandera = true;
                                lista.remove(contador);
                            }// fin del for instance  of
                        }// fin del equals que determina si es de la clase de liquidos

                        if (object3 instanceof carnesyembutidos) {
                            if ((((carnesyembutidos) object3).getLugar()).equals(editar)) {
                                bandera = true;
                                lista.remove(contador);
                            }// fin del primer if que determina si es el objeto buscado en carnes
                        }// fin de carnes
                        if (object3 instanceof frutasverduras) {
                            if ((((frutasverduras) object3).getNombre()).equals(editar)) {
                                bandera = true;
                                lista.remove(contador);
                            }// fin del if que determina frutas
                        }// fin del instance of de frutas, basicamente fin de frutas
                        contador++;
                    }// fin del fore, basicamente del ejercicio 3

                    if (bandera == false) {
                        System.out.println("Opcion incorrecta no se encuentra en la lista!");
                    }
                }
                break;// fin del ejercicio 3
                case 4:
                    bandera = false;
                    System.out.println("Que objeto desea comprar? ");
                    editar = lea.next();

                    for (Object object : lista) {
                        if (object instanceof granosbasicos) {
                            if ((((granosbasicos) object).getnombre()).equals(editar)) {
                                int comprar = 0;
                                while (comprar <= 0 || comprar < (((granosbasicos) object).getcantquint())) {
                                    System.out.print("Cuanto desea comprar?");
                                    double comprar2 = lea.nextInt();
                                    double comprar3 = comprar2;
                                    if ((((granosbasicos) object).getunidad()) == 1) {
                                        comprar2 = -comprar2 * 0.0045359 + (((granosbasicos) object).getcantquint());
                                        ((granosbasicos) object).setcantquint((float) comprar2);
                                    } else {
                                        comprar2 = -comprar2 * 0.01 + (((granosbasicos) object).getcantquint());
                                        ((granosbasicos) object).setcantquint((float) comprar2);
                                    }
                                    double impuestos = 0.12;
           
                                    impuestos = impuestos * comprar3 * (((liquidos) object).getprecio());
                                    System.out.println("Los impuestos son :" + impuestos);
                                    System.out.println("El costo total es de" + (comprar3 * (((liquidos) object).getprecio()) + impuestos));
                                }// fin del while
                            }
                        }// fin de granos basicos

                        if (object instanceof liquidos) {
                            if ((((liquidos) object).getnombre()).equals(editar)) {
                                int comprar = 0;
                                while (comprar <= 0 || comprar < (((liquidos) object).getcant2())) {
                                    System.out.print("Cuanto desea comprar?");
                                    int comprar2 = lea.nextInt();
                                    comprar2 = -comprar2 + (((liquidos) object).getcant2());
                                    ((liquidos) object).setcant2(comprar2);
                                    double impuestos = 0.12;
                                    comprar2 = comprar2 + (((liquidos) object).getcant2());
                                    impuestos = impuestos * comprar2 * (((liquidos) object).getprecio());
                                    System.out.println("Los impuestos son :" + impuestos);
                                    System.out.println("El costo total es de" + (comprar2 * (((liquidos) object).getprecio()) + impuestos));
                                }// fin del while
                            }
                        }// fin del instance of de liquidos
                        
                        if (object instanceof frutasverduras) {
                            if ((((frutasverduras) object).getNombre()).equals(editar)) {
                                int comprar = 0;
                                while (comprar <= 0 || comprar < (((frutasverduras) object).getCant())) {
                                    System.out.print("Cuanto desea comprar?");
                                    int comprar2 = lea.nextInt();
                                    comprar2 = (int) (-comprar2 + (((frutasverduras) object).getCant()));
                                    ((frutasverduras) object).setCant(comprar2);
                                    double impuestos = 0.12;
                                    comprar2 = (int) (comprar2 + (((frutasverduras) object).getCant()));
                                    impuestos = impuestos * comprar2 * (((frutasverduras) object).getPrecio());
                                    System.out.println("Los impuestos son :" + impuestos);
                                    System.out.println("El costo total es de" + (comprar2 * (((frutasverduras) object).getPrecio()) + impuestos));
                                }// fin del while
                            }
                        }// fin de frutas verduras
                        
                         if (object instanceof carnesyembutidos) {
                            if ((((carnesyembutidos) object).getLugar()).equals(editar)) {
                                int comprar = 0;
                                while (comprar <= 0 || comprar < (((carnesyembutidos) object).getCant())) {
                                    System.out.print("Cuanto desea comprar?");
                                    int comprar2 = lea.nextInt();
                                    comprar2 = (int) (comprar2 - (((carnesyembutidos) object).getCant()));
                                    ((carnesyembutidos) object).setCant(comprar2);
                                    double impuestos = 0.12;
                                    comprar2 = (int) (comprar2 + (((carnesyembutidos) object).getCant()));
                                    impuestos = impuestos * comprar2 * (((carnesyembutidos) object).getPrecio());
                                    System.out.println("Los impuestos son :" + impuestos);
                                    System.out.println("El costo total es de" + (comprar2 * (((carnesyembutidos) object).getPrecio()) + impuestos));
                                }// fin del while
                            }
                        }// fin de frutas carnes
                        
                        
                    }// fin de fore

                    break;

                case 5:
                    System.out.println("Granos basicos");

                    for (Object object : lista) {
                        if (object instanceof granosbasicos) {
                            System.out.println(object);
                        }// fin del segundo if que determina si el nombre del objeto existe
                    }// fin del primer if que determina si es de granos basicos
                    System.out.println("Liquidos");
                    for (Object object : lista) {
                        if (object instanceof liquidos) {
                            System.out.println(object);
                        }// fin del segundo if que determina si el nombre del objeto existe
                    }// fin del primer if que determina si es de granos basicos
                    System.out.println("Carnes y embutidos");
                    for (Object object : lista) {
                        if (object instanceof carnesyembutidos) {
                            System.out.println(object);
                        }// fin del segundo if que determina si el nombre del objeto existe
                    }// fin del primer if que determina si es de granos basicos
                    System.out.println("Frutas y verduras");
                    for (Object object : lista) {
                        if (object instanceof frutasverduras) {
                            System.out.println(object);
                        }// fin del segundo if que determina si el nombre del objeto existe
                    }// fin del primer if que determina si es de granos basicos
                    break;// fin del case 5

                case 6:
                    break;
                default:
                    System.out.println("Seleccione una opcion correcta");

                    break;

            }// fin del switch del menu
        }// fin del primer while
    }// fin del main

}// fin del class
