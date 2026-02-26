
public class MainProgram {

    public static void main(String[] args) {
        Money firstMoneyObject = new Money(10, 0);
        Money secondMoneyObject = new Money(7, 40);
        System.out.println(firstMoneyObject.minus(secondMoneyObject)); 
    }
}
