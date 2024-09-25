import java.util.Scanner;
import java.util.Stack;

public class ReverseSentence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert Sentence: ");
        String sentence = scanner.nextLine();
        String reversedSentence = reverseSentence(sentence);
        System.out.println("Result :");
        System.out.println(reversedSentence);
    }

    public static String reverseSentence(String sentence) {
        Stack<Character> stack = new Stack<>();
        StringBuilder reversed = new StringBuilder();

        // Push characters onto the stack
        for (int i = 0; i < sentence.length(); i++) {
            stack.push(sentence.charAt(i));
        }

        // Pop characters from the stack to create the reversed sentence
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }
}
