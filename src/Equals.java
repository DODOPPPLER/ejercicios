import javax.swing.*;
public class Equals {
    public static void main(String[] args) {

        String clave="Kevin", contrasea="";

        while (clave.equals(contrasea)==false) {

            contrasea=JOptionPane.showInputDialog("Ingrese la contraseña");

            if (clave.equals(contrasea)==false) {
                
                System.out.println("Contraseña incorrecta intente nuevamente");
            }            
        }
        System.out.println("Bienvenido");

        int aleatoreo=(int)(Math.random()*100);
        System.out.println(aleatoreo); 
    }
}
