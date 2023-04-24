import javax.swing.*;
public class EntradaNumeros {
    public static void main(String[] args) {

        double num1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero: "));
        // parse = analizar gramaticalmente

        System.out.println("La Raiz de " + num1 + " es ");

        System.out.printf("%1.20f", Math.sqrt(num1));
        System.out.println("\n1 \n2");


        double x = 10000.0;

        System.out.printf("%1.2f", x/3);


    }
    
}
