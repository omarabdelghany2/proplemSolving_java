import java.util.*;

public class Priorities {

   public List<Student> getStudents(List<String>events){

       final PriorityQueue<Student> queue =new PriorityQueue<>(Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student::getName).thenComparing(Student::getId));
       events.forEach((event)->{


           if(event.equals("SERVED")){
               queue.poll();
           }
           else {
               String [] details =event.split(" ");

                queue.add(new Student(Double.parseDouble(details[2]) , Integer.parseInt(details[3]) , details[1]));

           }
       });
               List <Student> students=new ArrayList<Student>();
               while (!queue.isEmpty()){

                   students.add(queue.poll());
               }
               return students;
   }
}
