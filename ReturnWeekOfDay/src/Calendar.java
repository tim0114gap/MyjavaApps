
public class Calendar
{
    /**
     * Calculate and return week of day. 
     *
     * @param  int year,int month,int date
     * @return    String dayOfWeek
     */
    public String getDay(int year,int month,int date)
    {
        String dayOfWeek = "";

        int totalDay = 0;
        for(int i = 1; i <= year; i++) {
            
            if (i < year) {
                for(int j = 1; j <= 12; j++) {
                    totalDay += MonthDays(i, j);
                }
                
            } else {
                for(int j = 1; j < month; j++) {
                    totalDay += MonthDays(i, j);
                }
            }
        }
        
        totalDay += date;
        
        switch (totalDay % 7) {
            case 0:
            dayOfWeek = "Sunday";
            break;
            case 1:
            dayOfWeek = "Monday";
            break;
            case 2:
            dayOfWeek = "Tuesday";
            break;
            case 3:
            dayOfWeek = "Wednesday";
            break;    
            case 4:
            dayOfWeek = "Thursday";
            break;
            case 5:
            dayOfWeek = "Friday";
            break;
            case 6:
            dayOfWeek = "Saturday";
            break;    
        }
        return dayOfWeek;
    }
    
    /**
     * Return days of month that applies to the conditions.
     *
     * @param  int year, int month
     * @return    String  dayOfMonth
     */
    public int MonthDays(int year, int month) {
        int dayOfMonth = 0;
        Boolean isLeapYear = ((year % 4 == 0) && (year % 100 !=0)) || year % 400 == 0;
        Boolean is31 = (month == 1) || (month == 3) || (month == 5) || (month == 7)
            || (month == 8) || (month == 10) || (month == 12);

        if (isLeapYear && month == 2) {
            dayOfMonth = 29;
        } else if (!isLeapYear && month == 2) {
            dayOfMonth = 28;
        } else if (is31) {
            dayOfMonth = 31;
        } else {
            dayOfMonth = 30;
        }
        return dayOfMonth;
    }
}
