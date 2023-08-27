package taller1;

/**
 *
 * @author Edward
 */
import java.util.Arrays;
public class nuevedos {
    public static void main(String[] args){
        double[] vector = {1.0, 2.5, 3.9, 4.8, 5.6};
        double mediano = calculateMedian(vector);
        
        System.out.println("El vector original: "+Arrays.toString(vector));
        System.out.println("La mediana es: "+mediano);
    }

    private static double calculateMedian(double[] vector) {
        Arrays.sort(vector);
        int middleIndex = vector.length/2;
        return vector[middleIndex];
    }
}
