public class DateAgeCalculator {

    private int yourAge;
    private int dateAge;


    public DateAgeCalculator(int yourAge){
        this.yourAge = yourAge;
    }
    public int lowestDateAge(){
        return yourAge / 2 +7;
    }

    public boolean isTooYoung(int age){
        return age <= lowestDateAge();
    }
}
