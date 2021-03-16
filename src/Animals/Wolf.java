package Animals;

public class Wolf extends Canine {
    private final boolean isEndangered;
    private final String nativeArea;


    public Wolf(String sound, String size, String subSpecies, String commonName, boolean isEndangered, String nativeArea) {
        super(size, commonName, sound, subSpecies);
        this.isEndangered = isEndangered;
        this.nativeArea = nativeArea;
    }

    @Override
    public void printEmote() {
        System.out.println("*Stares at the moon*");

    }

    public void printDelimiter(){
        System.out.println("****************************");
    }

    public void printEndangeredStatus(){
        System.out.printf("Endangered: %s\n", getEndangeredStatus());
    }

    public void printNativeArea(){
        System.out.printf("Native Area: %s\n\n", this.nativeArea);
    }

    public void printDetails(){
        makeSound();
        printDelimiter();
        printSubSpecies();
        printCommonName();
        printNativeArea();
        printSize();
        printEndangeredStatus();
        printDelimiter();
    }
    private String getEndangeredStatus(){
        if (isEndangered){
            return "No";
        }else{
            return "Yes";
        }
    }

}
