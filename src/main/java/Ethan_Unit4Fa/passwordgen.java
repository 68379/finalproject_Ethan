package Ethan_Unit4Fa;

public class passwordgen {

        private String word1;
        private String word2;

        public passwordgen(String word1, String word2) {
            this.word1 = word1;
            this.word2 = word2;
        }

        public int generateNumericPass(int digits) {
            int min = (int) (Math.pow(10, digits - 1));
            int max = (int) (Math.pow(10, digits) + 1);
            int numberPass = (int) (Math.random() * (max - min + 1) + min);
            return numberPass;
        }

        public String generateTextPass() {
            int midIndex1 = word1.length() / 2;
            int midIndex2 = word2.length() / 2;

            String w1_firstHalf = word1.substring(0, midIndex1);
            String w2_SecondHalf = word2.substring(midIndex2);

            String textPass;
            if (word1.length() >= 8 && word2.length() >= 9) {
                textPass = w1_firstHalf + w2_SecondHalf;
            } else {
                textPass = word2 + word1;
            }
            return textPass.toLowerCase();
        }

        public String generateHardPass(String anyCharacter) {
            String hardPass;
            String textPass = generateTextPass();
            if (textPass.length() >= 8) {
                String fLetter = textPass.substring(0, 1).toUpperCase();
                hardPass = fLetter + textPass.substring(1) + generateNumericPass(2) + anyCharacter;
            } else if (textPass.length() >= 6) {
                String lLetter = textPass.substring(textPass.length() - 1).toUpperCase();
                hardPass = textPass.substring(0, textPass.length() - 1) + lLetter + generateNumericPass(3) + anyCharacter;
            } else {
                int ranDigit = (int) (Math.random() * (6 - 4 + 1) + 4);
                hardPass = anyCharacter + generateNumericPass(ranDigit) + generateTextPass();
            }
            return hardPass;

        }
    }

class passwordgenTest {
    public static void main(String[] args) {
        passwordgen pg1 = new passwordgen("Procedural", "Programming");
        passwordgen pg2 = new passwordgen("Program", "Java");
        passwordgen pg3 = new passwordgen("Cat", "Dog");
        passwordgen pg4 = new passwordgen("Hi", "Lo");

        System.out.println(" n1 = " + pg1.generateNumericPass(2));
        System.out.println(" n1 = " + pg1.generateNumericPass(4));
        System.out.println(" n1 = " + pg1.generateNumericPass(3));

        System.out.println(" tp1 = " + pg1.generateTextPass());
        System.out.println(" tp2 = " + pg2.generateTextPass());
        System.out.println(" tp3 = " + pg3.generateTextPass());


        System.out.println(" hp1 = " + pg1.generateHardPass("!"));
        System.out.println(" hp2 = " + pg2.generateHardPass("#"));
        System.out.println(" hp3 = " + pg3.generateHardPass("%"));
        System.out.println(" hp4 = " + pg4.generateHardPass("$"));
    }
}

