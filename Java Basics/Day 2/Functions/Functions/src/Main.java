public class Main {
    public static void main(String[] args) {

        getNamePrinted("Ryan James");
//        getAge(25);
        int cal = Paycheck(11);

        System.out.println("Cal: " + cal);

        int age = Age(25);
        System.out.println("I am " + age + " Years Old");
    }

    public static int Age(int a) {
        return a;
    }

    public static void getNamePrinted(String name) {
        System.out.println("Hello: " + name);
    }

//    public static void getAge(int a) {
//        System.out.println("Age: " + a);
//    }

    public static int Paycheck(int a) {
        return a * 15;

    }
}