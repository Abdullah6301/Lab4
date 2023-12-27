import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class CodeReuse{
    Scanner sc = new Scanner(System.in);
    public void SortDescending(){
        ArrayList<Integer> arr = new ArrayList<>();
    
        int n;
        System.out.println("Enter how many numbers you want to add: ");
        n = sc.nextInt();
        for(int i=0; i<n; i++){
            int number;
            System.out.println("Enter "+i+" Index: ");
            number = sc.nextInt();
            arr.add(number);
            System.out.println("Array Entered by you is: "+ arr);   
        }
        Collections.sort(arr,Collections.reverseOrder());
        System.out.println("sorted Array in desending order is: "+ arr);
    }

    public static double[] calculateStatistics(Scanner sc) {
        System.out.println("Enter how many elements you want to enter: ");
        int count = sc.nextInt();
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Array index " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int n = arr.length;

        double median;
        if (n % 2 == 0) {
            median = (double) (arr[n / 2 - 1] + arr[n / 2]) / 2;
        } else {
            median = (double) arr[n / 2];
        }

        double sum = 0;
        double sumSquares = 0;
        for (int num : arr) {
            sum += num;
            sumSquares += num * num;
        }
        double mean = sum / n;

        double variance = (sumSquares / n) - (mean * mean);
        double stdDeviation = Math.sqrt(variance);

        double[] statistics = new double[4];
        statistics[0] = median;
        statistics[1] = variance;
        statistics[2] = stdDeviation;
        statistics[3] = sumSquares;

        System.out.println("Median: " + statistics[0]);
        System.out.println("Variance: " + statistics[1]);
        System.out.println("Standard Deviation: " + statistics[2]);
        System.out.println("Sum of Squares: " + statistics[3]);

        return statistics;
    }


    public static int[][] matrixMultiplication(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int columnsA = matrixA[0].length;
        int columnsB = matrixB[0].length;

        int[][] finalMatrix = new int[rowsA][columnsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsB; j++) {
                for (int k = 0; k < columnsA; k++) {
                    finalMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        // Printing the resulting matrix
        for (int[] row : finalMatrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        return finalMatrix;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        calculateStatistics(scanner);
        scanner.close();
    }

}
    