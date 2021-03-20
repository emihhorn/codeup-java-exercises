package util;

public class InputTest {
    public static void main(String[] args) {
//        var input = new Input();
//        System.out.println("enter an integer");
//       try {
//           System.out.println(input.getInt());
//       }catch (NumberFormatException n){
//           System.out.println(n.getMessage());
//           System.out.println("Please enter an integer");
//       }finally{
//           System.out.println("The try catch is finished");
//       }
        var input1 = new Input();
        System.out.println("enter an integer");
        try {
            System.out.println(input1.getInt());
        } catch (NumberFormatException e) {
            System.out.println("Not valid");
            System.out.println(e.getMessage());
        }
    }
}
