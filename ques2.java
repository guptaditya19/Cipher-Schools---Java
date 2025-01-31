public class ques2 {
    public static void main(String[] args) {
        int intVar = 10;
        double doubleVar = 20.5;
        char charVar = 'A';
        boolean boolVar = true;
        System.out.println("Before conversion:");
        System.out.println("intVar: " + intVar);
        System.out.println("doubleVar: " + doubleVar);
        System.out.println("charVar: " + (int)charVar);
        System.out.println("boolVar: " + boolVar);
        double intToDouble = intVar;
        int charToInt = charVar; 
        System.out.println("After conversion:");
        System.out.println("intToDouble: " + intToDouble);
        System.out.println("charToInt: " + charToInt);
    }
}
