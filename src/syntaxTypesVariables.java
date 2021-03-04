public class syntaxTypesVariables {


    public static void main(String [] args){
        //CODE BLOCKS ==================================
        {
            String sentence = "Hi, my name is";
            System.out.println(sentence);
        }
//byte	1	Very short integers from -128 to 127
        byte bite = 127;
        System.out.println(
                ((Object)bite)
                        .getClass()
                        .getName());
//short	2	Short integers from -32,768 to 32,767
        short shrt = 32000;
        System.out.println(
                ((Object)shrt)
                        .getClass()
                        .getName());
//int	4	Integers from -2,147,483,648 to 2,147,483,647
        int myInt = 2147483647;
        System.out.println(
                ((Object)myInt)
                        .getClass()
                        .getName());
//long	8	Long integers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long lng = 9223372036854775807L;
        System.out.println(
                ((Object)lng)
                        .getClass()
                        .getName());

        // ARITHMETICS ON DIFFERENT TYPES =======================

        byte bite1 = 111;
        byte bite2 = 1;
        var output = bite2 + bite1;
        System.out.println(((Object)output)
                .getClass()
                .getName());

        int maxInt = 2147483647;
        System.out.println(maxInt + 1);
        // or (these are the same)
        int minValue = Integer.MIN_VALUE;
        System.out.println(minValue + 1);

        int maxValue = Integer.MAX_VALUE;
        System.out.println(maxValue + (maxValue +3 ));
        //FLOAT & DOUBLE
//    float	4	Single-precision, floating-point numbers from -3.4E38 to 3.4E38 with up to 7 significant digits
//    double	8	Double-precision, floating-point numbers from -1.7E308 to 1.7E308 with up to 16 significant digits
        float flt = 1.1F; //this is okay if you need to use a decimal.
        float flt2 = 12345e4F; //you can use scientific notation.
        double dbl = 1.1; // there is no need for the F when using a decimal point

        //boolean
        boolean isTrue = true;
//    boolean isTrue = (1 > 2);
//    boolean isFalse = (1 < 2) && (1 > 2);

        char  letter = 'a'; //must use single quotes unless your using var
        char letter2 ='b';
        var  charOutput = letter + letter2; // the output will give you an integer if you look up the type.
        System.out.println(charOutput);
//      .getClass()
//      .getName());


// ++ -> Increment

// a++


        int i = 0;

        System.out.println("First Combo: " + (++i + i++ + i++));



    // =====CASTING=====

        Integer anInteger = 345;

        long along = anInteger;
                double aDouble = 345;

                System.out.println(aDouble);
                System.out.println(anInteger);

                var coolString = anInteger.toString();


    }
}


