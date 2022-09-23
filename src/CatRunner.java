public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Sesame", 7, 38.8);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Peanut", 2, 15.2);
        cat2.introduce();
        cat2.printCatInfo();
    }
}
