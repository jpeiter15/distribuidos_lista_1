package exercicio3;

/**
 *
 * @author jpeit
 */
public class MatematicaImpl implements IMatematica {

    @Override
    public double somar(double a, double b) {
        return a + b;
    }

    @Override
    public double subtrair(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplicar(double a, double b) {
        return a * b;
    }

    @Override
    public double dividir(double a, double b) {
        double c;

        try {
            c = a / b;
        } catch (Exception e) {
        }

    }

    @Override
    public double[][] somar(double[][] a, double[][] b) throws MatrizIncompativelException {

        if (a.length != b.length || a[0].length != b[0].length) {
            System.out.println("Matrizes com dimensões diferentes!");
        }

        double z[][] = new double[a.length][b.length];

        for (int l = 0; l < a.length; l++) {
            for (int c = 0; c < a.length; c++) {
                z[l][c] = a[l][c] + b[l][c];
            }
        }
        return z;
    }

    @Override
    public double[][] subtrair(double[][] a, double[][] b) throws MatrizIncompativelException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double[][] multiplicar(double[][] a, double[][] b) throws MatrizIncompativelException {
        double soma = 0;
        double multi = 0;
        double matriz[][] = new double[a.length][b[0].length];
        try {
            for (int l = 0; l < b[0].length; l++) {
                for (int c = 0; c < a.length; c++) {
                    for (int m = 0; m < b.length; m++) {
                        multi = a[l][m] * b[m][c];
                        soma = multi + soma;
                    }
                    matriz[l][c] = soma;
                    multi = 0;
                    soma = 0;
                }
            }
        } catch (Exception e) {
            System.out.println("puts");
        }

        return matriz;
    }

    @Override
    public double[][] multiplicar(double[][] a, double b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
