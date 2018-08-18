package exercicio3;

public class Main {

    private IMatematica mat = null;

    public Main() {
        mat = new MatematicaImpl();
        iniciar();
    }

    private void iniciar() {
        double a = 6;
        double b = 2;

        double ma[][] = {{1, 0, 2},
                        {-1, 3, 1}};
                        
        double mb[][] = {{1, 0, 2}, 
                        {-1, 3, 1}};
        
        double mc[][] = {{3, 1}, 
                        {2, 1}, 
                        {1, 0}};
        
        double mx[][] = {};

        double md[][] = {{1, 0, 2, 0},
                        {-1, 3, 1, 2}};

        System.out.println(a + " + " + b + " = " + mat.somar(a, b));
        System.out.println(a + " - " + b + " = " + mat.subtrair(a, b));
        System.out.println(a + " x " + b + " = " + mat.multiplicar(a, b));

        try {
            System.out.println(a + " / " + b + " = " + mat.dividir(a, b));
            System.out.println(a + " / 0  = " + mat.dividir(a, 0));

        } catch (ArithmeticException e) {
            System.out.println("Houve divisão por zero\n");
        }

        System.out.println();
        System.out.println("Matriz A");
        imprimeMatriz(ma);
        
        System.out.println("Matriz B");
        imprimeMatriz(mb);

        System.out.println("\n\nMatriz Soma");
        imprimeMatriz(mat.somar(ma, mb));

        System.out.println("\n\nMatriz Subtracao");
        imprimeMatriz(mat.subtrair(ma, mb));

        System.out.println("\nMatriz A");
        imprimeMatriz(ma);

        System.out.println("Matriz C");
        imprimeMatriz(mc);

        System.out.println("Matriz Multiplicacao A x C");

        try {
            imprimeMatriz(mat.multiplicar(ma, mc));
        } catch (MatrizIncompativelException ex) {
            System.out.println("As Matrizes são diferentes");
        }

        System.out.println("Matriz Multiplicacao A x B");

        try {
            imprimeMatriz(mat.multiplicar(ma, mb));
        } catch (MatrizIncompativelException ex) {
            System.out.println("Número de colunas deve ser igual o número de linhas!");
        }

        System.out.println("Matriz A");
        imprimeMatriz(ma);
        
        System.out.println("Matriz Multiplicacao Escalar 2");
        imprimeMatriz(mat.multiplicar(ma, 2));
    }

    private void imprimeMatriz(double m[][]) {
        for (int lin = 0; lin < m.length; lin++) {
            for (int col = 0; col < m[lin].length; col++) {
                System.out.print(m[lin][col] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Main apl = new Main();
    }
}
