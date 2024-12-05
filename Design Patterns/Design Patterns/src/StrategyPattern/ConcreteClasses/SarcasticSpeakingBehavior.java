package StrategyPattern.ConcreteClasses;

import StrategyPattern.SpeakingBehavior;

public class SarcasticSpeakingBehavior implements SpeakingBehavior {
    @Override
    public String speak(String phrase) {
        return phrase.toUpperCase() + " (mocking)";
    }
}