package Hackerrank;

import java.util.*;

/*
 * Create the Student and Priorities classes here.
 */
class Student{
    private final int id;
    private final String name;
    private final double cgpa;
    Student(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    public int getID(){return this.id;}
    public String getName(){return this.name;}
    public double getCGPA(){return this.cgpa;}
}

class Priorities{
    public List<Student> getStudents(List<String> events){
        PriorityQueue<Student> stud_q = new PriorityQueue<>(Comparator.comparing(Student::getCGPA).reversed().thenComparing(Student::getName).thenComparing(Student::getID));
        List<Student> student = new ArrayList<>();
        for (String str: events) {
            Scanner sc = new Scanner(str);
            String event = sc.next();
            if(event.equals("ENTER")){
                String name = sc.next();
                double cgpa = sc.nextDouble();
                int id = sc.nextInt();
                stud_q.add(new Student(id,name,cgpa));
            } else if (event.equals("SERVED")) {
                stud_q.poll();
            }

        }

        Student first = stud_q.poll();
        if (first!=null){
            while(first != null){
                student.add(first);
                first = stud_q.poll();
            }
        }
        return student;

    }
}

class Priority_Qeue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}