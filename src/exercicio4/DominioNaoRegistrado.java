/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

import java.net.UnknownHostException;

/**
 *
 * @author jpeit
 */
class DominioNaoRegistrado extends UnknownHostException {

    public DominioNaoRegistrado(String string) {
        super(string);
    }

    public DominioNaoRegistrado() {
    }

}