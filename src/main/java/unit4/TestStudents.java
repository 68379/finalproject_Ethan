package unit4;

public class TestStudents {
    public static void main(String[] args) {
        Student s1 = new Student("John", 89);
        Student s2 = new Student("John", 89);
        Student s3 = s1;

        boolean isTheSameStudent = s1 == s2;
        System.out.println(isTheSameStudent);

        boolean isSameName = s1.getName() == s2.getName();
        System.out.println(isSameName);
    }
}
