package grilo3;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Acer
 */
public class Grilo extends Thread {

    public int[] quantGrilo;
    public int quantPulo;
    public int posicao;
    public int finale;
    public int distPulada = 0;
    public boolean Fim = false;
    public String nome;

    Grilo(String nome) {
        this.nome = nome;
    }
    //nana feia

    @Override
    public void run() {

        while (!Fim) {
            int jump = (int) (Math.random() * 20);
            this.distPulada += jump;
           // System.out.println("O Grilo pulou " + jump + "cm e já percorreu " + this.distPulada + "cm");
            this.quantPulo++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Grilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public String getNome() {
        return this.nome;
    }

    public int getQuantPulo() {
        return this.quantPulo;
    }

    public int getDistPulada() {
        return this.distPulada;
    }

    public void setFim(boolean Fim) {
        this.Fim = Fim;
  

    }

}
