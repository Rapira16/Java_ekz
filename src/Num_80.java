enum Day{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class Num_80 {
    public static void main(String[] args){
        Day today = Day.THURSDAY;
        switch (today){
            case MONDAY:
                System.out.println("Monday");
                break;
            case TUESDAY:
                System.out.println("Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Wedneday");
                break;
            case THURSDAY:
                System.out.println("Thursday");
                break;
            case FRIDAY:
                System.out.println("Friday");
                break;
            case SATURDAY:
                System.out.println("Saturday");
                break;
            case SUNDAY:
                System.out.println("Sunday");
                break;
        }
    }
}
