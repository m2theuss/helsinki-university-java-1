
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int princePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = princePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        if(this.squares > compared.squares){
            return true;
        }else{
            return false;
        }
    }

    public int priceDifference(Apartment compared){
        int first = (squares * princePerSquare) - (compared.squares * compared.princePerSquare);
        int second = (compared.squares * compared.princePerSquare) - (squares * princePerSquare);
        System.out.println(first + "second: " + second);
        if(first < 0){
            return second;
        }
        return first;
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        int calc = (squares * princePerSquare) - (compared.squares * compared.princePerSquare);
        if(calc > 0){
            return true;
        }
        return false;
    }
}
