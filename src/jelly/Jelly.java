package jelly;

public class Jelly extends Ingredient{

    private int calories;

    Jelly() {
        super();
    }

    public void throwAway() {
        System.out.println("Throwing away jelly...");
    }

//    public void throwAway() {
//        System.out.println("Throwing away jelly...");
//    }
}



//- override the method, throwAway, in your Jelly,
// PeanutButter, and Bread classes to sout out a
// more specific
// message (e.g. "Throwing away Jelly...", etc.)