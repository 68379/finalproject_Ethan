package Examples;
import java.util.Scanner;

public class cointoss {

    private int coinTossResult;
    private int userPick;
    private int points;

    //Constructor
    public cointoss(){
        points = 100;
    }

    public int generateRandomCoinFace(){
        coinTossResult = (int)(Math.random() * (2 - 1 + 1) + 1);
        return coinTossResult;
    }

    public void showCoinRTossResult(){
        if(coinTossResult == 1){
            System.out.println("Coin toss result: Head");
        }else{
            System.out.println("Coin toss result: Tail");
        }
    }

    public void setUserPick(int userPick){
        this.userPick = userPick;
    }
    public int getUserPick(){
        return this.userPick;
    }

    public void printUserPick(){
        if(userPick == 1){
            System.out.println("Your pick: Head");
        }else{
            System.out.println("Your pick: Tail");
        }
    }

    public void getWinner(){
        if(coinTossResult == userPick){
            System.out.println("You win!");
            points++;
        }else{
            System.out.println("You lost!");
            points--;
        }
    }
    public int getPoints(){
        return this.points;
    }

    public void play(){
        Scanner input = new Scanner(System.in);

        System.out.println("You have " + getPoints() + " to start!");

        System.out.println("1 - Head");
        System.out.println("2 - Tail");
        System.out.println("0 - To Quit");
        System.out.print("Enter your pick: ");
        int pick = input.nextInt();

        while(pick != 0){
            if(pick == 1 || pick == 2){
                setUserPick(pick);
                printUserPick();
                generateRandomCoinFace(); // assigns a random number to the coin toss result
                showCoinRTossResult(); //shows the Text format of the coin toss result
                getWinner();
                System.out.println();
            }else{
                System.out.println("Hey, enter a correct pick!");
            }
            System.out.println("1 - Head");
            System.out.println("2 - Tail");
            System.out.println("0 - To Quit");
            System.out.print("Enter your pick: ");
            pick = input.nextInt();
        }
        System.out.println("Current points: " + getPoints());
        System.out.println("Thank you for playing....");

    }

}

class TestCTG{
    public static void main(String[] args) {
        cointoss ctg = new cointoss();
        ctg.play();
    }
}

