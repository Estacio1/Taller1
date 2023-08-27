package taller1;

import java.util.Arrays;

/**
 *
 * @author Edward
 */
public class nuevetres {
    public static void main(String[] args){
        int[][] notas = {
            {70, 60, 40, 30, 90},
            {80, 75, 45, 35, 95},
            {85, 66, 49, 33, 91},
            {77, 10, 38, 20, 100},
            {74, 69, 43, 39, 99},            
        };
        calcularMedias(notas);
        ordenarPorNotaMedia(notas);
        System.out.println("Notas medias individuales ordenadas: ");
        for(int i = 0; i < notas.length; i++){
            System.out.println("Alumno "+(i+1)+":"+Arrays.toString(notas[i]));
        }
    }

    private static void calcularMedias(int[][] notas) {
        int numAlumnos = notas.length;
        int numAsignaturas = notas[0].length;
        double[]mediasIndividuales = new double[numAlumnos];
        double[]mediasAsignaturas = new double[numAsignaturas];
        double mediaClase = 0.0;
        
        for(int i = 0; i < numAlumnos; i++){
            int suma = 0;
            for(int j = 0; j < numAsignaturas; j++){
                suma += notas[i][j];
                mediasAsignaturas[j] += notas[i][j];
            }
            mediasIndividuales[i] = suma / (double) numAsignaturas;
            mediaClase += mediasIndividuales[i];
        }
        mediaClase /= (double) numAlumnos;
        System.out.println("Medias individuales: "+Arrays.toString(mediasIndividuales));
        System.out.println("Medias Asignaturas: "+Arrays.toString(mediasAsignaturas));
        System.out.println("Medias toal de la clase: "+mediaClase);
    }

    private static void ordenarPorNotaMedia(int[][] notas) {
       int numAlumnos = notas.length;
       int numAsignaturas = notas[0].length;
       int intervalo = numAlumnos / 2;
       while (intervalo > 0){
           for(int i = intervalo; i < numAlumnos; i++){
               int j = i;
               while(j >= intervalo && notas[j - intervalo][0]<notas[j][0]){
                   int[] temp = notas[j];
                   notas[j] = notas[j - intervalo];
                   notas[j - intervalo] = temp;
                   j -= intervalo;
               }
           }
           intervalo /= 2;
       } 
    }
}