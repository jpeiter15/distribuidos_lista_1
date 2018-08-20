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
public interface IDNS {

    public void bind(String dominio, String IP, int porta)
            throws DominioJaRegistrado;

    public String lookup(String dominio)
            throws DominioNaoRegistrado;

    public void unbind(String dominio)
            throws DominioNaoRegistrado;

    public String[] list();
}
