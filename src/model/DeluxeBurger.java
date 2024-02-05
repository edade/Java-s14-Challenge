package model;

public class DeluxeBurger extends Hamburger {

    private  Drink drink;
    private  Cips cips;

    public DeluxeBurger(Drink drink, Cips cips) {
        super("DELUXE BURGER ", "double", 10.10, "XL");
        this.drink = drink;
        this.cips = cips;
    }

    @Override
    public void addAddition(String name, double price) {
        System.out.println("Ek malzeme eklenemez. ");
    }

    @Override
    public void itemizeHamburger() {
        StringBuilder builder = new StringBuilder();
        builder.append("drink " + drink.getDrinkType());
        builder.append("cips " + cips.getCips());
        System.out.println(builder);
        super.itemizeHamburger();

    }
}