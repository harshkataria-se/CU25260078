class Movie {

    String name;
    String genre;
    double rating;

    
    static String industry = "Bollywood";

    void displayDetails() {
        
        String movieName = name;
        String movieGenre = genre;
        double movieRating = rating;
        String movieIndustry = industry;

        System.out.println("Movie Name: " + movieName);
        System.out.println("Genre: " + movieGenre);
        System.out.println("Rating: " + movieRating);
        System.out.println("Industry: " + movieIndustry);
    }

    public static void main(String[] args) {
        Movie m = new Movie();

        m.name = "3 Idiots";
        m.genre = "Comedy Drama";
        m.rating = 8.4;

        m.displayDetails();
    }
}