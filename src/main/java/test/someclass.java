package test;

public class someclass {
    //attributes
    int num1;
    int num2;

    //constructor
    public someclass(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public boolean isEqual(){
        boolean isEqual = num1 == num2;
        return isEqual;
    }

    public boolean isEqual2(){
        if(num1 == num2) {
            return true;
        } else
            return false;
    }
    public boolean isLong(String word){
        //after the compiler finds the word return
        //the compiler exits the method
        if(word.length() > 10 ) {
            return true;
        }else
            return false;
    }
    public boolean isLengthEven(String word){
        if(word.length() % 2 == 0){
            return true;
        }else
            return false;
    }
}
class TestSomeClass{
    public static void main(String[] args) {
        someclass sc = new someclass(2,4);
        System.out.println(sc.isEqual());
        System.out.println(sc.isLong("programming"));
        System.out.println(sc.isLengthEven("computer"));
    }
}