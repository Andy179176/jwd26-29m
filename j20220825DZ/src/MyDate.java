import Exceptions.IncorrectDateException;

public class MyDate {
    static private final String DATE_FORMAT =
            "^ *(([012][0-9])|([3][01]))[-/:.]{0,1}(([0][1-9])|([1][012]))[-/:.]{0,1}(([0-9]{2})|([0-9]{4})) *$";

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) throws IncorrectDateException {
        this.day = day;
        this.month = month;
        this.year = year;
        if(!isDateCorrect()) throw new IncorrectDateException();
    }


    private static boolean validateDateString(String dateString) {
        if (dateString ==null) return false;
        return dateString.matches(DATE_FORMAT);
    }


    /**
     *
     * @param dateString
     *              "ddmmyy" or "ddmmyyyy"
     *              day, month and year can be separated by one of the characters '/', ':', '.' or '-'
     *              for example dd-mm-yy or dd/mm/yyyy
     *
     * @throws IncorrectDateException
     */
    public static MyDate valueOf(String dateString) throws IncorrectDateException {
        int day, month,year;
        if(!validateDateString(dateString)) throw new IncorrectDateException(); ;
        dateString = dateStringPreprocessing(dateString);
        if(dateString.length()<6|| dateString.length()>8) throw new IncorrectDateException();

        try {
            day=Integer.parseInt(dateString.substring(0,2));
            month=Integer.parseInt(dateString.substring(2,4));
            year = Integer.parseInt((dateString.length()>=8)? dateString.substring(4,8):"20"+dateString.substring(4,6));
        } catch (Exception e){
            throw new IncorrectDateException();
        }
        return new MyDate(day,month,year);
    }

    private static String dateStringPreprocessing(String dateString) {
        return dateString = dateString.replaceAll("[ -/:\\.]","");
    }


    @Override
    public String toString() {
        return getWithLeadChar(day)+"-"+ getWithLeadChar(month) + "-" +year;
    }
    private String getWithLeadChar(int num){
        return (num>=1&&num<=9)?"0"+num:String.valueOf(num);
    }



    private boolean isDateCorrect() {

        return  year>0 &&
                (month >0 && month <=12) &&
                (day>=1 && day<= getDayPerMonth());
    }

    public int getDayPerMonth() {
        int[] days={0,31,28,31,30,31,30,31,31,30,31,30,31};
        return month!=2?days[month]: (isLeapYear()?29:28);
    }

    public boolean isLeapYear() {
        return year%4==0 && (year%100!=0 || year%400==0);
    }
}
