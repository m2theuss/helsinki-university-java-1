
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
    public void advance(){
        if(day == 30){
            day = 1;
            if(month == 12){
                month = 1;
                year++;
            }else{
                month++;
            }
            return;
        }
        day++;
    }
    public void advance(int howManyDays){
        for(int i = 0; i < howManyDays; i++){
            advance();
        }
    }
    public SimpleDate afterNumberOfDays(int days){
        SimpleDate sd = new SimpleDate(day, month, year);
        sd.advance(days);
        return sd;
    }

}
