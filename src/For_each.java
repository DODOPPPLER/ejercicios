import javax.swing.*;
public class For_each {
    public static void main(String[] args) {
        
        String[] mi_matriz=new String[8];

        for (int i = 0; i < mi_matriz.length; i++) {
            mi_matriz[i]=JOptionPane.showInputDialog("Digite el nombre de algún pais");
        }

        // mi_matriz[0]="España";
        // mi_matriz[1]="Mexico";
        // mi_matriz[2]="Colombia";
        // mi_matriz[3]="Perú";
        // mi_matriz[4]="Chile";
        // mi_matriz[5]="Argentina";
        // mi_matriz[6]="Ecuador";
        // mi_matriz[7]="Venezuela";

        // for (int i = 0; i < mi_matriz.length; i++) {
            
        //     System.out.println("País " + (i+1) + " " + mi_matriz[i]);
        // }

        for(String i:mi_matriz){

            System.out.println(i);
        }
    }
    
}
