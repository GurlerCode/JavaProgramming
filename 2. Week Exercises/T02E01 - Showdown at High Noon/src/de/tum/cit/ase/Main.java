package de.tum.cit.ase;

import java.util.Scanner;

public class Main {
    //TODO PART 1.1: Create the Seal class according to the UML diagram
    //TODO PART 1.2: Create the Interrogator class according to the UML diagram
    //TODO PART 1.3: Create the InterrogationRoom class according to the UML diagram
    //TODO PART 1.4: Implement the method interrogate(Seal ella, Seal jack) within the InterrogationRoom class
    //TODO PART 2: Implement the method interrogatorUsesTactics(Seal ella, Seal jack) within the InterrogationRoom class
    public static void main(String[] args) {
        // TODO PART 1 WITHOUT INTERROGATOR TACTICS
         Scanner scanner = new Scanner(System.in);
         Seal ella = new Seal("Ella");
         Seal jack = new Seal("Jack");

        // Print a welcome message
         System.out.println("Welcome to the Showdown at High Noon");

        // Ask from Ella
         System.out.println("Ella, do you want to betray Jack or be silent?");
         String choiceElla = scanner.nextLine();
         while (!choiceElla.equals("Betray") && !choiceElla.equals("Silent")) {
        	choiceElla = scanner.nextLine();
         }
         ella.setChoice(choiceElla);
        System.out.println("Ella chose to " + turnChoiceIntoSentence(choiceElla) + ": " + choiceElla);

        // Ask from Jack
         System.out.println("Jack, do you want to betray Ella or be silent?");
         String choiceJack = scanner.nextLine();
         while (!choiceJack.equals("Betray") && !choiceJack.equals("Silent")) {
         	choiceJack = scanner.nextLine();
         }
         jack.setChoice(choiceJack);
         System.out.println("Jack chose to " + turnChoiceIntoSentence(choiceJack) + ": " + choiceJack);

        // Interrogator interrogates Ella and Jack
         Interrogator interrogator = new Interrogator("Clint Eastwood");
         InterrogationRoom interrogationRoom = new InterrogationRoom(interrogator);


        // TODO: PART 2 WITH INTERROGATOR TACTICS
        // Interrogator decides the employ tactics during the interrogation
        if (ella.getChoice().equals("Betray") && jack.getChoice().equals("Betray")) {
         	System.out.println("Interrogator is happy with the result and decides not to use tactics.");
        	return;
         } else {
        	System.out.println("Interrogator was not so happy with the result and decides to use tactics.");
            interrogator.setTactic("Offer deal"); // Or "Aggressive", depending on the scenario
         }

        // Ask Ella if she wants to change her choice
         System.out.println("Ella, would you like to change your choice? (Y/N)");
         String changeChoiceElla = scanner.nextLine();
         while (!changeChoiceElla.equals("Y") && !changeChoiceElla.equals("N")) {
         System.out.println("Please enter 'Y' to change your choice or 'N' to keep it");
        	changeChoiceElla = scanner.nextLine();
         }

         // if Ella chooses to change, her choice is toggled
         if (changeChoiceElla.equals("Y")) {
        	ella.setChoice(changeChoiceIfYes(ella.getChoice()));
         }

        // Ask Jack if he wants to change his choice
        System.out.println("Jack, would you like to change your choice? (Y/N)");
        String changeChoiceJack = scanner.nextLine();
         while (!changeChoiceJack.equals("Y") && !changeChoiceJack.equals(("N"))) {
            System.out.println("Please enter 'Y' to change your choice or 'N' to keep it.");
            changeChoiceJack = scanner.nextLine();
        }

        // If Jack chooses to change, his choice is toggled
        if (changeChoiceJack.equals("Y")) {
            jack.setChoice(changeChoiceIfYes(jack.getChoice()));
        }

        // Interrogator uses tactics to change the prison time
         interrogationRoom.interrogate(ella, jack);
         interrogationRoom.interrogatorUsesTactics(ella, jack);

        // Ella chooses again
         System.out.println("Ella chose to " + turnChoiceIntoSentence(ella.getChoice()) + ": " + ella.getChoice());

        //Jack chooses again
         System.out.println("Jack chose to " + turnChoiceIntoSentence(jack.getChoice()) + ": " + jack.getChoice());

         System.out.println("Interrogator " + interrogator.getName() + " employs " + (interrogator.getTactic().equals("O") ? "offer deal" : "aggressive") + " tactic.");

         System.out.println("After the interrogation with tactics Ella gets " + ella.getPrisonTime() + " years and Jack gets " + jack.getPrisonTime() + " years in prison.");

    }


    private static String turnChoiceIntoSentence(String choice) {
        if (choice.equals("Betray")) {
            return "betray";
        }
        return "be silent";
    }

    public static String changeChoiceIfYes(String choiceElla) {
        System.out.println("Toggling choice for: " + choiceElla);
        if (choiceElla.equals("Betray")) {
            return "Silent";
        }
        return "Betray";
    }


}