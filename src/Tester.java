public class Tester {
    public static void main(String[] args){
        LList<String> test = new LList<String>();
        test.prepend("General");
        test.append("Kenobi");
        test.prepend("Hello there!");
        System.out.println(test.toString());
    }
}
