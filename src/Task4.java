import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        /*Задано текст, слова в якому розділені пробілами і розділовими знаками. Розробити програму, 
яка знаходить і друкує всі симетричні слова (наприклад, слово абввба є симетричним). */
  
        Scanner in = new Scanner(System.in);

        System.out.print("Input text: ");
        String text = in.nextLine();

        String[] words = text.split("\\s+"); // Розділяємо текст на слова за пробілами і розділовими знаками

        System.out.println("Symmetrical words:");
        for (String word : words) {
            if (isPalindrome(word)) {
                System.out.println(word);
            }
        }
    }
    public static boolean isPalindrome(String word) {
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
