package lekcije_pre_oop;

public class printf {
    public static void main(String[] args) {
//        System.out.lekcije_pre_oop.printf("This is a format string %d",123);
        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Marko";
        int myInt = 31;
        double myDouble = 3.14;

//        System.out.lekcije_pre_oop.printf("%b\n",myBoolean);
//        System.out.lekcije_pre_oop.printf("%c\n",myChar);
//        System.out.lekcije_pre_oop.printf("%s\n",myString);
//        System.out.lekcije_pre_oop.printf("%d\n",myInt);
//        System.out.lekcije_pre_oop.printf("%f\n",myDouble);

        System.out.printf("Hello %10s", myString);


    }
}
