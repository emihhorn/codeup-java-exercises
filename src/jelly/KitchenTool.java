package jelly;

public class KitchenTool {

    KitchenTool() {

    }

    public Boolean isClean() {
        boolean clean = true;
        boolean dirty = false;
        if (clean) {
            System.out.println("it's clean");
            return true;
        } if (dirty) {
            System.out.println("That's dirty, do the dishes!");
        }
        return false;
    }


    public Boolean isDis(){
        return false;
    }

    //    Knife (should extend from KitchenTool)
    //    Plate (should extend from KitchenTool)
}
