import java.lang.Math;
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition){
        return new Money(euros + addition.euros, cents + addition.cents);
    }
    public boolean lessThan(Money compared){

        double totalCompared = (double)compared.euros + ((double)compared.cents / 10.0);
        double totalThis = (double)euros + ((double)cents / 100.0);

        if(totalThis < totalCompared){
            return true;
        }
        return false;
    }
    public Money minus(Money decrease){
        double tmpDecrease = (double)decrease.euros + ((double)decrease.cents / 100.0);

        double totalThis = (double)euros + ((double)cents / 100.0);

        double totalDecrease = Math.round((totalThis - tmpDecrease)* 10.0) / 10.0;

        double newCents = Math.round((totalDecrease % 1)* 10.0) / 10.0;
        
        double newEuros = totalDecrease - newCents;

        if(totalDecrease < 0){
            return new Money(0,0);
        }
        return new Money((int)newEuros, (int)(newCents * 100));

    }
    
}
