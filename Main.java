import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myobj = new Scanner(System.in);
        Movie[] movies = new Movie[5];

        for (int i = 0; i < 5; i++) {

            System.out.print("Enter Director Name: ");
            String directorName = myobj.nextLine();

            System.out.print("Enter Director Age: ");
            int directorAge = myobj.nextInt();
            myobj.nextLine();

            System.out.print("Enter Nationality: ");
            String nationality = myobj.nextLine();

            Director director = new Director(directorName, directorAge, nationality);

            System.out.print("Enter Lead Actor Name: ");
            String leadActorName = myobj.nextLine();

            System.out.print("Enter Lead Actor Age: ");
            int leadActorAge = myobj.nextInt();
            myobj.nextLine();

            System.out.print("Enter Gender: ");
            char gender = myobj.nextLine().charAt(0);

            System.out.print("Enter Number of Movies: ");
            int numOfMovies = myobj.nextInt();
            myobj.nextLine();

            LeadActor leadActor = new LeadActor(leadActorName, leadActorAge, gender, numOfMovies);

            System.out.print("Enter Movie Name: ");
            String movieName = myobj.nextLine();

            System.out.print("Enter Budget: ");
            double budget = myobj.nextDouble();
            myobj.nextLine();

            System.out.print("Enter Rating: ");
            String rating = myobj.nextLine();

            System.out.print("Enter Year of Production: ");
            int yearOfProduction = myobj.nextInt();
            myobj.nextLine();

            Movie movie = new Movie(director, leadActor, movieName, budget, rating, yearOfProduction);

            movies[i] = movie;

        }

        for (int i = 0; i < 5; i++) {
            System.out.println("");
            movies[i].display();
        }
    }
}