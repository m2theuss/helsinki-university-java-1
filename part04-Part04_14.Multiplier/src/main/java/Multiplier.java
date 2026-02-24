public class Multiplier{
    private int amount;

    public Multiplier(int amount){
        this.amount = amount;
    }
    public int multiply(int userNumber){
        return amount * userNumber;
    }
}