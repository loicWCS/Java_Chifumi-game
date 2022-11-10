 import java.util.Scanner;

public class Chifumi {

    int humanScore = 0;
    int botScore = 0;
    String rock = "pierre";
    String paper = "papier";
    String scissors = "ciseaux";
    int round = 3;
    int playerInput = 0;

// rounds + scanner
    public void roundStart () {
        Scanner input = new Scanner(System.in);

        String humanChoice = null;

        String botChoice = null;
        while (playerInput < 3) {
            System.out.println("Fait ton choix entre pierre, papier ou ciseaux ");
            System.out.print("P1 choisi: ");
            humanChoice = input.nextLine();
            // Affiche le texte saisit par l'utilisateur
            System.out.println(humanChoice);

            // p2
            System.out.print("P2 choisi: ");
            botChoice = input.nextLine();
            System.out.println(botChoice);
            playerInput++;

            if (humanChoice.equals(rock) && botChoice.equals(scissors) || humanChoice.equals(paper) && botChoice.equals(rock) || humanChoice.equals(scissors) && botChoice.equals(paper)) {
                this.humanScore++;
                this.round--;
                System.out.println("human win");
                return;
            }
            if (humanChoice.equals(botChoice)) {
                this.round--;
                System.out.println("Draw");
            } else {
                this.round--;
                this.botScore++;
                System.out.println("bot wins");
            }
        }
    }

    // score
    public void  victoryScore () {
        System.out.println(humanScore+" " +"vs"+ " " +botScore);
    }

    // final score
    public String totalScore() {

        if (this.humanScore > this.botScore) {
            return "Human win the game !";
        }
        if (this.humanScore < this.botScore) {
            return "Bot win the game!";
        } else {
            return "Draw game";
        }
    }
    public void startGame() {

 while (this.round > 0) {
     this.roundStart();
     this.victoryScore();
 }

 System.out.println("Game's finish" + " "+this.totalScore());

    }

}


