package CreationalDesignPattern.StrategyPattern;

import CreationalDesignPattern.StrategyPattern.ConcreteClasses.PirateSpeakingBehavior;
import CreationalDesignPattern.StrategyPattern.ConcreteClasses.RepeatSpeakingBehavior;
import CreationalDesignPattern.StrategyPattern.ConcreteClasses.SarcasticSpeakingBehavior;

public class TalkingParrotSimulator {
    public static void main(String[] args) {
        Parrot parrot = new Parrot(new RepeatSpeakingBehavior());

        System.out.println("Normal Parrot:");
        parrot.speak("Hello!");

        System.out.println("\nPirate Parrot:");
        parrot.setSpeakingBehavior(new PirateSpeakingBehavior());
        parrot.speak("Hello!");

        System.out.println("\nSarcastic Parrot:");
        parrot.setSpeakingBehavior(new SarcasticSpeakingBehavior());
        parrot.speak("Hello!");
    }
}
