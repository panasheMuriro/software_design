package CreationalDesignPattern.FactoryPattern;
import CreationalDesignPattern.FactoryPattern.ConcreteClasses.JupiterianPizza;
import CreationalDesignPattern.FactoryPattern.ConcreteClasses.MartianPizza;
import CreationalDesignPattern.FactoryPattern.ConcreteClasses.SaturnianPizza;


public class PizzaFactory {
    public static Pizza createPizza(String alienSpecies) {
        switch (alienSpecies.toLowerCase()) {
            case "martian":
                return new MartianPizza();
            case "jupiterian":
                return new JupiterianPizza();
            case "saturnian":
                return new SaturnianPizza();
            default:
                throw new IllegalArgumentException("Unknown alien species: " + alienSpecies);
        }
    }
}
