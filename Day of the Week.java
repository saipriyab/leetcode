
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String dayOfWeek=java.time.LocalDate.of(year,month,day).getDayOfWeek().toString();
        return dayOfWeek.substring(0,1).toUpperCase()+dayOfWeek.substring(1).toLowerCase();
    }
}
