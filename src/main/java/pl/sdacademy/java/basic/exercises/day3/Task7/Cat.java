package pl.sdacademy.java.basic.exercises.day3.Task7;

import java.util.Objects;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    /*public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/
    public void makeSound(){
        System.out.println("Miau, miau");
    }
    public void eatMice(int mice){
        System.out.println("I ate " + mice + " mice");
    }
    void print(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
