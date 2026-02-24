public class MainProgram {
    public static void main(String[] args) {
        PaymentCard paulCard = new PaymentCard(20);
        PaymentCard mattCard = new PaymentCard(30);

        paulCard.eatHeartily();
        mattCard.eatAffordably();
        System.out.println("Paul: The card has a balance of " + paulCard);
        System.out.println("Matt: The card has a balance of " + mattCard);
        
        paulCard.addMoney(20);
        mattCard.eatHeartily();
        System.out.println("Paul: The card has a balance of " + paulCard);
        System.out.println("Matt: The card has a balance of " + mattCard);

        paulCard.eatAffordably();
        paulCard.eatAffordably();
        mattCard.addMoney(50);
        System.out.println("Paul: The card has a balance of " + paulCard);
        System.out.println("Matt: The card has a balance of " + mattCard);
    }
}