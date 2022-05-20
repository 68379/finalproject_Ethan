package textnumber;

import java.util.Locale;

public class WordWork {
    /**
     * Reverses the String str
     *
     * @param str is any string
     * @return the reversed word
     */
    public String flipWord(String str) {
        int f = str.length();
        String z = "";
        int k = 1;
        int b = 0;
        for (int i = 0; i < f; i++) {
            String c = str.substring(f - k, f - b);
            k++;
            b++;
            z = z + c;
        }
        return z;
    }

    /**
     * Deletes the space (" ") and dashes (-)
     * if str is a multiple word and or separated with a dash
     *
     * @param str
     * @return a combined/single word without hyphen and or space in between
     */
    public String makeSingleWord(String str) {
        String v = "";
        for (int i = 0; i < str.length(); i++) {
            String e = str.substring(i, i + 1);
            if (e.equals(" ") || e.equals("-")) {
                int f = 0;
            } else {
                v = v + e;
            }

        }
        return v;
    }

    /**
     * Checks if a word is Palindrome
     * Converts the str into a single word
     * if str value has multiple words or has dashes
     * A palindrome is a word, number, phrase, or other sequence of characters
     * which reads the same backward as forward
     *
     * @param str a single or combined word
     * @return true if str is Palindrome, false otherwise
     */
    public String isPalindrome(String str) {
        str = makeSingleWord(str);
        String p = makeSingleWord(str);
        String v = p.toLowerCase(Locale.ROOT);
        int s = 0;
        int l = (str.length() / 2) + 1;
        int j = (str.length() / 2) - 1;
        for (int i = 0; i < l; i++) {
            String e = v.substring(i, i + 1);
            String f = v.substring(str.length() - (1 + i), str.length() - i);
            if (e.equals(f)) {
                return "true";
            }
        }
        if (s <= j) {
            return "false";
        }
        return "false";
    }

    /**
     * Creates and returns an alternate text formed
     * from every other letter of String str
     * Converts str as a single word
     * If str is of even length, alternate text starts at end of str
     * If str is of odd length, alternate text starts at the first letter of str
     *
     * @param str is a string
     * @retirm
     */
    public String createAlternateText(String str) {
        str = makeSingleWord(str);
        String word = "";
        if(str.length() % 2 != 0){
            for (int i = str.length(); i > 0; i -= 2) {
                word += str.substring(i - 1, i);
        }
            }else{
            for(int i = 0; i < str.length(); i += 2){
                word += str.substring(i, i + 1);
            }
        }
        return word;
    }

    /**
     * Prints a rectangle of random letters
     * generated from String word all in lowercase
     *
     * @param row  number of rows to print
     * @param col  number of columns to print
     *             Example: if word = "Teacher", row = 4, col = 4
     *             Example output:
     *             e a t c
     *             t t e c
     *             a a e a
     *             e c t a
     * @param word
     */

    public String printRectLetters(String word, int row, int col) {
        String l = word.toLowerCase(Locale.ROOT);
        int n = word.length() - 1;
        for (int i = 0; i < col; i++) {
            for (int j = row; j >= 1; j--) {
                int es = (int) (Math.random() * (n - 0 + 1) + 0);
                String z = l.substring(es, es + 1);
                return (z + " ");
            }
        }
        return(" ");
    }
}



        class TestClass {
            public static void main(String[] args) {

                WordWork ww = new WordWork();
                System.out.println("Flipping the word...");
                System.out.println(ww.flipWord("Java")); //avaJ

                System.out.println();
                System.out.println("Make single word...");
                System.out.println(ww.makeSingleWord("school-bus")); //schoolbus
                System.out.println(ww.makeSingleWord("hello world")); //helloworld
                System.out.println(ww.makeSingleWord("So What!")); //SoWhat!
                System.out.println(ww.makeSingleWord("What?")); //What?
                System.out.println(ww.makeSingleWord("   hello"));//hello


                System.out.println();
                System.out.println("Is palindrome...");
                System.out.println(ww.isPalindrome("Madam"));//true


                System.out.println();
                System.out.println("Creating alternate text...");
                System.out.println(ww.createAlternateText("Hello There")); //Hlohr
                System.out.println(ww.createAlternateText("Programming")); //gimroP

                System.out.println();
                System.out.println("Rectangle of random letters...");
                ww.printRectLetters("Teacher", 4, 4);
                /** example output
                 * e e t a
                 * c e e t
                 * e t c a
                 * t e r c
                 */


            }
        }


