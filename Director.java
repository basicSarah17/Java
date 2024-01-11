class Director extends Person {
    private String nationality;

    public Director(String name, int age, String nationality) {
        super(name, age);
        this.nationality = nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void display() {
        System.out.println("Director name: " + getName());
        System.out.println("Director age: " + getAge());
        System.out.println("Nationality: " + nationality);
    }
}

