/*
/*Palnidrome Problem: Palindrome
/*@version 3/2/2017
/*@author Christina Knyaz
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class Palindrome {

    private static Queue<Character> q = new LinkedList<Character>();
    private static Stack<Character> s = new Stack<Character>();
    private static String input;
    private static StringBuilder result = new StringBuilder();
    private static Stack<String> pals = new Stack<String>();
    private static int diff = 0;

    public Palindrome() {
        this.q = q;
        this.s = s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enter string or quit: ");
            input = in.nextLine();
            if (input.equals("quit")) {
                //buildReverse();
                //System.out.println(result);
                while(!pals.isEmpty()){
                    System.out.println(pals.pop());
                }
                
                System.exit(0);
            } else if (isPalindrome(input)) {
                System.out.println("That is a palindrome.");
                pals.add(input);
            } else {
                System.out.println("That is not a palindrome.");
            }
        } while (input.length() != 0);
    }

    public static boolean isPalindrome(String input) {

        Character letter;
        int diff = 0;
        int i;

        for (i = 0; i < input.length(); i++) {
            letter = input.charAt(i);
            if (Character.isLetter(letter)) {
                q.add(letter);
                s.push(letter);
                //result = result.append(s);
            }
        }

        while (!q.isEmpty()) {
            if (q.remove() != s.pop()) {
                diff++;
            }
        }
        if (diff == 0) {
            for (i = 0; i < input.length(); i++) {
                letter = input.charAt(i);
                result.append(s.push(letter));
            }
        }

        return (diff == 0);
    }

    private static String buildReverse() {
        while (!s.isEmpty()) {
            result.append(s.pop());
        }
        return result.toString();
    }

}
