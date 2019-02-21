
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;  
    private double price = 0;
    /**
     * Constructor for objects of class Song
     */
    public Book()
    {
        // initialise instance variables
        rating = 0;
        title = "";
        
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String t) {
        title = t;
    }
    public Integer getRating(){
        return rating;
    }
    public void setRating(int r){
        rating = r;
    }
    public Double getPrice(){
        return price;
    }
    public void setPrice(double p){
        price = p;
    } 
}
