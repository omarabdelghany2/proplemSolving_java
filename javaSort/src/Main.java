import java.util.*;



//Complete the code
public class Main
{
    public static void main(String[] args){
        PriorityQueue<Student>myQueue = new PriorityQueue<Student>(Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student::getFname).thenComparing(Student::getId));
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
        while (!studentList.isEmpty()){

            myQueue.add(studentList.remove(0));
        }
        while (!myQueue.isEmpty()){

            System.out.println(myQueue.remove().getFname());
        }


    }
}



