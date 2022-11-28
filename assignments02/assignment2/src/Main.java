public class Main {
    public static void main(String[] args) {
        Person ciro = new Person("Ciro", 3);
        Person mateo = new Person("Mateo", 10);
        Person thiago = new Person("Thiago", 63);

        Zoo zoo = new Zoo();

        System.out.println(zoo.calculatePrice(ciro));
        System.out.println(zoo.calculatePrice(mateo));
        System.out.println(zoo.calculatePrice(thiago));
    }
}