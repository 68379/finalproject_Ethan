package ujasjkb;

import java.util.Scanner;

public class contoh1 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            //Menanya jenis pizza apa yang kamu mau
            System.out.println("Jenis pizza apa yang kamu mau?");
            //jawaban yang diketik akan disimpan sebagai variable jenis
            String jenis = input.next();
            System.out.println("Mau tambah topping apa?");
            String topping = input.next();
            System.out.println("Mau ada tambahan makanan tidak?");
            String tambahan = input.next();
            //Kamu order pizza
            System.out.println("Kamu order pizza " + jenis + " dengan extra " + topping + " dan " + tambahan + " ekstra");
        }
    }

