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
public class StringUtilImpl implements IStringUtil {

    @Override
    public String ecoar(String str) {
        return str;

    }

    @Override
    public String inverter(String str) {
        String ret = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            ret += str.charAt(i);
        }
        return ret;
    }

    @Override
    public String inverterPalavra(String str) {
        String palavras[] = str.split(" ");
        String ret = "";

        for (String palavra : palavras) {
            ret += inverter(palavra) + " ";
        }
        return ret;
    }

    @Override
    public boolean isPalindroma(String str) {
        String strMinuscula = str.toLowerCase().replaceAll(" ", "");
        String strInvertida = inverter(strMinuscula).replaceAll(" ", "");
        return strMinuscula.equals(strInvertida);
    }
    
    @Override
    public boolean isPangram(String str) {
        String alf = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String strUpp = str.toUpperCase();
        
        for (int i = 0; i < alf.length(); i++) {
            if(!strUpp.contains(alf.substring(i, i+1))){
                return false;
            }
        }
        
        return true;
    }

}
