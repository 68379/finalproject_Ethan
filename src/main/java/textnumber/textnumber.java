package textnumber;

public class textnumber {

    public int countVowels(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            String l = text.substring(i, i + 1);
            if(l.equals("a") ||
                    l.equals("e") ||
                    l.equals("i") ||
                    l.equals("o") ||
                    l.equals("u")){
                count++;
            }
        }
        return count;
    }


    public String textBackwards(String text) {
        String s = "";
        for(int i = text.length(); i != 0; i--){
            String l = text.substring(text.length()-1);
            s += l;
            text = text.substring(0, text.length() - 1);
        }
        return s;
    }


    public boolean isANumber(String text) {
        int c = 0;
        for (int i = 0; i < text.length(); i++) {
            char s = text.charAt(i);
            if (Character.isDigit(s)) {
                c++;
            }
        }
        return c == text.length();
    }


public String digitSum(int num){
    if(isANumber(String.valueOf(num))){
        int sum = 0;
        while( num > 0){
            sum += num % 10;
            num /= 10;
        }
        return String.valueOf(sum);
    }else{
        return "Please enter a number";
    }
    }
}