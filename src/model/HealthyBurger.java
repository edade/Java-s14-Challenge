package model;

public class HealthyBurger extends Hamburger {
    private Addition healthyAddition1;
  private Addition healtyAddition2;

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);

    }

    public Addition getHealthyAddition1() {
        return healthyAddition1;
    }

    public Addition getHealtyAddition2() {
        return healtyAddition2;
    }

    @Override
    public void addAddition(String name, double price) {
        if(healthyAddition1 ==null){
            healthyAddition1 = new Addition(name,price);
        } else if (healtyAddition2 == null) {
            healtyAddition2 = new Addition(name,price);
        }
    }

    @Override
    public void itemizeHamburger() {
        StringBuilder builder = new StringBuilder();
        if(healthyAddition1 != null){
            builder.append("HealtyAddition1 " +getHealthyAddition1().getName());
            setPrice(getPrice()+getHealthyAddition1().getPrice());
        }
        if(healtyAddition2 != null){
            builder.append("HealthAddition2 " + getHealtyAddition2().getName());
            setPrice(getPrice()+getHealtyAddition2().getPrice());
        }
        System.out.println(builder);
        super.itemizeHamburger();
    }
}
