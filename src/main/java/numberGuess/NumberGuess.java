package numberGuess;

public class NumberGuess {
    private int number;

    public NumberGuess() {
        number = (int) (Math.random() * (99 - 10 + 1) + 10);
    }

    public boolean onesCorrect(int guess) {
        int nOnes = number % 10;
        int gOnes = guess % 10;
        if (nOnes == gOnes) {
            return true;
        }
        return false;
    }

    public boolean tensCorrect(int guess) {
        int nTens = number / 10;
        int gTens = guess / 10;
        if (nTens == gTens) {
            return true;
        }
        return false;
    }

    public boolean onesExist(int guess) {
        return number / 10 == guess % 10;
    }

    public boolean tensExist(int guess) {
        return number % 10 == guess / 10;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
