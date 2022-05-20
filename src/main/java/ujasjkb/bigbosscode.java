package ujasjkb;

import java.util.Scanner;

public class bigbosscode {

    public String pizza(int p) {
        int pizza = p;
        if (pizza == 1) {
            return "pepperoni";
        } else if (pizza == 2) {
            return  "keju";
        } else if (pizza == 3) {
            return "daging";
        } else
            System.out.println("Tolong nulis nomor dari 1-3");
        return " ";
    }

    public String topping(int t){
    int topping = t;
            if (topping == 1) {
        return "tomat";
    } else if (topping == 2) {
        return  "sosis";
    } else if (topping == 3) {
        return "saus";
    } else
            System.out.println("Tolong nulis nomor dari 1-3");
            return"";
    }

    public String Side(int s) {
        int side = s;
        if (side == 1) {
            return "kentang goreng";
        } else if (side == 2) {
            return "soda";
        } else if (side == 3) {
            return "roti";
        } else
            System.out.println("Tolong nulis nomor dari 1-3");
        return "";


    }
    }

    class test{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            bigbosscode iu = new bigbosscode();

            System.out.println("Jenis pizza apa yang kamu mau? \n" +
                    "Tolong pilih dari 1-3");
            System.out.print("" +
                    "1. Pepperoni \n" +
                    "2. Keju \n" +
                    "3. Daging \n" +
                    "Pilihan anda: ");
            int p = input.nextInt();

            System.out.println("Jenis pizza apa yang kamu mau? \n" +
                    "Tolong pilih dari 1-3");
            System.out.print("" +
                    "1. Tomat \n" +
                    "2. Sosis \n" +
                    "3. Saus \n" +
                    "Pilihan anda: ");
            int t = input.nextInt();

            System.out.println("Mau ada tambahan makanan apa? \n" +
                    "Tolong pilih dari 1-3");
            System.out.print("" +
                    "1. Kentang \n" +
                    "2. Soda \n" +
                    "3. Roti \n" +
                    "Pilihan anda: ");
            int s = input.nextInt();

            System.out.println("Kamu telah pilih pizza " + iu.pizza(p) + " dengan ekstra " + iu.topping(t) + " dan tambahan " + iu.Side(s));

        }

    }