package Ethan_Unit4Fa;

import java.util.Locale;

public class PasswordGenerator {
    private String word1;
    private String word2;

    public PasswordGenerator(String word1, String word2) {
        this.word1 = word1;
        this.word2 = word2;
    }
    public int generateNumericPass(int digits) {
        int minnum = 10 ^ (digits - 1);
        int maxnum = (10^digits) + 1;
        return (int)(Math.random()*(maxnum-1)) + minnum;

    }
    public String generateTextPass(){
        int w1 = word1.length();
        int w2 = word2.length();
        String w10 = word1.substring(0,w1/2);
        String w20 = word2.substring((w2/2),w2);
        if(w1 >= 8  && w2 >= 8){
            String w30 = w10 +w20;
            return w30.toLowerCase(Locale.ROOT);
        }
        String word3 = word2 + word1;
        return word3.toLowerCase(Locale.ROOT);
    }

    public String generateHardPass(String anyCharacter){
        String textpass = generateTextPass();

        if(textpass.length() >= 8){
            int u2 = (int)(Math.random() * (100-1)) + 1;
            String fletter = textpass.substring(0,1).toUpperCase(Locale.ROOT);
            String e = textpass.substring(1);
            return fletter + e + u2 + anyCharacter;
        }else if(textpass.length() >= 6){
            String lword = textpass.substring(textpass.length()-1).toUpperCase(Locale.ROOT);
            int u3 = (int)(Math.random() * (1000-1)) + 1;
            return textpass.substring(0, textpass.length()-1) + lword + u3 + anyCharacter;
        }else{
            int u4 = (int)(Math.random() * (6 - 4 + 1) + 4);
            return anyCharacter + u4 + textpass;
        }
    }
}

class PasswordgeneratorTest{
    public static void main(String[] args) {
        PasswordGenerator pg1 = new PasswordGenerator("Procedural", "Programming");
        PasswordGenerator pg2 = new PasswordGenerator("Program", "Java");
        PasswordGenerator pg3 = new PasswordGenerator("Cat", "Dog");
        PasswordGenerator pg4 = new PasswordGenerator("Hi", "Lo");

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



