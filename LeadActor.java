public class LeadActor extends Person {
    private int numOfMovies;
    private char gender;

    public LeadActor(String name, int age, char gender, int numOfMovies) {
        super(name, age);
        this.gender = gender;
        this.numOfMovies = numOfMovies;
    }
    public void setNumOfMovies(int numOfMovies)
    {
        this.numOfMovies = numOfMovies;
    }
    public int getNumOfMovies() {
        return numOfMovies;
    }

    public void setGender(char gender)
    {
        this.gender = gender;
    }
    public char getGender()
    {
        return gender;
    }

    public void display() {
        System.out.println("Lead Actor name: " + getName());
        System.out.println("Lead Actor age: " + getAge());
        System.out.println("Lead Actor gender: " + gender);
        System.out.println("Lead Actor number of movies: " + numOfMovies);
    }
}