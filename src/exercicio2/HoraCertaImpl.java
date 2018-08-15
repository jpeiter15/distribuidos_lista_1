/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author jpeit
 */
public class HoraCertaImpl implements IHoraCerta {

    @Override
    public String dataAtual() {
        String formato = "dd/MM/yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(formato);
        return sdf.format(new Date());
    }

    @Override
    public String horaAtual() {
        String formato = "HH:mm:ss.SSS";
        SimpleDateFormat sdf = new SimpleDateFormat(formato);
        return sdf.format(new Date());
    }

}
