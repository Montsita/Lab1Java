import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1. Escriba un metodo Java que devuelva la diferencia entre los valores más grande y más pequeño de una matriz de números enteros. La longitud de la matriz debe ser al menos 1.


        int[] numbers = {3, 4, 10, 60, 7, 8, 13, 22};

        System.out.println(numMinAndMax(numbers));
        System.out.println(smallestElements(numbers));
        System.out.println("The result of the function with the given values is: " + mathexpres());
    }

    public static String numMinAndMax(int[] numbers) {
        int numMax = Integer.MIN_VALUE; // le paso min_Value(que representa el valor minimo que puede haber en un int) como valor principal para asegurarme que cualquier valor que haya en el array sea mayor, y asi el max se va actualizando con los numero mayores que va encontrando el array
        int numMin = Integer.MAX_VALUE; // Sigue el mismo prodecimiento que min_value y se va actualizando con los valores mas pequeños

        if (numbers.length <= 1) {
            return "Array must contain at least one element.";
        }

        for (int number : numbers) {
            if (number > numMax) {
                numMax = number;
            }
            if (number < numMin) {
                numMin = number;
            }
        }
        return "The smallest number in the array is: " + numMin + " and the largest number is: " + numMax;
    }

    //2. Escriba un metodo Java que encuentre el elemento más pequeño y el segundo más pequeño de una matriz dada y los imprima en la consola.
    public static String smallestElements(int[] numbers) {
        int numMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number < numMin) {
                secondMin = numMin;
                numMin = number;

            }
            if (number < secondMin && number != numMin) {
                secondMin = number;

            }
        }

        return "The smallest number in the array is: " + numMin + " and the second smallest number is: " + secondMin;
    }

    //3.Escriba un metodo Java que calcule el resultado de la siguiente expresión matemática, donde  x y  y son dos variables que se han preestablecido en su código
    public static float mathexpres() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame el valor de 'x' tiene que ser un numero sin decimales");
        int x = scanner.nextInt();

        System.out.println("Dame el valor de 'y' tiene que ser un numero sin decimales");
        int y = scanner.nextInt();

        float insideP = (4.0f * y / 5.0f) - x;
        insideP = insideP * insideP;
        float result = (x*x) + insideP;

        return result;
    }

}

