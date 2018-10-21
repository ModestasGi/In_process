package hackerrankchallenges.JAVApractice;

import java.util.*;

public class JavaSort {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        // additional line
        Compare a = new Compare();

        List<Student> studentList = new ArrayList<>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        // sorting line
        studentList.sort(a);
        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}
class Student{
    private int id;
    private String fname;
    private double cgpa;
    Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    int getId() {
        return id;
    }
    String getFname() {
        return fname;
    }
    double getCgpa() {
        return cgpa;
    }
}
class Compare implements Comparator {
    public int compare(Object param1, Object param2) {
        Student std1 = (Student) param1;
        Student std2 = (Student) param2;

        if (std1.getCgpa()==std2.getCgpa()) {
            if (std1.getFname().equals(std2.getFname())) {
                if (std1.getId() < std2.getId()) {
                    return 1;
                } else {
                    return -1;
                }
            } else {
                return std1.getFname().compareTo(std2.getFname());
            }
        } else if (std1.getCgpa() < std2.getCgpa()) {
            return 1;
        } else {
            return -1;
        }
    }
}
