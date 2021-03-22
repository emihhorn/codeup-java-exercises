package prep;

public class Food {

    //todo:has private properties for String name, String description, and int calories
    // takes in arguments in constructor in order to assign values to those properties (this.prop = value;)
    // You will need to both define the constructor as able to throw the exception and also conditionally actually throw the exception in the method body of the constructor
    // create public getter and setter methods for each property
    // HINT: there is a shortcut in Intellij that will do this for you

    private String name;
    private String description;
    private int calories;

    public void food(String name, String description, int calories) {
        try {
           this.name = name;
           this.description = description;
           this.calories = calories;
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("Input not correct");
        }
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getCalories () {
        return calories;
    }
}
