import java.util.Locale;

public class DishTools {
    public static final int averageCost = 1300;

    public static final String shoutDishName(Dish a){
        return a.nameOfDish.toUpperCase();
    }


    public static final String analyzeDishCost(Dish a){
        if (a.costInCents > averageCost) {
            return "More expensive than average";
        }else  if (a.costInCents < averageCost) {
            return "Less expensive than average";
        }else{
            return "That's average";
        }
    }


}
