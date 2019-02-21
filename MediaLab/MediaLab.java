
/**
 * Write a description of class MediaLab here.
 *
 * @Jayden Graap
 * @2/6
 */
public class MediaLab
{
    // instance variables - replace the example below with your own
    public static void main()
    { 
       double totalCost = 0.0;
       int totalRating = 0;
       int numSongs = 0;
       double aveCost;
       double aveRating;
       double totalSongs;
       

       Song song1 = new Song();
       System.out.println("Welcome to your media library. "); 
       song1.setTitle("Satellite");
       song1.setRating(10);
       song1.setPrice(1.29);
       System.out.println(song1.getTitle());
       System.out.println("Rating: ");
       System.out.println(song1.getRating());
       numSongs = numSongs + 1;
       
       Song song2 = new Song(); 
       song2.setTitle("The Reckoning");
       song2.setRating(8);
       song2.setPrice(1.29);
       System.out.println(song2.getTitle());
       System.out.println("Rating: ");
       System.out.println(song2.getRating());
       numSongs = numSongs + 1;
       
       Song song3 = new Song(); 
       song3.setTitle("Supernova");
       song3.setRating(7);
       song3.setPrice(1.29);
       System.out.println(song3.getTitle());
       System.out.println("Rating: ");
       System.out.println(song3.getRating());
       numSongs = numSongs + 1;
       
       Song song4 = new Song(); 
       song4.setTitle("You Want a Battle? (Here's a war)");
       song4.setRating(8);
       song4.setPrice(1.29);
       System.out.println(song4.getTitle());
       System.out.println("Rating: ");
       System.out.println(song4.getRating());
       numSongs = numSongs + 1;
       
       Song song5 = new Song(); 
       song5.setTitle("Sham Pain");
       song5.setRating(7);
       song5.setPrice(1.29);
       System.out.println(song5.getTitle());
       System.out.println("Rating: ");
       System.out.println(song5.getRating());
       numSongs = numSongs + 1;
       
       Song song6 = new Song(); 
       song6.setTitle("The Black");
       song6.setRating(8);
       song6.setPrice(1.29);
       System.out.println(song6.getTitle());
       System.out.println("Rating: ");
       System.out.println(song6.getRating());
       numSongs = numSongs + 1;
       
       Song song7 = new Song(); 
       song7.setTitle("The Final Countdown");
       song7.setRating(8);
       song7.setPrice(1.29);
       System.out.println(song7.getTitle());
       System.out.println("Rating: ");
       System.out.println(song7.getRating());
       numSongs = numSongs + 1;

       totalCost = totalCost + song7.getPrice() + song6.getPrice() + 
       song5.getPrice() + song4.getPrice() + song3.getPrice() +
       song2.getPrice() + song1.getPrice();
       System.out.println(totalCost);
       
       totalRating = totalRating + song7.getRating() + song6.getRating() + 
       song5.getRating() + song4.getRating() + song3.getRating() +
       song2.getRating() + song1.getRating();
       System.out.println(totalRating);
       
       aveRating = totalRating / 7;
       System.out.println("The average rating is " + aveRating);
       
       aveCost = totalCost / 7;
       System.out.println("The average price is " + aveCost);
       
       
       Movie movie1 = new Movie(); 
       movie1.setTitle("9");
       System.out.println(movie1.getTitle());
       movie1.setRating(9);
       movie1.setPrice(5.00);
       movie1.setDuration(79);
       System.out.println(movie1.getPrice());
       System.out.println("Rating: ");
       System.out.println(movie1.getRating());
       System.out.println("This movie is " + movie1.getDuration() + " minutes long");
       
       
       Movie movie2 = new Movie(); 
       movie2.setTitle("Deadpool");
       System.out.println(movie2.getTitle());
       movie2.setRating(9);
       movie2.setPrice(7.99);
       movie2.setDuration(109);
       System.out.println(movie2.getPrice());
       System.out.println("Rating: ");
       System.out.println(movie2.getRating());
       System.out.println("This movie is " + movie2.getDuration() + " minutes long");
       
       
       Movie movie3 = new Movie(); 
       movie3.setTitle("Transformers: Revenge of the Fallen");
       System.out.println(movie3.getTitle());
       movie3.setRating(7);
       movie3.setPrice(14.99);
       System.out.println(movie3.getPrice());
       System.out.println("Rating: ");
       System.out.println(movie3.getRating());
       movie3.setDuration(150);
       System.out.println("This movie is " + movie3.getDuration() + " minutes long");
       
       Movie movie4 = new Movie(); 
       movie4.setTitle("Killjoy");
       System.out.println(movie4.getTitle());
       movie4.setRating(9);
       movie4.setPrice(7.67);
       movie4.setDuration(85);
       System.out.println(movie4.getPrice());
       System.out.println("Rating: ");
       System.out.println(movie4.getRating());
       System.out.println("This movie is " + movie4.getDuration() + " minutes long");
       
       
       Movie movie5 = new Movie(); 
       movie5.setTitle("Alien");
       System.out.println(movie5.getTitle());
       movie5.setRating(9);
       movie5.setPrice(14.99);
       movie5.setDuration(117);
       System.out.println(movie5.getPrice());
       System.out.println("Rating: ");
       System.out.println(movie5.getRating());
       System.out.println("This movie is " + movie5.getDuration() + " minutes long");
       
       totalCost = totalCost + movie5.getPrice() + song4.getPrice() +
       movie3.getPrice() + movie2.getPrice() + movie1.getPrice();
       System.out.println(totalCost);
       
       totalRating = totalRating + movie5.getRating() + song4.getRating() +
       movie3.getRating() + movie2.getRating() + movie1.getRating();
       System.out.println(totalRating);
       
       aveRating = totalRating / 5;
       System.out.println("The average rating is " + aveRating);
       
       aveCost = totalCost / 5;
       System.out.println("The average price is " + aveCost);
       
       Book book1 = new Book();
       book1.setTitle("Double Identity");
       System.out.println(book1.getTitle());
       book1.setRating(7);
       System.out.println("Rating: ");
       System.out.println(book1.getRating());
       
       
       Book book2 = new Book();
       book2.setTitle("Gears of War: Aspho Fields");
       System.out.println(book2.getTitle());
       book2.setRating(10);
       book2.setPrice(16.00);
       System.out.println("Rating: ");
       System.out.println(book2.getRating());
       
       
       Book book3 = new Book();
       book3.setTitle("Ready Player One");
       System.out.println(book3.getTitle());
       book3.setRating(8);
       book3.setPrice(12.89);
       System.out.println("Rating: ");
       System.out.println(book3.getRating());
       
       totalCost = totalCost + book3.getPrice() + book2.getPrice() +
       book1.getPrice();
       System.out.println(totalCost);
       
       totalRating = totalRating + book3.getRating() + book2.getRating() +
       book1.getRating();
       System.out.println(totalRating);
       
       aveRating = totalRating / 3;
       System.out.println("The average rating is " + aveRating);
       
       aveCost = totalCost / 3;
       System.out.println("The average price is " + aveCost);
    }
}
