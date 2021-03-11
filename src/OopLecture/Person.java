import java.sql.SQLOutput;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {

    }

    public String getName(){
//TODO: return the person's name
        return name;
    }

    public void setName(String name){
//TODO: change the name property to the passed value
    this.name = name;
    }


    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello " + name);

        }
        public static void main(String[] args){
            Person p1 = new Person("Emily");
//            p1.name = "Jane";
            p1.sayHello();
            p1.setName("Jane");
            p1.sayHello();
            System.out.println(p1.getName());
    }
}
