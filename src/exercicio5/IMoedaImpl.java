/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

import java.util.Random;

public class IMoedaImpl implements IMoeda {

    private int contCara = 0;
    private int contCoroa = 0;

    @Override
    public int arremessar() {
        int moeda = new Random().nextInt(1 - 0 + 1);

        if (moeda == 1) {
            contCoroa++;
        } else {
            contCara++;
        }
        return moeda;
    }

    @Override
    public int getContadorCara() {
        return contCara;
    }

    @Override
    public int getContadorCoroa() {
        return contCoroa;
    }

    @Override
    public void zerarContadores() {

        System.out.println("Nº de Coroas até agora:" + getContadorCoroa());
        System.out.println("Nº de Caras até agora:" + getContadorCara());
        contCara = 0;
        contCoroa = 0;
    }

}
