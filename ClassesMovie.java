public class ClassesMovie {
    public static void main(String[] args) {
    Movie obj5 = new Movie("HELLO JAVA MOVIE", "KHUBAIB DIRECTOR", 3.5);
     obj5.displayDetails();   
    }
}
class Movie {
    String title;
    String director;
    double rating;

    // Constructor
    public Movie(String title, String director, double rating) {
        this.title = title;
        this.director = director;
        this.rating = rating;
    }

    // Method to display movie details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Rating: " + rating);
    }

}

