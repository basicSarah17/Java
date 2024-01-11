class Movie {
    private Director director;
    private LeadActor leadActor;
    private String movieName;
    private double movieBudget;
    private String movieRating;
    private int yearOfProduction;

    public Movie(Director director, LeadActor leadActor, String movieName, double movieBudget, String movieRating, int yearOfProduction) {
        this.director = director;
        this.leadActor = leadActor;
        this.movieName = movieName;
        this.movieBudget = movieBudget;
        this.movieRating = movieRating;
        this.yearOfProduction = yearOfProduction;
    }


    public void setDirector(Director director)
    {
        this.director = director;
    }

    public Director getDirector()
    {
        return director;
    }



    public void setLeadActor(LeadActor leadActor)
    {
        this.leadActor = leadActor;
    }
    public LeadActor getLeadActor()
    {
        return leadActor;
    }



    public void setMovieName(String movieName)
    {
        this.movieName = movieName;
    }
    public String getMovieName()
    {
        return movieName;
    }



    public void setMovieBudget(double movieBudget)
    {
        this.movieBudget = movieBudget;
    }
    public double getMovieBudget()
    {
        return movieBudget;
    }



    public void setMovieRating(String movieRating)
    {
        this.movieRating = movieRating;
    }
    public String getMovieRating() {
        return movieRating;
    }




    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }




    public void display() {
        System.out.println("Movie:");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Movie rating: " + movieRating);
        System.out.println("Movie year of Production: " + yearOfProduction);
        System.out.println("Movie budget: " + movieBudget);

        System.out.println("\n");
        director.display();
        System.out.println("\n");
        leadActor.display();
        System.out.println("\n");
    }
}

