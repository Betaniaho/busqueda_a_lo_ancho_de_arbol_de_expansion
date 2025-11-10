/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recorricoarbolanchura;
/**
 *
 * @author betania
 */
public class RecorricoArbolAnchura {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //vertices
        String v = "abcdefghi"; 
        //aristas
        String E[] = {"ec ", "ef ", "eg ", "cd", "fh ", "gi ", "db", "ba"};
        bla(v.toCharArray(), E);
    }
/*** Este algoritmo encuentra un árbol de expansión
*usando el método de búsqueda a lo ancho.
* @param V, Vértices ordenados
* @param E, Gráfica conexa G
*Salida : Árbol de expansión T.
*/
    public static void bla(char V[], String E[]) {
        String salida = E[0].charAt(0) + ",";
        for (String E1 : E) {
            for (int y = 0; y < V.length; y++) {
                char padre = V[y];
                if (padre == E1.charAt(0)) {
                    salida += E1.charAt(1)+",";
                }
            }
        }
        System.out.println("Árbol de expansión T: \n" + salida);
    }
}
