import java.util.Scanner;

/**
 * PostfixMain
 */
public class PostfixMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P,Q;
        System.out.println("Insert mathematical expression (infix) : ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ") ";

        int total = Q.length();

        Postfix post = new Postfix(total);
        P = post.infixToPostfix(Q);
        System.out.println("Postfix : " + P);
    }
}