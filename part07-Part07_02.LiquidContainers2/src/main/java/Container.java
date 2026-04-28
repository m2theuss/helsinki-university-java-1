public class Container{
    private int contains;

    public Container(){
        this.contains = 0;
    }
    public int contains(){
        return this.contains;
    }
    public void add(int amount){
        if(amount > 0){
            if(amount + contains > 100){
                contains = 100;
            }else{
                contains += amount;
            }
        }
    }
    public void remove(int amount){
        if(amount > 0){
            if(contains - amount >= 0){
                contains -= amount; 
            }else{
                contains = 0;
            }
        }
    }
    public String toString(){
        return contains() + "/100";    
    }
}