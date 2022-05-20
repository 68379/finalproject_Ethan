package Examples;

public class nestedloopex {
    /**
     * prints a triangle in this format
     * using a nested for loop
     * Example: if n is 4
     * 4 3 2 1
     * 3 2 1
     * 2 1
     * 1
     * @param n is the upper value
     */
    public void printTriangle(int n){
        for (int i = n; i > 0 ; i--) {
            for (int j = i; j > 0 ; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /**
     * generates n random numbers between 0 and 9 inclusive
     * at n number of rounds.
     * Example: if rounds is 4
     *
     * Round 1...3 5 1 6
     * Round 2...5 5 6 7
     * Round 3...8 1 2 1
     * Round 4...8 9 9 1
     * @param rounds
     */
    public void getRanNumsInRounds(int rounds){
        for (int i = 1; i <= rounds ; i++) {
            System.out.print("Round " + i + "...");
            for (int j = rounds; j > 0 ; j--) {
                int x = (int)(Math.random() * (10));
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    /**
     * Modified method
     * prints the sum of all random numbers in each round
     * and the sum of all generated random integers in all rounds
     * Example: if rounds = 4
     * Round 1...3 5 1 6 15
     * Round 2...5 5 6 7 23
     * Round 3...8 1 2 1 12
     * Round 4...8 9 9 1 27
     * Total: 77
     * @param rounds
     */
    public void getRanNumsInRounds2(int rounds){
        for (int i = 1; i <= rounds ; i++) {
            System.out.print("Round " + i + "...");
            int total = 0;
            for (int j = rounds; j > 0 ; j--) {
                int x = (int)(Math.random() * (10));
                total += x;
                System.out.print(x + " ");
            }
            System.out.print(total);
            System.out.println();
        }
    }


}


class TestNested{
    public static void main(String[] args) {
        nestedloopex nt = new nestedloopex();
        nt.printTriangle(5);
        nt.getRanNumsInRounds(5);
        nt.getRanNumsInRounds2(10);

    }
}

