/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

/**
 *
 * @author jpeit
 */
public class Main {

    private IHoraCerta hc = null;

    public Main() {
        hc = new HoraCertaImpl();
        run();
    }

    private void run() {
        System.out.println(hc.dataAtual());
        System.out.println(hc.horaAtual());
    }

    public static void main(String[] args) {
        Main m = new Main();
    }
}
