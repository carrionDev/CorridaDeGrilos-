/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grilo3;

import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class Grilo3 {

    public static int numGrilo = 3;
    //public static int [] quantGrilo = new int [numGrilo];
    //public static int [] quantPulo = new int [numGrilo];
    //public static int posicao = 1;   
    public static int finale = 40;
    public static boolean acabou = false;

    //public static Grilo grilo; 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Grilo> listaDeGrilos = new ArrayList();
        for (int i = 0; i < numGrilo; i++) {
            listaDeGrilos.add(new Grilo("Grilo " + Integer.toString(i)));
        }

        for (int i = 0; i < listaDeGrilos.size(); i++) {
            listaDeGrilos.get(i).start();
        }

        while (!acabou) {
            for (int i = 0; i < listaDeGrilos.size(); i++) {
                Grilo grilo = listaDeGrilos.get(i);
                System.out.println("O grilo " + grilo.getNome() + " percorreu " + Integer.toString(grilo.getDistPulada()) + " com " + Integer.toString(grilo.getQuantPulo()) + " pulos ");

                if (grilo.getDistPulada() >= finale) {
                    System.out.println("O grilo " + grilo.getNome() + " chegou no final com " + Integer.toString(grilo.getQuantPulo()) + " pulos ");
                    grilo.setFim(true);
                    listaDeGrilos.remove(i);
                    if (listaDeGrilos.isEmpty()) {
                        acabou = true;
                     //  break;
                    }

                }
            }
       //     for (int i = 0; i < listaDeGrilos.size(); i++) {
       //         listaDeGrilos.get(i).setFim(true);
      //      }

            // Grilo [] threads = new Grilo[threadMax];
            //Pra aparecer todos os grilos, subistituir o nElements por Max
            //for (int i = 0; i < threadMax; i++){
            //threads[i] = new Grilo(finale, quantGrilo, quantPulo, posicao);
            //threads[i].start();
            //}
            // (finale, quantGrilo, quantPulo, posicao);
            //grilo = new Grilo(finale, quantGrilo, quantPulo, posicao);
            //grilo.pulo();
        }

    }
}
