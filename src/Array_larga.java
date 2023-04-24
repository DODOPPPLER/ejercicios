public class Array_larga {
    public static void main(String[] args) {
        
        int [] Matriz_aleatoreos = new int[150];
        int cont=1;

        for (int i = 0; i < Matriz_aleatoreos.length; i++) {
            
            Matriz_aleatoreos[i]=(int)Math.round(Math.random()*300);
        }
        for (int i : Matriz_aleatoreos) {
            
            System.out.println(cont + ": " + i);
            cont += 1;
        }
    }
    
}
