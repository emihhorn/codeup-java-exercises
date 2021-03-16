package Animals;

public abstract class Giraffids implements Describable {

    protected final String height;

    protected final String UnguligradeSpecies;
    protected final String sound;

    public Giraffids(String height, String sound, String UnguligradeSpecies){
        this.height = height;

        this.UnguligradeSpecies = UnguligradeSpecies;
        this.sound = sound;
    }

    public abstract void printEmote();

    public void makeSound() {
        System.out.println(sound + "\n");
    }

    public void printDelimiter(){
        System.out.println();
    }
    public void printUnSpecies(){
        System.out.printf("Unguligrade-Species: %s\n", this.UnguligradeSpecies);
    }

    public void printSize(){
        System.out.printf("Size: %s\n", this.height);
    }

}
