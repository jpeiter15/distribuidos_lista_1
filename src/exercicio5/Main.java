/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

/**
 *
 * @author jpeit
 */
public class Main {

    private IMoeda moeda = null;

    public Main() {
        moeda = new IMoedaImpl();
        run();
    }

    public static void main(String[] args) {
        Main main = new Main();
    }

    private void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Round " + (i + 1) + ": " + moeda.arremessar());
            System.out.println("Nº de Caras: " + moeda.getContadorCara());
            System.out.println("Nº de Coroas :" + moeda.getContadorCoroa());
            System.out.println();

            if (i + 1 == 50) {
                moeda.zerarContadores();
                System.out.println();
            }
        }
    }
}
