import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        // Set the dimensions of the game board
        int boardWidth = 600;
        int boardHeight = boardWidth;

        // Create the main frame for the game
        JFrame frame = new JFrame("Snake");
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create an instance of SnakeGame and add it to the frame
        SnakeGame snakeGame = new SnakeGame(boardWidth, boardHeight);
        frame.add(snakeGame);
        frame.pack();
        snakeGame.requestFocus();
    }
}
