/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

import java.util.ArrayList;

public class IDNSImpl implements IDNS {

    private static final ArrayList<RegistroDNS> DNS_TABLE = new ArrayList<>();

    @Override
    public void bind(String dominio, String IP, int porta) throws DominioJaRegistrado {
        RegistroDNS dnsr = new RegistroDNS(dominio, IP, porta);
        if (DNS_TABLE.indexOf(dnsr) != -1) {
            throw new DominioJaRegistrado();
        } else {
            DNS_TABLE.add(dnsr);
        }
    }

    @Override
    public String lookup(String dominio) throws DominioNaoRegistrado {
        RegistroDNS regDNS = null;
        int idx = DNS_TABLE.indexOf(new RegistroDNS(dominio));

        if (idx == -1) {
            throw new DominioNaoRegistrado();
        }

        regDNS = DNS_TABLE.get(idx);

        return regDNS.toString();
    }

    @Override
    public void unbind(String dominio) throws DominioNaoRegistrado {
        RegistroDNS dnsr = null;
        int idx = DNS_TABLE.indexOf(new RegistroDNS(dominio));

        if (idx == -1) {
            throw new DominioNaoRegistrado();
        }

        DNS_TABLE.remove(idx);
    }

    @Override
    public String[] list() {
        String[] ret = new String[DNS_TABLE.size()];

        for (int i = 0; i < DNS_TABLE.size(); i++) {
            ret[i] = DNS_TABLE.get(i).getDominio();
        }

        return ret;
    }

}
