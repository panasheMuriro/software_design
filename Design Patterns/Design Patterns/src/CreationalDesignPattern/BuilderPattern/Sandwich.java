package CreationalDesignPattern.BuilderPattern;

public class Sandwich {
    private String bread;
    private String protein;
    private String cheese;
    private String sauce;
    private String extras;

    // Private constructor to enforce the Builder pattern
    private Sandwich(SandwichBuilder builder) {
        this.bread = builder.bread;
        this.protein = builder.protein;
        this.cheese = builder.cheese;
        this.sauce = builder.sauce;
        this.extras = builder.extras;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "bread='" + bread + '\'' +
                ", protein='" + protein + '\'' +
                ", cheese='" + cheese + '\'' +
                ", sauce='" + sauce + '\'' +
                ", extras='" + extras + '\'' +
                '}';
    }

    // Nested static Builder class
    public static class SandwichBuilder {
        private String bread;
        private String protein;
        private String cheese;
        private String sauce;
        private String extras;

        public SandwichBuilder setBread(String bread) {
            this.bread = bread;
            return this;
        }

        public SandwichBuilder setProtein(String protein) {
            this.protein = protein;
            return this;
        }

        public SandwichBuilder setCheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public SandwichBuilder setSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public SandwichBuilder setExtras(String extras) {
            this.extras = extras;
            return this;
        }

        public Sandwich build() {
            return new Sandwich(this);
        }
    }
}
