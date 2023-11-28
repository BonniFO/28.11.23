public class Main {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(1, 3);

//        fraction1.print();
//        fraction1.mult(fraction2);
//        fraction1.print();
//        System.out.println("count = " + Fraction.getCount());

        Person parent = new Person("Vlad", null);
        Person ann = new Person("Ann", parent);
        Person dima = new Person("Dima", parent);

        System.out.println(ann.name + " has parent " + ann.parent.name);
        System.out.println(dima.name);
        System.out.println(parent.parent);
    }
}