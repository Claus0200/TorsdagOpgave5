public class Main {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        cafe.loadMenuData();

        for(String coffee : cafe.coffeeMenu) {
            System.out.println(coffee);
        }
    }
}