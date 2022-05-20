package Ethan_Unit4Fa;

public class BankClient {
    String name;
    double income;
    int yearsinbank;
    String id;

    public BankClient(String name, double income, int yearsinbank) {
        this.name = name;
        this.income = income;
        this.yearsinbank = yearsinbank;
        this.id = " ";

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsinbank() {
        return yearsinbank;
    }

    public void setYearsinbank(int yearsinbank) {
        this.yearsinbank = yearsinbank;
    }

    public String generateID() {
        int years = 2022 - yearsinbank;
        int random = (int) (Math.random() * (1000 - 100 + 1) + 100);
        if (name.length() >= 10) {
            String first = name.substring(0, 3);
            String last = name.substring(name.length() - 3);
            id = years + first + last + random;
            return id;
        } else {
            String first = name.substring(0, 3);
            id = years + first + random;
            return id;
        }
    }

    public double calculateSavings() {
        if (yearsinbank <= 5) {
            double ir = 0.05;
            double savings = (yearsinbank * income * ir);
            return savings;
        }else{
            double ie = 0.07;
            double saving = (yearsinbank * income * ie);
            return saving;
        }
    }
    public String cardType(){
        if(yearsinbank > 10 && income > 70000){
            return "Black card";
        } if(yearsinbank > 10 && income <= 70000){
            return "Gold card";
        }if(yearsinbank <= 10 && income > 70000){
            return "Silver card";
        } else{
            return "Regular card";
        }
    }
    public boolean equals(Object obj){
        BankClient oj = (BankClient) obj;
        return this.getName() == oj.getName() && this.getYearsinbank() == oj.getYearsinbank();
    }
}
class BankClienttest{
    public static void main(String[] args) {
        BankClient bc1 = new BankClient("Peter Jones", 45000.00, 5);
        BankClient bc2 = new BankClient("Sue Park", 56000.00, 12);
        BankClient bc3 = new BankClient("Sue Park", 80000.00, 12 );
        System.out.println(bc1.generateID());        //outputs 2017Petnes345
        System.out.println(bc2.generateID());        //outputs 2010Sue523
        System.out.println(bc1.calculateSavings());	//outputs 11250.00
        System.out.println(bc2.calculateSavings());	//outputs 47040.00
        System.out.println(bc1.cardType());			//outputs “Regular Card”
        System.out.println(bc2.cardType());			//outputs “Gold card”
        System.out.println(bc1.equals(bc2));			//outputs false
        System.out.println(bc3.equals(bc2));			//outputs true
    }
}

