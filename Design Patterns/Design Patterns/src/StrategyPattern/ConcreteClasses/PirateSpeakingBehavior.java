package StrategyPattern.ConcreteClasses;
import StrategyPattern.SpeakingBehavior;

public class PirateSpeakingBehavior implements SpeakingBehavior {
    @Override
    public String speak(String phrase) {
        return phrase + " Arrr!";
    }
}