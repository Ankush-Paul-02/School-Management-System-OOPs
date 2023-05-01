import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Teacher Deepon = new Teacher(001, "Deepon Das", 4000);
        Teacher Siddhant = new Teacher(002, "Siddhant Mahato", 5000);
        Teacher Soumili = new Teacher(003, "Soumili Mukherjee", 4500);
        
        List<Teacher> teachersList = new ArrayList<Teacher>();
        teachersList.add(Deepon);
        teachersList.add(Siddhant);
        teachersList.add(Soumili);

        Student Shouvik = new Student(001, 3, "Shouvik Guha");
        Student Sukanta = new Student(002, 1, "Sukanta Das");
        Student Ankush = new Student(003, 2, "Ankush Paul");

        List<Student> studentsList = new ArrayList<>();
        studentsList.add(Shouvik);
        studentsList.add(Sukanta);
        studentsList.add(Ankush);

        School nsv = new School(teachersList, studentsList);
        System.out.println("NSV has earned: $" + nsv.getTotalMoneyEarn());

        Ankush.payFees(6000);
        System.out.println("NSV has earned: $" + nsv.getTotalMoneyEarn());
        Sukanta.payFees(5000);
        System.out.println("NSV has earned: $" + nsv.getTotalMoneyEarn());

        System.out.println("--------Making school pay salary-------");
        Deepon.receiveSalary(Deepon.getSalary());
        System.out.println("NSV has spent for salary to " + Deepon.getName() + " and now has: " + nsv.getTotalMoneyEarn());

        Siddhant.receiveSalary(Siddhant.getSalary());
        System.out.println("NSV has spent for salary to " + Siddhant.getName() + " and now has: " + nsv.getTotalMoneyEarn());

        System.out.println(Ankush);
        System.out.println(Deepon);

    }
}
