package Animals;

public abstract class Canine implements Describable{

    protected final String size;
    protected final String commonName;
    protected final String subSpecies;
    protected final String sound;

    public Canine(String size, String commonName, String sound, String subSpecies){
        this.size = size;
        this.commonName = commonName;
        this.subSpecies = subSpecies;
        this.sound = sound;
    }

    public abstract void printEmote();

    public void makeSound() {
        System.out.println(sound + "\n");
    }

    public void printDelimiter(){
        System.out.println();
    }
    public void printSubSpecies(){
        System.out.printf("Sub-Species: %s\n", this.subSpecies);
    }
    public void printCommonName(){
        System.out.printf("Common Name: %s\n", this.commonName);
    }
    public void printSize(){
        System.out.printf("Size: %s\n", this.size);
    }


}
