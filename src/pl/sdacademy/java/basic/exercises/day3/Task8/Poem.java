package pl.sdacademy.java.basic.exercises.day3.Task8;

public class Poem {
    private int stropheNumbers;
    private Author author;
    public Poem(int stropheNumbers, Author author){
        this.author = author;
        this.stropheNumbers = stropheNumbers;
    }
    void print(){
        System.out.println(this);
    }

    public int getStropheNumbers() {
        return stropheNumbers;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Poem{" +
                "stropheNumbers=" + stropheNumbers +
                ", author=" + author +
                '}';
    }
}
