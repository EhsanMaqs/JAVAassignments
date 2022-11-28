public class Main {
    public static void main(String[] args) {
        Person maqsood = new Person("Maqsood", 25);
        Person futureMe = new Person("Maqsood", 26);
        Person pastMe = new Person("Maqsood", 24);
        Person olga = new Person("Olga", 22);

        maqsood.printIntroduction();
        futureMe.printIntroduction();
        pastMe.printIntroduction();
        olga.printIntroduction();
    }
}