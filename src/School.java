import java.util.List;

public class School {
    
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarn;
    private static int totalMoneySpent;

    /**
     * New School object is created
     * @param teachers list of teachers in the school
     * @param students list of student in the school
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarn = 0;
        totalMoneySpent = 0;
    }

    /**
     * @return the list of teachers in the school
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Add a teacher to the school
     * @param teachers the teacher to be added
     */
    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * @return the list of students in the school
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Add a student to the school
     * @param student the student to be added
     */
    public void addStudents(Student student) {
        students.add(student);
    }

    /**
     * @return the total money earned by the school
     */
    public int getTotalMoneyEarn() {
        return totalMoneyEarn;
    }

    /**
     * Adds the total money earned by the school
     * @param moneyEarn money that is supposed to be added
     */
    public static void updateTotalMoneyEarn(int moneyEarn) {
        totalMoneyEarn += moneyEarn;
    }

    /**
     * @return the total money spent by school
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * Update the money i.e. spent ny the school which is the salary given to its teachers
     * @param moneySpent the money spent  by the school
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarn -= moneySpent;
    }

}
