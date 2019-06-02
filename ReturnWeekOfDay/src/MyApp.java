import java.util.*;


public class MyApp
{
    /**
     * Get method(getDay) reuslt from Canlendar class 
     *
     * @param  int year , int month , int date
     * @return    String  day
     */
    public static String doGetDay(int year,int month,int date)
    {
        Calendar cal = new Calendar();
        String day = cal.getDay(year,month,date);
        return day;
    }
    static int year,month,date;
    static Boolean flag1,flag2,flag3,flag4,flag5,flag6,isLeapYear,is28,is29,is31,is30,final1=false,final2=false,final3=false;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input <year, month, day> ");
        while(true){
            try{
                System.out.print("Year(1~9999): ");
                String str1 = scanner.nextLine();
                if(str1.contains(" ")){
                    System.out.println("Invalid typing");
                }else{
                    year = Integer.parseInt(str1);
                    flag1 = 0 < year && year < 10000;
                    isLeapYear = ((year % 4 == 0) && (year % 100 !=0)) 
                                    || year % 400 == 0;
                    if(flag1){
                        final1 = true;
                        break;
                    } else{
                        System.out.println("<Error1>:Enter Again.");
                    }
                }
            }catch(NumberFormatException e){
                System.out.println("<Error1>:Enter Again.");
            }
        }
        while(true){
            try{
                System.out.print("Month : ");
                String str2 = scanner.nextLine();
                if(str2.contains(" ")){
                    System.out.println("Invalid typing.");
                }else{
                    month = Integer.parseInt(str2);
                    flag2 = 0 < month && month < 13;
                    is31 = (month == 1) || (month == 3) || (month == 5) 
                    || (month == 7)|| (month == 8) || (month == 10) 
                    || (month == 12);
                    is30 = (month == 4) || (month == 6) || (month == 9) 
                    || (month == 11);
                    is29 = (month ==2) && isLeapYear;
                    is28 = (month ==2) && (!isLeapYear);
                    if(flag2){
                        final2 = true;
                        break;
                    }else{
                        System.out.println("<Error2>:Enter Again.");
                    }
                }
            }catch(NumberFormatException e){
                System.out.println("<Error2>:Enter Again.");
            }
        }
        while(true){
            try{
                System.out.print("Date : ");
                String str3 = scanner.nextLine();
                if(str3.contains(" ")){
                    System.out.println("Invalid typing.");
                }else{
                    date = Integer.parseInt(str3);
                    flag3 = is31 && 1 <= date && date <= 31;
                    flag4 = is30 && 1 <= date && date <= 30;
                    flag5 = is28 && 1 <= date && date <= 28;
                    flag6 = is29 && 1 <= date && date <= 29;
                    if(flag3 || flag4 || flag5 || flag6){
                        final3 = true;
                        break;
                    } else{
                        System.out.println("<Error3>:Enter Again.");
                    }
                }
            }catch(NumberFormatException e){
                System.out.println("<Error3>:Enter Again.");
            }
        }
        if (final1 && final2 && final3){
            String dayOfWeek = doGetDay(year,month,date);
            System.out.println(year + " / " + month + " / " + date + " : " + dayOfWeek );
        }
    }
}