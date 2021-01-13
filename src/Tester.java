public class Tester {
    public static void main(String[] args){
        LList<String> test = new LList<String>();
        test.prepend(" Garbage");
        test.append(" Collector");
        test.prepend("Haha");
        test.append(" go");
        test.append(" brr");
        System.out.println(test.toString());
    }
}
