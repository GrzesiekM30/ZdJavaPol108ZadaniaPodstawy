package pl.sdacademy.java.basic.exercises.day3.Task8;

public class Author {
    private String surname;
    private String nationality;
    public Author(String surname, String nationality){
        this.surname = surname;
        this.nationality = nationality;
    }
    void print(){
        System.out.println(this);
    }void printSurname(){
        System.out.println("Surname: "+ surname);
    }

    @Override
    public String toString() {
        return "Author:\n" +
                "surname=" + surname + "\n" +
                "nationality=" + nationality + "\n";
    }
}
