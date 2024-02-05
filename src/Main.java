import model.*;
import model.enums.CipsType;
import model.enums.DrinkType;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic","Normal",54, "Wrap");
        hamburger.addAddition("Tomato", 0.27);

        hamburger.addAddition("Lettuce", 0.75);

        hamburger.addAddition("Cheese", 1.13);

        hamburger.itemizeHamburger();

        HealthyBurger healthyBurger = new HealthyBurger("Vegan Burger", 5.67, "Sandwich");

        healthyBurger.addAddition("Egg", 5.43);

        healthyBurger.addAddition("Lentils", 3.41);

        healthyBurger.itemizeHamburger();
        DeluxeBurger db = new DeluxeBurger(new Drink(DrinkType.COKE), new Cips(CipsType.SPICY));

        db.addAddition("Should not do this", 50.53);

        db.itemizeHamburger();


    }
    }
