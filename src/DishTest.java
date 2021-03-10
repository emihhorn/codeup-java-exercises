public class DishTest {
    public static void main(String[] args){

        Dish dish1 = new Dish();
        dish1.costInCents = 2500;
        dish1.nameOfDish = "Soup";
        dish1.wouldRecommend = true;

//        dish1.printSummary();


        System.out.println(DishTools.shoutDishName(dish1) + "\n");
        System.out.println(DishTools.analyzeDishCost(dish1) + "\n");
    }
}
