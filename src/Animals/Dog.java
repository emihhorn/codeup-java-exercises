package Animals;

public class Dog extends Canine {

    private final String furColor;

    public Dog(String sound, String size, String subSpecies, String commonName, String furColor) {
        super(size, commonName, sound, subSpecies);
        this.furColor = furColor;
    }

//    @Override
    public void printEmote() {

    }

    public void makeSound() {
        System.out.println(sound + "\n");
    }
    public void printDelimiter(){
        System.out.println("****************************");
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
    public void printFurColor(){
        System.out.printf("Fur Color: %s\n", this.furColor);
    }
    public void printDetails(){
        makeSound();
        printDelimiter();
        printSubSpecies();
        printCommonName();
        printSize();
        printFurColor();
        printDelimiter();
    }

}
