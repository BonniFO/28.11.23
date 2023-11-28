public class Teacher extends Person {

    public String subject;

    public Teacher (String name, int id, String subject) {
        super(name, id);
        this.subject = subject;

    }

    public String getSubject () {
        return subject;
    }

    public String getName () {
        return name;
    }

    public void printName() {
        System.out.println(name);
    }
}
