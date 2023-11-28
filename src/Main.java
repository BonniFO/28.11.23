import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(1, 3);

//        fraction1.print();
//        fraction1.mult(fraction2);
//        fraction1.print();
//        System.out.println("count = " + Fraction.getCount());

//        Person ann = new Person("Ann");
//        Person dima = new Person("Dima");

        Teacher mathTeacher = new Teacher("Tet", 1, "math");
        Teacher historyTeacher = new Teacher("Evgeny", 5, "history");



        Student ivan = new Student("Ivan", 2, mathTeacher, historyTeacher);
        Student kolya = new Student("Kolya", 3, mathTeacher, historyTeacher);
        Student ann = new Student("Ann", 3, mathTeacher, historyTeacher);

        Person[] group = new Person[]{ivan, kolya, ann, mathTeacher, historyTeacher};

        for (Person person: group) {
            int studentId = person.id;
            String studentName = person.name;
            System.out.println("My name is " + person.name + " my id number " + person.id);

        }

        LocalDate date1 = LocalDate.of(2023, 11, 28);
        LocalDate date2 = LocalDate.of(2023, 4, 28);


        System.out.println(date1.isBefore(date2));






    }

}