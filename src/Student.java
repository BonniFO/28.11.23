public class Student extends Person {

    public Teacher mathTeacher;
    public Teacher historyTeacher;

    public Student (String name, int id, Teacher mathTeacher, Teacher historyTeacher) {
        super(name, id);
        this.mathTeacher = mathTeacher;
        this.historyTeacher = historyTeacher;
    }
}
