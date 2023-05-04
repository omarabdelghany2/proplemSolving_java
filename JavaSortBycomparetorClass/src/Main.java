import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        Collections.sort(studentList, Comparator.comparingDouble(Student::getCgpa).reversed().thenComparing(Student::getFname).thenComparing(Student::getId));

        while (!studentList.isEmpty()){

            System.out.println(studentList.remove(0).getFname());
        }
    }
}