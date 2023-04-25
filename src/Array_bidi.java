public class Array_bidi {
    public static void main(String[] args) {
    
        int [][] matriz_bidi={
            {10,15,18,19,21},
            {5,25,37,41,15},
            {7,19,32,14,90},
            {82,2,7,40,27}
        };

        // for (int[] horizontal : matriz_bidi) {
            
        //     System.out.println();

        //     for (int vertical: horizontal) {

        //         System.out.print(vertical + " ");    
                
        //     }
            
        // }
        
        for (int i = 0; i < matriz_bidi[2].length; i++) {

            System.out.println();

            for (int j = 0; j < matriz_bidi.length; j++) {

                 System.out.print(matriz_bidi[j][i] + " ");
            }
            
        }
    }
}