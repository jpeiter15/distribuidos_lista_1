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
        if (b == 0) {
            throw new ArithmeticException("Não pode dividir por zero");
        }
        return a / b;
    }

    @Override
    public double[][] somar(double[][] a, double[][] b) throws MatrizIncompativelException {

        if (a.length != b.length || a[0].length != b[0].length) {
            System.out.println("Matrizes com dimensões diferentes!");
        }

        double m[][] = new double[a.length][b[0].length];

        for (int l = 0; l < a.length; l++) {
            for (int c = 0; c < a[0].length; c++) {
                m[l][c] = a[l][c] + b[l][c];
            }
        }
        return m;
    }

    @Override
    public double[][] subtrair(double[][] a, double[][] b) throws MatrizIncompativelException {

        if (a.length != b.length || a[0].length != b[0].length) {
            System.out.println("Matrizes com dimensões diferentes!");
        }

        double z[][] = new double[a.length][b[0].length];

        for (int l = 0; l < a.length; l++) {
            for (int c = 0; c < a[0].length; c++) {
                z[l][c] = a[l][c] - b[l][c];
            }
        }
        return z;
    }

    @Override
    public double[][] multiplicar(double[][] a, double[][] b) throws MatrizIncompativelException {
        double soma = 0;
        double multi = 0;
        double res[][] = new double[a.length][b[0].length];

        if (a[0].length != b.length) {
            throw new MatrizIncompativelException("Nº de colunas de A é diferente do nº de linhas de B!");
        } else {

            for (int i = 0; i < b[0].length; i++) {
                for (int j = 0; j < a.length; j++) {
                    for (int k = 0; k < b.length; k++) {
                        multi = a[i][k] * b[k][j];
                        soma = multi + soma;
                    }
                    res[i][j] = soma;
                    multi = 0;
                    soma = 0;
                }
            }
        }
        return res;
    }

//    @Override
    public double[][] multi(double[][] a, double[][] b) throws MatrizIncompativelException {

        double[][] ret = new double[a.length][b[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    ret[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return ret;
    }

    @Override
    public double[][] multiplicar(double[][] a, double b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (a[i][j] * b);
            }
        }
        return a;
    }

}
