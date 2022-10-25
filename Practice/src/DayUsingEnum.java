public class DayUsingEnum {

    public static void displayDay(Day day){
        System.out.println(day);
    }
    enum Day{
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }
}

class Main4{
    public static void main(String[] args) {
        DayUsingEnum.displayDay(DayUsingEnum.Day.SUNDAY);
    }
}