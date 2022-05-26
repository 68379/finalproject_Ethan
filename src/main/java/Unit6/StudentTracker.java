package Unit6;

public class StudentTracker {
//1/1
    private Student[] classRecord;
    private int index;

    //1/1
    public StudentTracker() {
        this.classRecord = new Student[10];
        this.index = 0;
    }
//3/3
    public void addStudent(Student s){
        if(index<classRecord.length){
            classRecord[index] = s;
            index++;
            System.out.println("Student is successfully added...");
        } else System.out.println("Record is full");
    }

    //3/3
    public void printRecord(){
        for(int i = 0; i< classRecord.length; i++){
            if(classRecord[i] != null){
                System.out.println(classRecord[i]);
            }
        }
    }

    //technically 3
    public Student searchStudent(String name){
        Student d = classRecord[0];
        for(int i = 0; i<classRecord.length; i++){ //1
            if(classRecord[i].getName().equals(name)){ //1
                d = classRecord[i];
                break;
            }
        }
        return d;
    }

    //3
    public Student getOldestStudent(){
        int e = classRecord[0].getAge();
        Student s = classRecord[0];
        for(int i = 1; i< classRecord.length; i++){ //f1
            if(classRecord[i] == null){break;}
            else if(classRecord[i].getAge()>e){
                s = classRecord[i];
                e = classRecord[i].getAge();
            }
        }
        return s;
    }

    //4
    public double getClassAverage(){
        double tot = 0;
        double s = 0;
        for(int i = 0; i< classRecord.length; i++){
            if(classRecord[i] != null){
                tot += classRecord[i].getGrade();
                s++;
            }
        }
        return tot/s;
    }


    //4
    public Student getHighestAverageGrade(){
        double highest = classRecord[0].getGrade();
        Student s = classRecord[0];
        for(int i = 0; i<classRecord.length; i++){
            if(classRecord[i] == null){break;} else
            if(classRecord[i].getGrade() > highest){
                s = classRecord[i];
                highest = classRecord[i].getGrade();
            }
        }
        return s;
    }

    //3/3
    public int[] getStudentAges(){
        int[] ages = new int[classRecord.length];
        for(int i = 0; i<classRecord.length; i++){
            if(classRecord[i] != null){
                ages[i] = classRecord[i].getAge();
            }
        }
        return ages;
    }

    //7
    public String[] getPassingStudents(){
        int c = 0;
        for(int i = 0; i<classRecord.length; i++){
            if(classRecord[i].getGrade() >= 50){c++;}
        }
        String[] pass = new String[c];
        int index = 0;
        for(int j = 0; j<classRecord.length; j++){
            if(classRecord[j].getGrade() >= 50){
                pass[index] = classRecord[j].getName();
                index++;
            }
        }
        return pass;
    }

    //3
    public String[] passFailRemarks(){
        String[] r = new String[classRecord.length];
        for(int i = 0; i<classRecord.length; i++){
            if(classRecord[i].getGrade() >= 50){
                r[i] = "P";
            } else r[i] = "final1";
        }
        return r;
    }

    //3
    public void printByAge(int age){
        for(int i = 0; i<classRecord.length; i++){
            if(classRecord[i].getAge() >= age){
                System.out.print(classRecord[i].getName() + " ");
            }
        }
        System.out.println();
    }


    //4
    public Student[] groupStudents(int start, int end){
        Student[] s = new Student[(end-start) + 1];
        int index = 0;
        for(int i = start; i<= end; i++){
            s[index] = classRecord[i];
            index++;
        }
        return s;
    }

}

class  TestClassRecord{
    public static void main(String[] args) {

        StudentTracker cr = new StudentTracker();

        cr.addStudent(new Student("John", 16, 90));
        Student jane = new Student("Jane", 15, 99);
        cr.addStudent(jane);
        cr.addStudent(new Student("Anne", 17, 45));
        cr.addStudent(new Student("Joy", 16, 89));
        cr.addStudent(new Student("Sam", 15, 49));
        cr.addStudent(new Student("Jane", 18, 75));
        cr.addStudent(new Student("Phil", 15, 85));
        cr.addStudent(new Student("Ben", 19, 95));
        cr.addStudent(new Student("Erik", 19, 99));
        cr.addStudent(new Student("Nathan", 15, 89));

        System.out.println();
        System.out.println("Printing all students...");
        cr.printRecord();

        System.out.println();
        System.out.println("Searching Sam...");
        System.out.println(cr.searchStudent("Sam"));

        System.out.println();
        System.out.println("Finds the oldest student...");
        System.out.println(cr.getOldestStudent());

        System.out.println();
        System.out.println("Calculate the class average...");
        System.out.println(cr.getClassAverage());

        System.out.println();
        System.out.println("Finds a student with the highest-grade...");
        System.out.println(cr.getHighestAverageGrade());

        System.out.println();
        System.out.println("The list of student's ages...");
        int[] ages = cr.getStudentAges();
        for(int i = 0; i < ages.length; i++){
            System.out.print(ages[i] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Students with average >= 50...");
        String[] passing = cr.getPassingStudents();
        for(int i = 0; i < passing.length; i++){
            System.out.print(passing[i] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Pass or Fail remarks for each student...");
        String[] passFail = cr.passFailRemarks();
        for(int i = 0; i < passFail.length; i++){
            System.out.print(passFail[i] + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Printing students with age above 18...");
        cr.printByAge(18);


        System.out.println();
        System.out.println("Printing a group of students...");
        Student[] students = cr.groupStudents(2, 4);
        for (Student s: students) {
            System.out.println(s);
        }
    }
}

