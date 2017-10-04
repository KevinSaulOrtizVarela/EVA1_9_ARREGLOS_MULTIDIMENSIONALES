/**
 * @author 16550549
 */
public class Principal {
 
    public static void main(String[] args) {
        //ARREGLOS MULTIDIMENSIONALES ARREGLOS DE ARREGLOS
        //MATRIZ DE 2 X 2 DIMENSIONES [FILAS][COLUMNAS]
        int aiMAtriz[][] = new int [2][2];
        for (int i = 0; i < 2; i++) { //CADA FILA
            for (int j = 0; j < 2; j++) { //CADA COLUMNA
                aiMAtriz [i][j] = (int) (Math.random() *10) +1;
            }
        }
        //IMPRIMIR
        for (int i = 0; i < 2; i++) { //cada fila
            for (int j = 0; j < 2; j++) {//Cada columna
                System.out.print("["  + aiMAtriz [i][j]  + "]");
            }
            System.out.println("");//nos cambia de linea
        }
        // USANDO FOR EACH
        //FOR ANIDADOS POR CADA DIMENSIÓN EN ESTE CASO SON 2
        for (int[] aiMAtriz1 : aiMAtriz) { //CADA FILA ---> ARREGLO
           //USANDO OTRO FOR EACH // RECORRER COLUMNAS
            for (int b : aiMAtriz1) { 
                System.out.print("["+ b +"]");
            }
            System.out.println("");    
        }
    }
    
}
