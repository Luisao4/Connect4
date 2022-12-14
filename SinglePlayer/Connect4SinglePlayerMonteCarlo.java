// Single player Connect 4 against Monte Carlo Tree Search AI

import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Connect4SinglePlayerMonteCarlo {
  public static void main(String[] args) {
    final long GIVEN_TIME = TimeUnit.SECONDS.toNanos(args.length > 0 ? Integer.parseInt(args[0]) : 2);
    Scanner in = new Scanner(System.in);
    Connect4Board board = new Connect4Board();
    boolean turn = Connect4Board.PLAYER_1_TURN;
    Connect4AIMonteCarlo ai = new Connect4AIMonteCarlo(board, GIVEN_TIME);
    while(board.currentGameState() == Connect4Board.ONGOING) {
      System.out.println("\n\n"+board);
      int moveColumn;
      do {
        if(board.getNextTurn() == Connect4Board.PLAYER_1_TURN) {
          System.out.printf("Enter your move: ", board.getNextTurn() == Connect4Board.PLAYER_1_TURN ? 1 : 2);
          moveColumn = in.nextInt()-1;
        }
        else {
          System.out.print("AI determining move: ");
          moveColumn = ai.getOptimalMove();
          System.out.println(moveColumn+1);
        }
        if(!board.canPlace(moveColumn)){
          System.out.println("Invalid Move!");
        }
      } while(!board.canPlace(moveColumn));
      board.place(moveColumn);
      System.out.println("Memória usada:" +ai.memoryUsed+"k");
      System.out.println("Tempo usado:" +ai.totalTime+"ms");
      System.out.println("Nós expandidos:" +ai.expandedNodes);
      ai.update(moveColumn);
    }
    int gameState = board.currentGameState();
    System.out.println("\n\n\n\n\n");
    System.out.println(board);
    switch(gameState) {
      case Connect4Board.PLAYER_1_WON:
        System.out.println("You won.\n");
        break;
      case Connect4Board.PLAYER_2_WON:
        System.out.println("AI won.\n");
        break;
      default:
        System.out.println("Tie.\n");
        break;
    }
  in.close();
  }
}