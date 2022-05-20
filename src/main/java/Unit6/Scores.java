package Unit6;

import java.util.Arrays;

public class Scores {
    private int[] scoreList; // instance variable
    private int index;

    public Scores() {
        scoreList = new int[10]; //10 spots
        index = 0;
    }

    public void addScore(int score) {
        if (index < scoreList.length) {
            scoreList[index] = score;
            index++;
            System.out.println("Score succesfully added ");
        } else {
            System.out.println("Score not added. Array is full");
        }
    }

    public void PrintScores() {
        for (int i = 0; i < scoreList.length; i++) {
            System.out.print(scoreList[i] + " ");
        }
    }

    public int countEvens() {
        int f = 0;
        for (int i = 0; i < scoreList.length; i++) {
            if (scoreList[i] % 2 == 0 && scoreList[i] % 5 != 0) {
                f++;
            }
        }
        return f;
    }

    public int getMaxScore() {
        int score = scoreList[0];
        for (int i = 0; i < scoreList.length; i++) {
            if (scoreList[i] > score) {
                score = scoreList[i];
            }
        }
        return score;
    }

    public int getMinScore() {
        int score = scoreList[0];
        for (int i = 0; i < scoreList.length; i++) {
            if (scoreList[i] < score) {
                score = scoreList[i];
            }
        }
        return score;
    }

    public double getAverageScore() {
        double e = 0;
        double y = 0;
        for (int i = 0; i < scoreList.length; i++) {
            e += scoreList[i];
            y++;
        }

        double f = e / y;
        return f;
    }

    public void printTwoHighestScores() {
        int score1 = scoreList[0];
        int score2 = scoreList[0];
        for (int i = 0; i < scoreList.length; i++) {
            if (scoreList[i] < score1 && scoreList[i] > score2) {
                score2 = scoreList[i];
            } else if (scoreList[i] > score1 && scoreList[i] > score2) {
                score1 = scoreList[i];
            }
        }

        System.out.println("Highest: " + score1 + "\n" +
                "Second Highest: " + score2);
    }

    public void printTwoLowestScores() {
        int score1 = scoreList[0];
        int score2 = scoreList[0];
        for (int i = 0; i < scoreList.length; i++) {
            if (scoreList[i] > score1 && scoreList[i] < score2) {
                score2 = scoreList[i];
            } else if (scoreList[i] < score1 && scoreList[i] < score2) {
                score1 = scoreList[i];
            }
        }

        System.out.println("Lowest: " + score1 + "\n" +
                "Lowest: " + score2);
    }

    public int search(int[] nums, int numToSearch) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == numToSearch) {
                return i;
            }
        }
        return -1;
    }

    public int[] getSubArray(int[] nums, int startIndex, int endIndex) {
        int[] x = new int[(endIndex - startIndex) + 1];
        int y = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            x[y] = nums[i];
            y++;
        }
        return x;
    }

    /**
     * Create an array that contains even numbers that are
     * present in the array nums
     *
     * @param nums is an integer array
     * @return an integer that contains even number extracted from array nums
     * Example: if nums array contains {1, 3, 2, 4, 1, 5, 6}
     * the array to be returned must contain {2, 4, 6}
     */
    public int[] getEvensArray(int[] nums) {
        int[] x = new int[nums.length];
        int y = 0;
        for (int i = nums.length; i > 0; i--) {
            if (nums[i] % 2 == 0) {
                x[y] = nums[i];
                y++;
            }
        }
        return x;
    }


    /**
     * Counts the number of odd numbers in the array nums
     *
     * @param nums integer array
     * @return the number of odd values in the array nums
     */
    public int countOdds(int[] nums) {
        return 0;
    }


    /**
     * Counts that number of values in the array nums
     * that are divisible by n OR m, but NOT by both n AND m
     *
     * @param nums integer array
     * @param n    divisor
     * @param m    divisor
     * @return return the number of values that are divisible by n or m, not by both
     */
    public int isDivisibleByNM(int[] nums, int n, int m) {
        return 0;
    }

    /**
     * generates a random value that is stored in array nums
     *
     * @param nums integer array
     * @return random value stored in the nums array
     */
    public int getRandomNum(int[] nums) {
        return 0;
    }
}


class test {
    public static void main(String[] args) {
        Scores s1 = new Scores();
        int[] x = {1, 2, 3, 4, 5};
//        s1.addScore(81);
//        s1.addScore(78);
//        s1.addScore(79);
//        s1.addScore(80);
//        s1.addScore(84);
//        s1.addScore(80);
//        s1.addScore(82);
//        s1.addScore(80);
//        s1.addScore(82);
//        s1.addScore(81);
//        System.out.println("Max score is = " + s1.getMaxScore());
//        System.out.println("Min score is = " + s1.getMinScore());
//        System.out.println(s1.getAverageScore());
//        s1.printTwoHighestScores();
//        s1.printTwoLowestScores();

        System.out.println(Arrays.toString(s1.getSubArray(x, 3, 4)));
        System.out.println(Arrays.toString(s1.getEvensArray(x)));


//        s1.PrintScores();
//        System.out.println("evens = " + s1.countEvens());
    }
}