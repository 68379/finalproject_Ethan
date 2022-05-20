package unit4;

public class sadsa {
    int x = 3;
    int y = 8;
    int num = 42;
    int mys = 1;

    public void e() {

        while (x < y) {
            System.out.println(x + " " + y);
            x++;
            y--;
            System.out.println(x + " " + y);
            System.out.println(x + " balls " + (int) (Math.pow(x, y - x)));
        }
    }
    public void s(){
        while (num >= 3){
            num ++;
            mys *= num % 10;
            num /= 10;
        }
        System.out.println(mys + " " + num);
        }
    }


class test{
    public static void main(String[] args) {
        sadsa s = new sadsa();

        s.e();

    }
}