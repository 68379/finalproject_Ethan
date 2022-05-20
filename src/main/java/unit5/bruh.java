package unit5;

public class bruh {
    public void getAverage(int min, int max, int n) {
        int num = 0;
        int x = n;
        while (x != 0) {
            int rand1 = (int) (Math.random() * (max - min + 1) + min);
            System.out.print(num + " ");
            num += rand1;
            x--;
        }
        System.out.println("Average = " + (num/ (double)n));
    }
}



class bruhtester{
    public static void main(String[] args) {
        bruh b = new bruh();
        b.getAverage(10,50,5);
    }

}
