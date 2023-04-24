import javax.swing.*;
public class EntradaSalida2 {
    public static void main(String[] args) {
        
        String Nombre_usuario=JOptionPane.showInputDialog("Introduce Tu Nombre Por Favor:");
        String Edad=JOptionPane.showInputDialog("Introduce La Edad Porfavor");
        int Edad_usuario=Integer.parseInt(Edad);
        
        System.out.println("Hola " + Nombre_usuario + " el año que viene tendrás " + (Edad_usuario + 1) + " años.");

    }
    
}
