
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Tournament {
    
    private ArrayList<Jumper> jumpers;
    private Scanner reader;
    
    public Tournament() {
        
        this.jumpers = new ArrayList<Jumper>();
        this.reader = new Scanner(System.in);
    }
    
    public void start() {
        System.out.println("Kumpula ski jumping week\n");
        
        addParticipants();
        round();
        tournamentResults();
    }
    
    public void addParticipants() {
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        while (true) {
            System.out.print("  Participant name: ");
            String participant = reader.nextLine();
            if (participant.isEmpty()) {
                break;
            } else {
                this.jumpers.add(new Jumper(participant, 0));
            }
        }
    }
    
    public void round() {
        System.out.println("\nThe tournament begins!");
        int round = 1;
        while (true) {
            
            System.out.print("\nWrite \"jump\" to jump; otherwise you quit: ");
            String command = reader.nextLine();
            if (command.equals("quit")) {
                System.out.println("\nThanks!");
                break;
            }
            else if (command.equals("jump")) {
                System.out.println("\nRound " + round);
                Collections.sort(jumpers);
                System.out.println("\nJumping order:");
                for (Jumper jumper : jumpers) {
                    System.out.println("  " + (jumpers.indexOf(jumper) + 1) + ". " + jumper);
                }
                
                System.out.println("\nResults of round " + round);
                for (Jumper jumper : jumpers) {
                    
                    System.out.println("  " + jumper.getName());
                    Jump jump = new Jump();
                    jump.jump();
                    System.out.println(jump);
                    int JL = jump.jumpLength();
                    // jumper.jumpLengths(JL);
                    
                    JudgePoints judgePoints = new JudgePoints();
                    judgePoints.judgePoints();
                    System.out.println(judgePoints);
                    int JP = judgePoints.addPoints();
                    
                    jumper.addPoints(JL + JP);
                    jumper.addJumpLengths(JL);
                }
            }
            round++;
        }
        Collections.reverse(jumpers);
    }
    
    public void tournamentResults() {
        System.out.println("\nTournament results:");
        System.out.println("Position    Name");
        for (Jumper jumper : jumpers) {
            System.out.print(jumpers.indexOf(jumper) + 1);
            System.out.println("           " + jumper);
            System.out.println("            jump lengths: " + jumper.getJumpLengths());
            
        }
    }
}
