/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

/**
 *
 * @author jpeit
 */
public class RegistroDNS {

    private String dominio;
    private String ip;
    private int porta;

    public RegistroDNS() {
    }

    public RegistroDNS(String dominio, String ip, int porta) {
        this.dominio = dominio;
        this.ip = ip;
        this.porta = porta;
    }

    RegistroDNS(String dominio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPorta() {
        return porta;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }

    @Override
    public String toString() {
        return "Domínio: " + dominio + "\nIP: " + ip + "\nPorta:" + porta;
    }

}
