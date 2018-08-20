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
public  class MainStringUtil {
    
    private IStringUtil strUtil = null;

    public MainStringUtil() {
        strUtil = new StringUtilImpl();
        run();
    }

    private void run() {
        String mensagem = "Sistemas Distribuídos é legal !!!";
        System.out.println(strUtil.ecoar(mensagem));
        System.out.println(strUtil.inverter(mensagem));
        System.out.println(strUtil.inverterPalavra("Sistemas Distribuidos"));
        System.out.println(strUtil.isPalindroma("soccoram me subi no onibus em marrocos"));
        System.out.println(strUtil.isPangram("The quick brown fox jumps over the lazy dog"));
    }

    public static void main(String[] args) {
        MainStringUtil msu = new MainStringUtil();
    }

}
