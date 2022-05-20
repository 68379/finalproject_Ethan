package unit5;

public class NestedLoop {

    public void printtriangle(int n){
        for(int i = n; i > 0; i--){
            for(int j = n; j >= 1; j--){
                System.out.print(j + " ");
            }
            n--;
            System.out.println("");
        }
    }
    public void getRanNumsInRounds(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("Round " + i + "...");
            for (int j = n; j >= 1; j--) {
                int d = (int) (Math.random() * (9 - 0 + 1) + 0);
                System.out.print(d + " ");
            }
            System.out.println("");
        }
    }
    public void getRanNumsInRounds2(int n) {
        for (int i = 1; i <= n; i++) {
            int res = 0;
            System.out.print("Round " + i + "...");
            for (int j = n; j >= 1; j--) {
                int d = (int) (Math.random() * (9 - 0 + 1) + 0);
                System.out.print(d + " ");
                res+= d;
            }
            System.out.print("Total: " + res);
            System.out.println("");
        }
    }
}


class Nestedlooptest{
    public static void main(String[] args) {
        NestedLoop nl = new NestedLoop();
        //nl.printtriangle(10);
        //nl.getRanNumsInRounds(4);
        nl.getRanNumsInRounds2(4);
    }
}