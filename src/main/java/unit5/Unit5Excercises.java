package unit5;

public class Unit5Excercises {


    public void printRandomEvens(int n, int min, int max) {
        while (n > 0) {
            int es = (int) (Math.random() * (max - min + 1) + min);
            if (es % 2 == 0) {
                System.out.println(es);
            } else {
                n++;
            }
            n--;
        }
    }

    public void digitsDisplay(int num) {
        String e = String.valueOf(num);
        int s = 0;
        int d = 1;
        int h = e.length();
        while (h >= 1) {
            String f = e.substring(s, d);
            System.out.println(f);
            s++;
            d++;
            h--;
        }
    }

    public int cubeSum(int num) {
        int sum = 0;
        while(sum > 0){
            int digits = num % 10;
            sum += (int)(Math.pow(digits,3));
            num = num/10;
        }
        return num;
    }

    public int countVowels(String sentence) {
        int v = 0;
        for (int i = 0; i < sentence.length(); i++) {
            String e = sentence.substring(i, i + 1);
            if (e.equals("a") || e.equals("e") || e.equals("o") || e.equals("u") || e.equals("i")) {
                v++;
            }
        }
        return v;
    }


    public int countLetter(String phrase) {
        int z = 0;
        for (int i = 0; i < phrase.length(); i++) {
            String f = phrase.substring(i,i+1);
            if (f.equals("o")) {
                z++;
            }
        }
        return z;
    }
}


        class test {
            public static void main(String[] args) {
                Unit5Excercises ue = new Unit5Excercises();
                //ue.printRandomEvens(5, 1, 100);
                //ue.digitsDisplay(12345);
                ue.cubeSum(223);
                //ue.countVowels("amongus");
                //ue.countLetter("ooo");
            }
        }
