/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

/**
 *
 * @author jpeit
 */
public class Main {
    
    private IStringUtil strUtil = null;

    public Main() {
        strUtil = new StringUtilImpl();
        run();
    }

    private void run() {
        String mensagem = "Sistemas Distribuídos é legal !!!";
        System.out.println("ecoar " + strUtil.ecoar(mensagem));
        System.out.println("inverter " + strUtil.inverter(mensagem));
        System.out.println("inverterPalavra " + strUtil.inverterPalavra(mensagem));
        System.out.println("isPalindroma1 " + strUtil.isPalindroma(mensagem));
        System.out.println("isPalindroma2 " + strUtil.isPalindroma("socorram me subi no onibus em marrocos"));
        System.out.println("isPangram1 " + strUtil.isPangram(mensagem));
        System.out.println("isPangram2 " + strUtil.isPangram("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
        System.out.println("isPangram3 " + strUtil.isPangram("The quick brown fox jumps over the lazy dog"));
    }

    public static void main(String[] args) {
        Main m = new Main();
    }
}
