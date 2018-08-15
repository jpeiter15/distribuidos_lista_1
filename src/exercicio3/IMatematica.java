package exercicio3;

/**
 *
 * @author jpeit
 */
public interface IMatematica {

    public double somar(double a, double b);

    public double subtrair(double a, double b);

    public double multiplicar(double a, double b);

    public double dividir(double a, double b)
            throws ArithmeticException;

    public double[][] somar(double a[][], double b[][])
           throws MatrizIncompativelException;

    public double[][] subtrair(double a[][], double b[][])
            throws MatrizIncompativelException;

    public double[][] multiplicar(double a[][], double b[][])
            throws MatrizIncompativelException;

    public double[][] multiplicar(double a[][], double b);
}
