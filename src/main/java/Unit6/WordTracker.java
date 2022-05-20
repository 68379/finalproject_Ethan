package Unit6;

public class WordTracker {
    private String[] wordlist;
    private int index;
    private int[] e;

    public WordTracker(int length) {
        this.wordlist = new String[length];
        this.index = 0;
        this.e = new int[wordlist.length];

    }

    //    adds a single word and prints message
    public void addWord(String word) {
        if (index < wordlist.length) {
            wordlist[index] = word;
            index++;
            System.out.println(word + " succesfully added");
        } else {
            System.out.println("Adding failed, Array is full");
        }
    }

    //    prints all words in word list
    public void printWords() {
        for (int i = 0; i < wordlist.length; i++) {
            System.out.print(wordlist[i] + " ");
        }
        System.out.println("");
    }

    public String getShorttextWord() {
        String d = wordlist[0];
        for (int i = 1; i < wordlist.length; i++) {
            if (wordlist[i] != null && wordlist[i].length() < d.length()) {
                d = wordlist[i];
            }
        }
        return d;
    }

    public String getLongesttextWord() {
        String d = wordlist[0];
        for (int i = 1; i < wordlist.length; i++) {
            if (wordlist[i] != null && wordlist[i].length() > d.length()) {
                d = wordlist[i];
            }
        }
        return d;
    }

    public int countVowels(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            String letter = word.substring(i, i + 1);
            if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) {
                count++;
            }
        }
        return count;
    }

    public int[] getNumofVowels() {
        int[] d = new int[wordlist.length];
        for (int i = 0; i < wordlist.length; i++) {
            if (wordlist[i] != null) {
                d[i] = countVowels(wordlist[i]);
            }
        }
        return d;
    }

    public int[] getWordLength() {
        int[] g = new int[wordlist.length];
        for (int i = 0; i < wordlist.length; i++) {
            if (wordlist[i] != null) {
                g[i] = wordlist[i].length();
            }
        }
        return g;
    }
}

class Wordtrackertest{
    public static void main(String[] args) {
        WordTracker wt = new WordTracker(10);

//        add word to word list
        wt.addWord("cat");
        wt.addWord("bird");
        wt.addWord("dog");
        wt.addWord("monkey");
        wt.addWord("lizard");
        wt.addWord("ant");
        wt.addWord("bee");
        wt.addWord("butterfly");
        wt.addWord("snake");
        wt.addWord("turtle");
        wt.addWord("roses");

//        prints content
        wt.printWords();
        System.out.println(wt.getShorttextWord());
        System.out.println(wt.getLongesttextWord());

        int[] d = wt.getNumofVowels();
        for (int i = 0; i < d.length; i++) {
            System.out.println("Vowel " +  d[i] + " ");
        }


        int[] g = wt.getWordLength();
        for (int i = 0; i < g.length; i++) {
            System.out.println("length " + g[i] + " ");
        }
    }
}