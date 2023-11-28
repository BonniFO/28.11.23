public class Fraction {

    private int numerator;
    private int denomirator;
    private static int count = 0;

    public Fraction( int numerator, int denomirator){
        this.numerator = numerator;
        this.denomirator = denomirator;
        count++;
    }

    public static int getCount(){
        return count;
    }

    public void add(Fraction fraction) {
        int resultD = this.denomirator * fraction.denomirator;
        this.denomirator = resultD;
        int resultN = this.numerator * fraction.denomirator;
        this.numerator = resultN;

    }

    public void print(){
        System.out.println(numerator + "/" + denomirator);
    }

    public void mult(Fraction fraction) {
        this.denomirator = this.denomirator * fraction.denomirator;
        this.numerator = this.numerator * fraction.numerator;
    }

}
