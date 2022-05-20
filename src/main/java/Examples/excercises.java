package Examples;

public class excercises {
    /**
     * printRandomEvens - Generates n even random numbers.
     * The even numbers to generate are between min and max inclusive.
     * n is the number of random even numbers to generate
     *
     * @param n   is number of random even numbers to generate
     * @param min
     * @param max
     */
    public void printRandomEvens(int n, int min, int max) {
        for (int i = 1; i <= n; i++) {
            int ran = (int) (Math.random() * (max - min + 1) + min);
            if (ran % 2 == 0) {
                System.out.println(ran);
            } else {
                i--; //moves back the value of i that didn't generate an even number
            }
        }
    }

    /**
     * displays each digit on a separate line.
     * If num is 789, then calling this method should print
     * 7
     * 8
     * 9
     *
     * @param num
     */
    public void digitsDisplay(int num) {
        String s = "";
        while (num > 0) {
            int digit = num % 10;
            s = digit + "\n" + s;
            num = num / 10;
        }
        System.out.println(s);

    }

    /**
     * Returns the sum of the cubes of the digits in num
     * If num is 223, then the method returns 43
     * because 2^3 + 2^3+ 3^3 = 8 + 8 + 27 = 43
     *
     * @param num
     * @return
     */
    public int cubeSum(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += (int) (Math.pow(digit, 3));
            num = num / 10;
        }
        return sum;
    }

    /**
     * Returns the number of vowels in a sentence.
     * If the sentence is “This is Java”, the method returns 4,
     * because there are 4 vowels in the sentence
     *
     * @param sentence
     * @return
     */
    public int countVowels(String sentence) {
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            String l = sentence.substring(i, i + 1); //single letter
            if(l.equals("a") ||
                    l.equals("e") ||
                    l.equals("i") ||
                    l.equals("o") ||
                    l.equals("u")){
                count++;
            }
        }
        return count;
    }

    /**
     * Return the number of times the letter occurs in the phrase.
     * If phrase is “Hello World” and the letter to find is “o”,
     * the method will return 2.
     * @param letter is letter to find
     * @param phrase
     * @return
     */
    public int countLetter(String phrase, String letter) {
        int count = 0;
        for (int i = 0; i < phrase.length(); i++) {
            if(letter.equals(phrase.substring(i, i + 1))){
                count++;
            }
        }
        return count;
    }

}

class TestExercises {
    public static void main(String[] args) {
        excercises u5 = new excercises();
        u5.printRandomEvens(5, 1, 10);

        u5.digitsDisplay(123);
    }

    public int countVowels(String text) {
        String vowels = "aeiou";
        int t = 0;
        for (int i = 0; i < text.length(); i++) {
            String l = text.substring(i, i + 1);
            if (vowels.contains(l)) {
                t++;
            }
        }
        return t;
}
}
