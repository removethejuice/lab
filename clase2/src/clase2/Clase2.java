package clase2;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import java.util.Scanner;
import javax.swing.JColorChooser;

public class Clase2 {

    static Scanner lea = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion_menu = 0;
        ArrayList lista = new ArrayList();
        ArrayList lista2 = new ArrayList();
        while (opcion_menu != 8) {
            System.out.println("1. Agregar un aula\n 2.Agregar sillas \n 3.Listar aulas \n4. Modificar el datashow de un aula\n5.Modificar la silla de un aula\n6. Eliminar Silla \n7. Eliminar Aula\nSalir");
            opcion_menu = lea.nextInt();
            switch (opcion_menu) {
                case 1:
                    System.out.println("Seleccione el largo de la pizarra");
                    double largo = lea.nextDouble();
                    System.out.println("Seleccione el ancho de la pizarra");
                    double ancho = lea.nextDouble();
                    System.out.println("Seleccione el color de la pizarra");
                    Color color = JColorChooser.showDialog(null, "", Color.black);
                    System.out.println("Agregue la fecha");
                    Date fecha = new Date();
                    Pizarra pizarra = new Pizarra(largo, ancho, color, fecha);

                    // fin de pizarra 1
                    System.out.println("Seleccione el largo de la pizarra");
                    largo = lea.nextDouble();
                    System.out.println("Seleccione el ancho de la pizarra");
                    ancho = lea.nextDouble();
                    System.out.println("Seleccione el color de la pizarra");
                    color = color = JColorChooser.showDialog(null, "", Color.black);
                    System.out.println("Agregue la fecha");
                    fecha = new Date();
                    Pizarra pizarra2 = new Pizarra(largo, ancho, color, fecha);

                    // fin de pizarra 2
                    System.out.println("Seleccione el codigo del datashow");
                    int codigo = lea.nextInt();
                    System.out.println("Seleccione el color del datashow");
                    JColorChooser colorChooser = new JColorChooser();
                    color = JColorChooser.showDialog(null, "", Color.black);
                    System.out.println("Seleccione la resolucion del datashow");
                    String resolucion = lea.next();

                    Datashow data = new Datashow(codigo, color, resolucion);

                    // fin de datashow
                    System.out.println("Proporcione el numero del aula");
                    int numero = lea.nextInt();
                    lista.add(new aula(numero, pizarra, pizarra2, data));
                    break; // fin de agregar aula 

                case 2:

                    char conf = 0;
                    boolean bandera = false;
                    System.out.println("Seleccione el numero del aula al que desea agregar aulas");
                    int conf2 = lea.nextInt();
                    for (Object object : lista) {
                        if (((aula) object).getNum() == conf2) {
                            bandera = true;
                            while (conf != 'n') {

                                System.out.println("Proporcione el codigo");
                                codigo = lea.nextInt();
                                System.out.println("Proporcione el color");
                                color = JColorChooser.showDialog(null, "", Color.black);
                                System.out.println("Proporcione el material");
                                String material = lea.next();
                                Sillas temp = new Sillas(codigo, color, material);
                                System.out.println("Presione n si no desea continuar agregando sillas");
                                conf = lea.next().charAt(0);
                                lista2.add(temp);
                                (((aula) object)).setSillas(lista2);
                                lista2.remove(0);
                            }
                        }// fin del if
                    }// fin del fore
                    if (bandera == false) {
                        System.out.println("El aula con ese numero no existe");
                    }

                    break;// fin del case 2 agregar sillas
                case 3:
                    for (Object object : lista) {
                        System.out.println(object);
                    }

                    break;
                case 4:
                    bandera = false;
                    System.out.println("Seleccione el numero del aula que desea editar");
                    conf2 = lea.nextInt();
                    for (Object object : lista) {
                        if (((aula) object).getNum() == conf2) {
                            bandera = true;
                            System.out.println("Que desea editar del datashow?\n 1. Codigo \n 2. Color \n 3. Resolucion");
                            int opcion = lea.nextInt();
                            switch (opcion) {
                                case 1:
                                    System.out.println("Proporcione el codigo nuevo");
                                    codigo = lea.nextInt();
                                    (((aula) object).getD()).setCodigo(codigo);
                                    break;
                                case 2:
                                    System.out.println("Proporcione el color nuevo");
                                    color = JColorChooser.showDialog(null, "", Color.black);
                                    (((aula) object).getD()).setC(color);
                                    break;
                                case 3:
                                    System.out.println("Proporcione la resolucion nueva");
                                    resolucion = lea.next();
                                    (((aula) object).getD()).setResolucion(resolucion);
                                    break;
                                default:
                                    System.out.println("Opcion incorrecta");
                                    break;
                            }// fin del switch
                        }// fin del if

                    }// fin del fore
                    if (bandera == false) {
                        System.out.println("El aula con ese numero no existe");
                    }
                    break;

                case 5:
                    conf = 0;
                    bandera = false;
                    boolean bandera2 = false;
                    System.out.println("Seleccione el numero de aula del que desea editar sillas ");
                    conf2 = lea.nextInt();
                    for (Object object : lista) {
                        if (((aula) object).getNum() == conf2) {
                            bandera = true;

                            System.out.println("Que codigo de silla desea editar?");
                            int cod2 = lea.nextInt();
                            for (int i = 0; i < (((aula) object).getSillas()).size(); i++) {
                                if ((((aula) object).getSillas()).get(i).getCod() == cod2) {
                                    bandera2 = true;
                                    System.out.println("Que desea editar del datashow?\n 1. Codigo \n 2. Color \n 3. Material");
                                    int opcion = lea.nextInt();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("Proporcione el codigo");
                                            codigo = lea.nextInt();
                                            (((aula) object).getSillas()).get(i).setCod(codigo);
                                            break;

                                        case 2:
                                            System.out.println("Proporcione el color");
                                            color = JColorChooser.showDialog(null, "", Color.black);
                                            (((aula) object).getSillas()).get(i).setColor(color);

                                            break;

                                        case 3:
                                            System.out.println("Proporcione el material");
                                            String material = lea.next();
                                            (((aula) object).getSillas()).get(i).setMaterial(material);

                                            break;

                                        default:
                                            System.out.println("Opcion equivocada");
                                    }
                                }
                            }// fin del for

                            if (bandera2 == false) {
                                System.out.println("La silla con ese codigo no existe");
                            }

                        }// fin del if
                    }// fin del fore
                    if (bandera == false) {
                        System.out.println("El aula con ese numero no existe");
                    }
                    break;

                case 6:

                    conf = 0;
                    bandera = false;
                    bandera2 = false;
                    System.out.println("Seleccione el numero de aula del que desea editar sillas ");
                    conf2 = lea.nextInt();
                    for (Object object : lista) {
                        if (((aula) object).getNum() == conf2) {
                            bandera = true;

                            System.out.println("Que codigo de silla desea editar?");
                            int cod2 = lea.nextInt();
                            for (int i = 0; i < (((aula) object).getSillas()).size(); i++) {
                                if ((((aula) object).getSillas()).get(i).getCod() == cod2) {
                                    bandera2 = true;
                                    

                                       (((aula) object).getSillas()).remove(i);
                                    
                                }
                            }// fin del for

                            if (bandera2 == false) {
                                System.out.println("La silla con ese codigo no existe");
                            }

                        }// fin del if
                    }// fin del fore
                    if (bandera == false) {
                        System.out.println("El aula con ese numero no existe");
                    }
                    break;
                    
                case 7:
                    bandera = false;
                    System.out.println("Seleccione el numero del aula que desea eliminar");
                    conf2 = lea.nextInt();
                    int contador = 0;
                    for (Object object : lista) {
                        if (((aula) object).getNum() == conf2) {
                            bandera = true;
                            lista.remove(contador);
                        }// fin del if
                        contador++;
                    }// fin del fore
                    if (bandera == false) {
                        System.out.println("El aula con ese numero no existe");
                    }
                    break;
                default:
                    System.out.println("Opcion equivocada");
                    break;

            }// fin del switch del menu principal

        }// fin del while opcion_menu

    }// fin del main

}
