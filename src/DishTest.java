public class DishTest {
    public static void main(String[] args){

        Dish dish1 = new Dish();
        dish1.costInCents = 2500;
        dish1.nameOfDish = "Soup";
        dish1.wouldRecommend = true;


        Dish dish2 = new Dish();
        dish2.nameOfDish = "Tofu Burger";
        dish2.costInCents = 1100;
        dish2.wouldRecommend = true;

//        dish1.printSummary();


        System.out.println(DishTools.shoutDishName(dish1));
        System.out.println(DishTools.shoutDishName(dish2));
        System.out.println(DishTools.analyzeDishCost(dish1));
        System.out.println(DishTools.analyzeDishCost(dish2));
        System.out.println(DishTools.flipRecommendation(dish1));
    }
}
