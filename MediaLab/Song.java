
/**
 * Write a description of class Song here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Song
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;
    private double price = 0.0;
    private boolean favorite;
    private double totalCost;
    private static int numSongsInLibrary;
    public Song() {
        rating = 0;
        title = "";
    }
    /**
     * Constructor for objects of class Song
     */
    public Song(String title, double price)
    {
        // initialise instance variables
        this.title = title;
        this.price = price;
        this.rating = rating;
        numSongsInLibrary = numSongsInLibrary + 1;
    }
    public Song(String title, double price, int rating) {
        this.title = title;
        this.price = price;
        this.rating = rating;
        
        numSongsInLibrary = numSongsInLibrary + 1;
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
    public void addToFavorites(){
     favorite = true;   
    }
}