package indomaret;

import java.util.Locale;
import java.util.Scanner;

public class indomaretc {
    private Indomaret[] record;
    private int index;


    public indomaretc() {
        this.record = new Indomaret[1000];
        this.index = 0;
    }

    public void add(Indomaret id) {
        if (index < record.length) {
            record[index] = id;
            index++;
        }
    }

    public Indomaret search(String name) {
        for (int i = 0; i < record.length; i++) {
            if (record[i] != null && record[i].getName().equals(name)) {
                return record[i];
            }
        }
        return null;
    }

    public void print() {
        int z = 0;
        double p = 0;
        System.out.println("Item         Price\t\tQuantity\tClass\t\tTotal Price");
        for (int i = 0; i < record.length; i++) {
            if (record[i] != null) {
                int t = record[i].getQuantity();
                z += t;
                p += t* record[i].getCost();
                System.out.println(record[i]);

            }

        }
        System.out.println("Total             \t\t" + z + "\t    \t\t" + p );
    }

    public Indomaret[] getItemsWithClassification(String clas) {
        int count = 0;
        for (int i = 0; i < record.length; i++) {
            if (record[i] != null && record[i].getRole().equals(clas.toLowerCase(Locale.ROOT))) {
                count++;
            }
        }
        Indomaret[] s = new Indomaret[count];
        for (int i = 0; i < record.length; i++) {
            if (record[i] != null && record[i].getRole().equals(clas)){
                System.out.println(record[i]);
            }
        }
        return s;
    }

    public double getMostExpensiveItem() {
        double d = record[0].getCost();
        for (int i = 0; i < record.length; i++) {
            if (record[i].getCost() > d) {
                d = record[i].getCost();
            }
        }
        return d;
    }

    public double getCheapestItem() {
        double d = record[0].getCost();
        for (int i = 0; i < record.length; i++) {
            if (record[i].getCost() < d) {
                d = record[i].getCost();
            }
        }
        return d;
    }


    public boolean checkIfNeedAdditionalStorage() {
        if (record[1000].getName() == (null)) {
            return false;
        } else {
            return true;
        }
    }

    public void removeItem(String name) {
        for (int i = 0; i < record.length; i++) {
            if (record[i] != null && record[i].getName().equals(name)) {
                record[i] = null;
            }
        }
        System.out.println("Item successfully removed…");
    }
}

class testid {
    public static void main(String[] args) {
        indomaretc id = new indomaretc();
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to IndoMaret!\n" +
                "1 - Add item\n" +
                "2 - Search Item\n" +
                "3 - Print all items\n" +
                "4 - Print items with classification\n" +
                "5 - Get most expensive item\n" +
                "6 - Get cheapest item\n" +
                "7 - Check if additional storage needed\n" +
                "8 - Remove item\n" +
                "0 - Quit\n" +
                "Enter your choice >>\n");
        int f = input.nextInt();

        while (f != 0) {
            if (f == 1) {
                System.out.print("Enter item name: ");
                String n = input.next();
                System.out.println();
                System.out.print("Enter item price: ");
                double p = input.nextDouble();
                System.out.println();
                System.out.print("Enter quantity: ");
                int q = input.nextInt();
                System.out.println();
                System.out.print("Enter classification: ");
                String c = input.next();
                id.add(new Indomaret(n, p, q, c));
                System.out.println();
                System.out.println();
            } else if (f == 2) {
                System.out.print("Enter name of Item to search: ");
                String na = input.next();
                id.search(na);
                System.out.println();
                System.out.println();
            } else if (f == 3) {
                System.out.println("Indomaret (All items)");
                id.print();
                System.out.println();
                System.out.println();
            } else if (f == 4) {
                System.out.println("Enter classification (A, B or C): ");
                String gl = input.next();
                System.out.println("All items classified as " + gl);
                System.out.println("Item         Price\t\tQuantity\tClass\t\tTotal Price\t");
                id.getItemsWithClassification(gl);
                System.out.println();
                System.out.println();
            } else if (f == 5) {
                System.out.println("Most expensive item");
                System.out.println("Item         Price\t\tQuantity\tClass\t\tTotal Price\t");
                id.getMostExpensiveItem();
                System.out.println();
                System.out.println();
            } else if (f == 6) {
                System.out.println("Most expensive item");
                System.out.println("Item         Price\t\tQuantity\tClass\t\tTotal Price\t");
                id.getCheapestItem();
                System.out.println();
                System.out.println();
            } else if (f == 7) {
                System.out.println("Need aditional storage?");
                id.checkIfNeedAdditionalStorage();
                System.out.println();
                System.out.println();
            } else if (f == 8) {
                System.out.println("Enter name of item to remove: ");
                String l = input.next();
                System.out.printf("Are you sure you want to remove (Notebook) from the list? ");
                String y = input.next();
                if (y.equals("y")) {
                    id.removeItem(l);
                }
                System.out.println();
                System.out.println();
            }
            System.out.println("Welcome to IndoMaret!\n" +
                    "1 - Add item\n" +
                    "2 - Search Item\n" +
                    "3 - Print all items\n" +
                    "4 - Print items with classification\n" +
                    "5 - Get most expensive item\n" +
                    "6 - Get cheapest item\n" +
                    "7 - Check if additional storage needed\n" +
                    "8 - Remove item\n" +
                    "0 - Quit\n" +
                    "Enter your choice >>\n");
            f = input.nextInt();
        }
        System.out.println("Thank you...");
    }
}