package access_modifiers;

import Student.Student;

public class StudentChildDiffClass extends Student {

    public static void main(String[] args) {
        Student sc = new Student();
        sc.Company = "Google";

        System.out.println(sc.Company);

    }}