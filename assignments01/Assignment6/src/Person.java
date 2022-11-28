public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printIntroduction() {
        System.out.println("Hi, my name is " + this.name + " and I am " + this.age + " years old.");
    }
}
