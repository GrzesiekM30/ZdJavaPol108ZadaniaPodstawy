package pl.sdacademy.java.basic.exercises.day3.Task8;

public class Main {
    public static void main(String[] args) {

        Poem [] poem = new Poem[3];
        Author author1=new Author("Cole","France");
        Author author2=new Author("Chodek","Poland");
        Author author3=new Author("Sule","Deutschland");
        poem [0] = new Poem(30,author1);
        poem [1] = new Poem(7,author2);
        poem [2] = new Poem(5,author3);
        authorChecking(poem).print();
        authorChecking(poem).printSurname();
    }
    private static Author authorChecking (Poem [] poem){
        Author author = poem[0].getAuthor();
       /* for (int i = 0; i < poem.length-1; i++){
            if (poem[i].getStropheNumbers()<poem[i+1].getStropheNumbers()) {
                author = poem[i+1].getAuthor();
            }
        }*/
        int max = 0;
        for (Poem element : poem){
            int stropheNumbers = element.getStropheNumbers();
            if (max < stropheNumbers){
                max = stropheNumbers;
                author = element.getAuthor();
            }
        }
        return author;
    }

}
