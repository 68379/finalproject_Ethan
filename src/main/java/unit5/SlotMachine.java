package unit5;

public class SlotMachine {
    private int spins;

    public SlotMachine(int spins) {
        this.spins = spins;
    }
    public void combo(){
        while(spins > 0){
            int num1 = (int) (Math.random() * (5 - 1 + 1) + 1);
            int num2 = (int) (Math.random() * (5 - 1 + 1) + 1);
            int num3 = (int) (Math.random() * (5 - 1 + 1) + 1);
            System.out.println(num1 + " " + num2 + " " + num3);
            spins--;
        }

    }
}

class SlotMachinetest{
    public static void main(String[] args) {
        SlotMachine sm = new SlotMachine(5);
        sm.combo();
    }
}