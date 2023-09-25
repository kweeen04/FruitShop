import controller.Validate;
import view.FruitShop;

public class Main {
    public static void main(String[] args) {
        FruitShop fruitshop = new FruitShop();
        Validate validation = new Validate();
        fruitshop.generateFruit();
        while (true) {
            System.out.println("1. Create Fruit");
            System.out.println("2. View orders");
            System.out.println("3. Shopping (for buyer)");
            System.out.println("4. Exit");
            int choice = validation.inputInt("Enter selection:", 1, 4);
            switch (choice) {
                case 1:
                    fruitshop.createFruit();
                    break;
                case 2:
                    fruitshop.viewOrder();
                    break;
                case 3:
                    fruitshop.shopping();
                    break;
                case 4:
                    return;
            }
        }
    }

}