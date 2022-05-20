package unit4;

public class Discussion {
    public static void main(String[] args) {

        String word1 = new String("Program");
        String word2 = new String("Program");

        String word3 = "Program";
        String word4 = "Program";

        System.out.println(word1.equals(word2));
        System.out.println(word1 == word2);

        System.out.println(word3 == word4);
        System.out.println(word3.equals(word4));


    }
}
