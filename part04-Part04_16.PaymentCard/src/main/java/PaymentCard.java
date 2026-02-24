public class PaymentCard{
    private double balance;

    public PaymentCard(double initialBalance){
        this.balance = initialBalance;
    }
    public void eatAffordably() {
        if((balance - 2.60) >= 0){
            this.balance -= 2.60;
        }
    }
    public void eatHeartily() {
        if((balance - 4.60) >= 0){
            this.balance -= 4.60;
        }
    }
    public void addMoney(double amount){

        if((amount + balance) > 150){
            this.balance = 150.0; 
        }else if(amount < 0){
            return;
        }
        else{
            balance += amount;
        }
    }
    public String toString(){
        return "The card has a balance of " + this.balance + " euros";
    }
}