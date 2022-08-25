public class MyDate {
    private int day;
    private int month;
    private int year;


    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }


    public boolean checkDate() {
        return year>1990&& (month>=1&&month<=12) && (day>=0&&day<=getDayPerMonth());
    }

    private boolean isLeapYear() {
        return year%4==0 && (year%100!=0 || year%400==0);
    }
    private int getDayPerMonth() {
        if (month==1||month==3||month==5||month==7||month==8||month==10||month==12) return 31;
        if (month==4||month==6||month==9||month==11) return 30;
        return isLeapYear()?29:28;
    }

    public void print(){
        if (checkDate()) {
            System.out.println(day + "-" + month + "-" + year);
        } else {
            System.out.println("error");
        }
    }

    public void specialCheckingAndPrint(){
        int f=13;

        class SpecialDate extends MyDate{

            public SpecialDate(int day, int month, int year) {
                super(day, month, year);
            }
            @Override
            public void print(){
                if (checkDate()) {
                    System.out.println("special check");
                    System.out.println(day + "-" + month + "-" + year);
                } else {
                    System.out.println("special print ERROR");
                }
            }
            @Override
            public boolean checkDate() {
                return year>1990&& (month>=1&&month<=12&&month!=8) && (day>=0&&day<=getDayPerMonth());
            }
        }

        SpecialDate date= new SpecialDate(this.day,this.month,this.year);
        date.print();
    }




}
