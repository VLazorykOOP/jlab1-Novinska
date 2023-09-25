import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        /*Задана дійсна матриця A(n,n), n<=20.  Розробити програму, яка будує вектор X(n)
         за правилом: X(i)(i=1,2, ... ,n)дорівнює півсумі модулів максимального і мінімального 
         елементів i -го рядка */
        Scanner in = new Scanner(System.in);

        System.out.print("Size of matrix : n= (n <= 20): ");
        int n = in.nextInt();

        if (n > 20) {
            System.out.println("Error : n >= 20.");
            return;
        }
        double[][] A = new double[n][n];
        double[] X = new double[n];

        System.out.println("Enter elements of matrix A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = in.nextDouble();
            }
        }
        for (int i = 0; i < n; i++) {
            double max = A[i][0];//масив не повинен бути пустим;
            double min = A[i][0];

            for (int j = 0; j < n; j++) {
                if (A[i][j] > max) {
                    max = A[i][j];
                }
                if (A[i][j] < min) {
                    min = A[i][j];
                }
            }

            X[i] = (Math.abs(max) + Math.abs(min)) / 2.0;
        }
        System.out.println("Array X:");
        for (int i = 0; i < n; i++) {
            System.out.println("X[" + i + "] = " + X[i]);
        }
        in.close();
    }
}
