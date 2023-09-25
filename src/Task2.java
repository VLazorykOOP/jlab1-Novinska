import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
         /*Задано два масиви цілих чисел A(n), n<=400 i B(m), m<=200.
         Розробити програму, яка знаходить найменший елемент серед тих елементів масиву A , 
         які не містяться у масиві B .*/
        Scanner in = new Scanner(System.in);
        System.out.print("size of A (n <= 400): ");
        int n = in.nextInt();

        if (n >= 400) {
            System.out.println("Error: n => 400.");
            return;
        }

        int[] A = new int[n];
        System.out.println("Enter array A:");
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = in.nextInt();
        }
        System.out.print("size of B (m <= 200): ");
        int m = in.nextInt();

        if (m >= 200) {
            System.out.println("Error: m >= 200.");
            return;
        }

        int[] B = new int[m];
        System.out.println("Enter array B:");
        for (int i = 0; i < m; i++) {
            System.out.print("B[" + i + "] = ");
            B[i] = in.nextInt();
        }

        int minElement = findMinElementNotInArray(A, B);

        System.out.println("The smallest element : " + minElement);
        in.close();
    }

    public static int findMinElementNotInArray(int[] A, int[] B) {
        int minElement = Integer.MAX_VALUE;

        for (int i = 0; i < A.length; i++) {
            if (!containsElement(B, A[i]) && A[i] < minElement) {
                minElement = A[i];
            }
        }

        return minElement;
    }

    // перевірка
    public static boolean containsElement(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    
    }
}
