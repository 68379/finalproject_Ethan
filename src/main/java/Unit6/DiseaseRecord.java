package Unit6;

import java.util.Locale;

public class DiseaseRecord {
    private DiseaseInformation[] record;
    private int index;


    public DiseaseRecord() {
        this.record = new DiseaseInformation[10];
        this.index = 0;
    }

    public void add(DiseaseInformation df) {
        if (index < record.length) {
            record[index] = df;
            index++;
            System.out.println("Information successfully added");
        } else System.out.println("Record is full");
    }

    public void displayDiseaseInfo() {
        for (int i = 0; i < record.length; i++) {
            if (record[i] != null) {
                System.out.println(record[i]);
            }
        }
    }

    public int getLongestEstimatedTime() {
        int d = record[0].getTime();
        for (int i = 0; i < record.length; i++) {
            if (record[i].getTime() > d) {
                d = record[i].getTime();
            }
        }
        return d;
    }

    public int getShortestEstimatedTime() {
        int d = record[0].getTime();
        for (int i = 0; i < record.length; i++) {
            if (record[i].getTime() < d) {
                d = record[i].getTime();
            }
        }
        return d;
    }

    public double getAverageTime() {
        double tot = 0;
        double s = 0;
        for (int i = 0; i < record.length; i++) {
            if (record[i] != null) {
                tot += record[i].getTime();
                s++;
            }
        }
        return tot / s;
    }

    public String getLongestDisseaseName() {
        int d = record[0].getName().length();
        int f = 0;
        for (int i = 0; i < record.length; i++) {
            if (record[i].getName().length() > d) {
                d = record[i].getName().length();
                f = i;
            }
        }
        return record[f].getName();
    }

    public String[] getDiseaseNamesAtOddIndex() {
        String[] d = new String[record.length / 2];
        int g = 0;
        for (int i = 1; i < record.length; i = i + 2) {
            d[g] = record[i].getName();
            g++;
        }
        return d;
    }


    public DiseaseInformation[] getDiseaseInfoFromTo(int startIndex, int endIndex) {
        Unit6.DiseaseInformation[] s = new DiseaseInformation[(endIndex - startIndex) + 1];
        int index = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            s[index] = record[i];
            index++;
        }
        return s;
    }

    public String[] getDiseasesThatStartsWith(String letter) {
        int count = 0;
        for (int i = 0; i < record.length; i++) {
            if (record[i] != null && record[i].getName().substring(0, 1).toLowerCase(Locale.ROOT).equals(letter)) {
                count++;
            }
        }
        String[] s = new String[count];
        int index = 0;
        for (int i = 0; i < record.length; i++) {
            if (record[i] != null && record[i].getName().substring(0, 1).toLowerCase(Locale.ROOT).equals(letter)) {
                s[index] = record[i].getName();
                index++;
            }
        }
            return s;

        }


    public int[] getTimesShorterThan(int hour) {
        int count = 0;
        for (int i = 0; i < record.length; i++) {
            if (record[i] != null && record[i].getTime() < hour) {
                count++;
            }
        }
        int[] times = new int[count];
        int index = 0;
        for (int i = 0; i < record.length; i++) {
            if (record[i] != null && record[i].getTime() < hour) {
                times[index] = record[i].getTime();
                index++;
            }
        }
        return times;
    }

    public DiseaseInformation[] getDiseaseInfoWithinRange(int timeRange) {
        int count = 0;
        for (int i = 0; i < record.length; i++) {
            if (record[i] != null && record[i].getTime() > 0 && record[i].getTime() <= timeRange * 2) {
                count++;
            }
        }
            DiseaseInformation[] d = new DiseaseInformation[count];
            int index = 0;
            for (int j = 0; j < record.length; j++) {
                if (record[j] != null && record[j].getTime() > 0 && record[j].getTime() <= timeRange * 2) {
                    d[index] = record[j];
                    index++;
                }
            }
            return d;
    }
}

class testER {

    public static void main(String[] args) {
        DiseaseRecord dr = new DiseaseRecord();

        System.out.println("Adding disease info...");
        dr.add(new DiseaseInformation("Accident Wound", 3));
        dr.add(new DiseaseInformation("Scrape", 2));
        dr.add(new DiseaseInformation("Knee Injury", 8));
        dr.add(new DiseaseInformation("Knife Cut", 1));
        dr.add(new DiseaseInformation("Diarrhea", 5));
        dr.add(new DiseaseInformation("Car crash injury", 24));
        dr.add(new DiseaseInformation("Sprain", 3));
        dr.add(new DiseaseInformation("Fever/Vomiting", 8));
        dr.add(new DiseaseInformation("Common Cut", 1));
        dr.add(new DiseaseInformation("Vomiting", 5));
        System.out.println();

        System.out.println("Printing Disease Info");
        dr.displayDiseaseInfo();
        System.out.println();

        System.out.println("Longest Time....");
        System.out.println(dr.getLongestEstimatedTime());
        System.out.println();

        System.out.println("Shortest Time...");
        System.out.println(dr.getShortestEstimatedTime());
        System.out.println();

        System.out.println("Average Time...");
        System.out.println(dr.getAverageTime());
        System.out.println();

        System.out.println("Longest Disease Name...");
        System.out.println(dr.getLongestDisseaseName());
        System.out.println();

        System.out.println("Disease Names at Odd Indexes...");
        String[] d1 = dr.getDiseaseNamesAtOddIndex();
        for(String d: d1){
            System.out.print(d + " ");
        }
        System.out.println();
        System.out.println();


        System.out.println("Disease Info from index to index...");
        DiseaseInformation[] di = dr.getDiseaseInfoFromTo(1, 4);
        for(DiseaseInformation d: di){
            System.out.println(d);
        }
        System.out.println();

        System.out.println("Diseases that start with S...");
        String[] d2 = dr.getDiseasesThatStartsWith("s");
        for(String d: d2){
            System.out.print(d + " ");
        }
        System.out.println();
        System.out.println();


        System.out.println("Times shorter than 5...");
        int[] times = dr.getTimesShorterThan(5);
        for(int t: times){
            System.out.print(t + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("DiseaseInfo within +- range...");
        DiseaseInformation[] dwr = dr.getDiseaseInfoWithinRange(3);
        for(DiseaseInformation d: dwr){
            System.out.println(d);
        }
    }
}

