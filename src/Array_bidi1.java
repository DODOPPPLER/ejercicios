public class Array_bidi1 {
    public static void main(String[] args) {
            
        double acomulado;
        double interes=0.10;

        double [][] saldo = new double [6][5];

        for (int i = 0; i < saldo.length; i++) {

            saldo[i][0]=10000;
            acomulado=10000;

            for (int j = 1; j < saldo[2].length; j++) {

                acomulado=acomulado+(acomulado*interes);
                saldo[i][j]=acomulado;
                
            }

            interes=interes+0.01;
        }

        for (double[] columna : saldo) {
            
            System.out.println();

            for (double fila : columna) {

                System.out.printf("%1.2f",fila);
                System.out.print("       ");
                
             }
            
         }

        // for (int i = 0; i < saldo[2].length; i++) {

        //     System.out.println();
        //     for (int j = 0; j < saldo.length; j++) {

        //         System.out.printf("%1.2f",saldo[j][i]);
        //         System.out.print("      ");
                
        //     }
            
        // }
    }
}
