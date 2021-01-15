public class Tester {
    public static void main(String[] args){

        LList<String> test = new LList<String>();
        for (int i = 0; i < 30; i ++){
            test.append(String.valueOf(i));
        }
        System.out.println(test + " size " + String.valueOf(test.size()));
        test.prepend(String.valueOf(1));
        System.out.println(test + " size " + String.valueOf(test.size()));
        System.out.println(test.set(3, String.valueOf(69)));
        System.out.println(test);
    }
}
