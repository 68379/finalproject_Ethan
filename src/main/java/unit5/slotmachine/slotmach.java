package unit5.slotmachine;

import java.util.Scanner;

public class slotmach {
    private int numofjackpot;
    private int numspins;

    public slotmach(){
        numofjackpot = 0;
        numspins = 0;
    }
    void setNumspins(int numspins){
        this.numspins = numspins;
    }

    // random num from 1-5 (int)
    public int getRandomNumber(){
        return (int)(Math.random() * (5-1+1) + 1);
    }
    public void printSpin(){
        int n1 = getRandomNumber();
        int n2 = getRandomNumber();
        int n3 = getRandomNumber();

        System.out.println(n1 + "\t" + n2 + "\t" + n3);
        checkSpin(n1,n2,n3);
    }
    public void checkSpin(int n1, int n2, int n3) {
    if (n1 == n2 && n2 == n3){
        numofjackpot++;
    }
    }
    public void play(){
        for(int i = 0; i < numspins; i++){
            printSpin();
        }
        System.out.println("You made " + numofjackpot + " Jackpots");
    }
}

class testslot{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        slotmach sm = new slotmach();

        System.out.println("How many spins to make");
        int spins = input.nextInt();

        sm.setNumspins(spins);

        sm.play();
    }
}