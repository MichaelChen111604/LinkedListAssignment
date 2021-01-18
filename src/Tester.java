public class Tester {
    public static void main(String[] args){

        LList<String> test = new LList<String>();
        for (int i = 0; i < 3; i ++){
            test.append(String.valueOf(i));
        }
        for (int i = 0; i < 30; i += 10){
            test.prepend(String.valueOf(i));
        }
        System.out.println(test.size());
        System.out.println(test);
        System.out.println(test.set(1, String.valueOf(10)));
        System.out.println(test);
    }
}
