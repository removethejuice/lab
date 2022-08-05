package examen2_diegochave.z;

import java.util.ArrayList;

public class Kaprekar {

    public int arreglo[] = new int[4];
    public String problema = "";
    public ArrayList<String> lista = new ArrayList();

    public Kaprekar(String problema) {
        this.problema = problema;
    }
    
    public int [] getarreglo (){
    
    return arreglo;
    }
    
     public String getproblema (){
    
    return problema;
    }
     
      public ArrayList<String>  getlista (){
    
    return lista;
    }

    public int[] arreglomayor(int[] arreglo) {
        int[] arreglomayor = new int[4];
        int numero = 0;
        int contador = 0;
        int contador2 = 0;

        for (int w = 0; w < 4; w++) {
            numero = 0;

            for (int i = 0; i < 4; i++) {

                if (numero < arreglo[i]) {

                    numero = arreglo[i];
                    contador = i;
                }

            }// fin del segundo for
            arreglomayor[w] = numero;
            arreglo[contador] = -1;
            contador2++;
        }// fin del primer for

        return arreglomayor;
    }// fin de arreglo mayor

    public int[] arreglomenor(int[] arreglo) {
        int[] arreglomenor = new int[4];
        int numero = 10;
        int contador = 0;

        for (int w = 0; w < 4; w++) {
            numero = 10;

            for (int i = 0; i < 4; i++) {

                if (numero > arreglo[i]) {

                    numero = arreglo[i];
                    contador = i;
                }

            }// fin del segundo for
            arreglomenor[w] = numero;
            arreglo[contador] = 10;
        }// fin del primer for
        return arreglomenor;
    }// fin de arreglo menor

    public void imprimir(int[] arreglo) {

        for (int i = 0; i < 4; i++) {

            System.out.print("   " + arreglo[i]);
        }
    }

    public int[] intarreglo() {
        int[] arreglo = new int[4];
        int numero = Integer.parseInt(problema);

        arreglo[0] = numero / 1000;
        arreglo[1] = numero / 100 - arreglo[0] * 10;
        arreglo[2] = numero / 10 - arreglo[0] * 100 - arreglo[1] * 10;
        arreglo[3] = numero - arreglo[0] * 1000 - arreglo[1] * 100 - arreglo[2] * 10;

        return arreglo;
    }

    public String arregloint(int[] arreglo) {
        String problema = "";
        for (int i = 0; i < arreglo.length; i++) {
            problema = problema + arreglo[i];
        }

        return problema;
    }

    public ArrayList<String> listado() {

        boolean bandera = true;
        int[] arreglo3 = new int[4];
        while (bandera == true) {
            int[] arreglo1 = arreglomayor(intarreglo());
            int[] arreglo2 = arreglomenor(intarreglo());

            for (int i = 0; i < 4; i++) {

                arreglo3[i] = arreglo1[i] - arreglo2[i];
            }
            lista.add(arregloint(arreglo3));

            if (arreglo3[0] == 6 && arreglo[1] == 1 && arreglo[2] == 7 && arreglo[3] == 4) {
                bandera = false;

            }// fin del if
        }// fin del while

        return lista;
    }

    public ArrayList<String> listado2() {
        ArrayList<String> lista2 = new ArrayList();
        boolean bandera = true;
        String listax = "";
        int numero3 = 0;
        int[] arreglo1 = arreglomayor(intarreglo());
        int[] arreglo2 = arreglomenor(intarreglo());
        int[] arreglo3 = new int[4];
        while (bandera == true) {

            numero3 = Integer.parseInt(arregloint(arreglo1)) - Integer.parseInt(arregloint(arreglo2));
            arreglo3[0] = numero3 / 1000;
            arreglo3[1] = numero3/ 100 - arreglo3[0] * 10;
            arreglo3[2] = numero3 / 10 - arreglo3[0] * 100 - arreglo3[1] * 10;
            arreglo3[3] = numero3 - arreglo3[0] * 1000 - arreglo3[1] * 100 - arreglo3[2] * 10;

            arreglo1 = arreglomayor(arreglo3);
            arreglo2 = arreglomenor(arreglo3);
            
            listax = listax + arregloint(arreglo1);
            listax = listax + " - ";
            listax = listax + arregloint(arreglo2);
            listax = listax + "  =  ";
            listax = listax + numero3;
            System.out.println(listax);
            lista2.add(listax);

            if (numero3 == 6174) {
                bandera = false;

            }// fin del if
        }// fin del while

        return lista2;
    }

    public void imprimirlista(ArrayList<String> lista2) {

        for (int i = 0; i < lista2.size(); i++) {
            System.out.println(lista2.get(i));
        }

    }

}// fin del class

