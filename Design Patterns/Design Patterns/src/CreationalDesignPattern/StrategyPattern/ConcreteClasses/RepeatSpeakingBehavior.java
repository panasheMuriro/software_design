package CreationalDesignPattern.StrategyPattern.ConcreteClasses;
import CreationalDesignPattern.StrategyPattern.SpeakingBehavior;

// A simple parrot that repeats exactly
public class RepeatSpeakingBehavior implements SpeakingBehavior {
    @Override
    public String speak(String phrase) {
        return phrase; // Repeats exactly
    }
}





