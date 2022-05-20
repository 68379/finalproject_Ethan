package ujasjkb;

import java.util.Scanner;

public class example2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Jenis pizza apa yang kamu mau? \n" +
                    "1 = keju\n" +
                    "2 = pepperoni\n" +
                    "3 = daging\n" +
                    "Pilihan anda: ");
            int w = input.nextInt();
            if(w == 1){
                System.out.println("kamu telah order pizza keju");
            }else if(w == 2){
                System.out.println("kamu telah order pizza pepperoni");
            }else if(w == 3){
                System.out.println("kamu telah order pizza daging");
            }else
                System.out.println("Tolong tulis nomor dari 1-3");
        }
    }

