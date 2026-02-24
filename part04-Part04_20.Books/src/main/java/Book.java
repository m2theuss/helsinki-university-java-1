public class Book{
    private String title;
    private int pages;
    private int year;

    public Book(String title, int year, int pages){
        this.title = title;
        this.year = year;
        this.pages = pages;
    }

    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getPages(){
        return this.pages;
    }
    public void setPages(int pages){
        this.pages = pages;
    }

    @Override
    public String toString(){
        return getTitle() + ", " + getPages() + " pages, " + getYear();
    }
}