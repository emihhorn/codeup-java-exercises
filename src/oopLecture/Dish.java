package OopLecture;

public class Dish {

    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;


    public int shareCost() {
        return costInCents;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }
        public boolean getRecommendation(){
        return wouldRecommend;
}
//
        public void printSummary(){
            System.out.printf("Cost: 0.%d \nName: %s \nRecommend: %b",
                    costInCents, nameOfDish, wouldRecommend);

}

    }


