package abstractstaff;

public class HireDate {

    private int month;
    private int date;
    private int year;

    public HireDate(int month, int date, int year){
        this.month = month;
        this.date = date;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "HireDate{" +
                "month=" + month +
                ", date=" + date +
                ", year=" + year +
                '}';
    }


}
