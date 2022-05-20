package unit5;

public class EvensOdd {

    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public void printsEvens(int min, int max) {
        while (min <= max) {
            if (isEven(min)) {
                System.out.println(min);
            }
            min++;
        }
    }

    public void print10To0() {
        int num = 10;
        while (num >= 0) {
            System.out.println(num);
            num--;
        }
    }

    public void toThePower() {
        int num = 1;
        while (num >= 0) {
            System.out.println(Math.pow(num, num));
            num++;
        }
    }
    public int sumdigits(int num){
        int sum = 0;
        while(num != 0){
            int digits = num % 10;
            sum += digits;
            num /= 10;
        }
        return sum;
    }
    public void esa(){
        int num = 3;
        String name = "declares";
        for(int i = 0; i< name.length(); i += 3){
            System.out.println("l" + name.length());
            System.out.println("z" + num);
            System.out.println("j" + name.substring(num , name.length()/2));
            num--;
            System.out.println("d" + num);
            System.out.println("e" + i);
        }
    }


    static class EvensOddtest {
        public static void main(String[] args) {
            EvensOdd eo = new EvensOdd();
           eo.esa();
        }
    }
}
