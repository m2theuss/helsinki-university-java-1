public class Archive{
    private String name;
    private String identifier;

    public Archive(String name, String identifier){
        this.name = name;
        this.identifier = identifier;
    }

    public String getName(){
        return name;
    }

    public String getIdentifier(){
        return identifier;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Archive)){
            return false;
        }
        Archive compared = (Archive)obj;

        if( identifier.equals(compared.identifier)) {
            return true;
        }   
        return false;
    }
}